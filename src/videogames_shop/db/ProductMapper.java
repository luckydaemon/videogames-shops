/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.db;
import videogames_shop.logic.Product;


import java.util.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;



/**
 *
 * @author Леонид
 */
public class ProductMapper { 
    public static final String COLUMNS = "id, product_name, price, caterogy, quantity";
    private Map <Integer, Product> loadedMap = new HashMap<>();
    private Connection connection;
    
    public ProductMapper() throws SQLException
    {
        this.loadedMap = new HashMap<>();
        connection = db_utils.getInstance().getDataSource().getConnection();
    }
    public void addProduct(Product product) throws SQLException {
        if (loadedMap.values().contains(product)) {
            update(product);
        } else {
            String insertSQL = "INSERT INTO product(product_name, price, caterogy, quantity) VALUES (?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setFloat(2, product.getProductPrice());
            preparedStatement.setString(3, product.getCategory());
            preparedStatement.setInt(4, product.getProductQuantity());
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()) {
                product.setProductID(resultSet.getInt(1));
            }

            loadedMap.put(product.getProductID(), product);
        }
    }
    public void update(Product product) throws SQLException {
        if (loadedMap.values().contains(product)) {
            String updateSQL  = "UPDATE product product_name = ?, price = ?, caterogy = ?, quantity = ? WHERE id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setFloat(2, product.getProductPrice());
            preparedStatement.setString(3, product.getCategory());
            preparedStatement.setInt(4, product.getProductQuantity());
            preparedStatement.setInt(5, product.getProductID());
            preparedStatement.execute();

            loadedMap.replace(product.getProductID(), product);
        } else {
            addProduct(product);
        }
    }
    public void update() throws SQLException {
        for (Product product : loadedMap.values())
            update(product);
    }
    public Product findProductbyID(int id) throws SQLException {
        for (Product loadedProduct : loadedMap.values()) {
            if (loadedProduct.getProductID()== id)
                return loadedProduct;
        }
        String selectSQL = "SELECT * FROM product WHERE id = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (!resultSet.next()) return null;
        String product_name = resultSet.getString("product_name");
        Float price = resultSet.getFloat("price");
        String cat = resultSet.getString("category");
        int quantity = resultSet.getInt("quantity");
        Product newProduct = new Product(product_name,cat, id,  price,quantity);
        loadedMap.put(id, newProduct);
        return newProduct;
    }
    public void closeConnection() throws SQLException {
        connection.close();
    }
     public void clear() {
        loadedMap.clear();
    }

}

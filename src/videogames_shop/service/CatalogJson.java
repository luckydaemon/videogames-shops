/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import videogames_shop.db.ProductMapper;
import org.json.*;
import videogames_shop.logic.Product;

/**
 *
 * @author Леонид
 */
public class CatalogJson {
    
    public static JSONObject sampleObject = new JSONObject();
    
    public  static JSONObject createJsonSimple() throws SQLException {  
            ProductMapper map;
            JSONObject Object = new JSONObject();
            map = new  ProductMapper();
            int id = 1;
            Product  product;

            while (!((product = map.findProductbyID(id)) == null))
                {       
                        String data1 = Integer.toString(product.getProductID());
                        String data2 = product.getProductName();
                        String data3 = Float.toString(product.getProductPrice());
                        String data4 = product.getCategory();
                        String data5 = Integer.toString(product.getProductQuantity());
                        Object.put(data1, new ArrayList<>( Arrays.asList(data2,data3,data4,data5)));
                        id++;
                
                }
            return Object;
    }
    //this is for test
    public static void writeJsonSimpleDemo(String filename) throws IOException, SQLException
    {   
        sampleObject = createJsonSimple();
        Files.write(Paths.get(filename), sampleObject.toString().getBytes());
    }
    
    
    public static void main(String[] args) throws Exception
        {
            writeJsonSimpleDemo("D:/test.json");
        }
    
    
}

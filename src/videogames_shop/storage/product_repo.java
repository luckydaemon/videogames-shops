package videogames_shop.storage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import videogames_shop.logic.Product;
/**
 *
 * @author Леонид
 */
public class product_repo {
    private static product_repo instance;
    private ArrayList<Product> Products  =  new ArrayList<>();
    private product_repo(){}
    public static product_repo getInstance()
    { 
        if(instance == null)		
            instance = new product_repo();
        return instance;		
    }
    
    public void addProduct(Product product)
        {
            Products.add(product);
        }
    public void decreaseQuantityProduct(Product product)
        {
            product.setProductQuantity(product.getProductQuantity()-1);
        }
    public void increaseQuantityProduct(Product product)
        {
            product.setProductQuantity(product.getProductQuantity()+1);
        }
    public ArrayList<Product> getProducts() 
    {
        return Products;
    }
}

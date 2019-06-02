/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.logic;


public class Product {
    
    private String Product_Name;
    private int id;
    private float price;
    private String category;
     private int quantity;
    
    public Product (String Name,String category, int id, float price,int quantity)
        {
            this.Product_Name = Name;
            this.id = id;
            this.price = price;
            this.category = category;
            this.quantity = quantity;
        }
            
    public String getProductName()
        {
            return Product_Name;
        }
    public void setProductName(String Product_Name)
        {
            this.Product_Name = Product_Name;
        }
    public int getProductID()
        {
            return id;
        }
    public void setProductID(int id)
        {
            this.id = id;
        }
    public float getProductPrice()
        {
            return price;
        }
    public void setProductPrice(float price)
        {
            this.price = price;
        }
    public int getProductQuantity()
        {
            return quantity;
        }
    public void setProductQuantity(int quantity)
        {
            this.quantity = quantity;
        }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.logic;
import java.util.ArrayList;

enum Order_Status
{
    AwaitConfirmationOfProductExistion,
    AwaitConfirmationFromCustomer,
    AwaitMoneyTransfer,
    ProductGivenAway,
    Closed
}


public class Order 
{
    private int id;
    private float Cost;
    private ArrayList<Product> ProductList = new ArrayList<Product>();
    private Order_Status Status;
    
    public Order (int id, ArrayList<Product> list)
        {
            this.id=id;
            this.ProductList = list;
            this.Cost = Cost_calc();
            this.Status = Order_Status.AwaitConfirmationOfProductExistion;
        }
    public float Cost_calc()
        {   
            float cost=0;
            for (int i = 0; i < this.ProductList.size(); i++)
                 cost+= this.ProductList.get(i).getProductPrice();
            return cost;
        }  
    public float getOrderCost()
        {
            return Cost;
        }
    public int getOrderId()
        {
            return id;
        }
    public ArrayList<Product> getOrderList()
        {
            return ProductList;
        }
    public void setStatus(Order_Status status)
        {
            Status = status; 
        }
}

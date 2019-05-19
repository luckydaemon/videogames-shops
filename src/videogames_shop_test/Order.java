/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop_test;
import java.util.ArrayList;

enum Order_Status
{
    AwaitConfirmationOfProductExistion,
    AwaitConfirmationFromCustomer,
    AwaitMoneyTransfer,
    MoneyTransferDone,
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
            this.Cost = Cost_calc(list);
            this.ProductList = list;
            this.Status = Order_Status.AwaitConfirmationOfProductExistion;
        }
    public float Cost_calc(ArrayList<Product> list)
        {   
            float cost=0;
            for (int i = 0; i < list.size(); i++)
                 cost+= list.get(i).getProductPrice();
            return cost;
        }  
    public float getOrderCost()
        {
            return Cost;
        }
    public ArrayList<Product> getOrderList()
        {
            return ProductList;
        }
    public void setStatus_confirmExistion()
        {
            Status = Order_Status.AwaitConfirmationFromCustomer;
        }
     public void setStatus_confirmFromCustomer()
        {
            Status = Order_Status.AwaitMoneyTransfer;
        }
      public void setStatus_paid()
        {
            Status = Order_Status.MoneyTransferDone;
        }
      public void setStatus_giveAway()
        {
            Status = Order_Status.ProductGivenAway;
        }
      public void setStatus_close()
        {
            Status = Order_Status.Closed;
        }

}

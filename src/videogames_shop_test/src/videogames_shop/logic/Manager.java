/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.logic;
import videogames_shop.storage.product_repo;
import videogames_shop.storage.exchange_repo;

public class Manager extends User {
    
    public Manager(String FirstName, String SurName,int id)
        {
             super(FirstName,SurName,id);
        }
    public String getFirstName()
            {
                return FirstName;
            }
    public String getSurName()
            {
                return SurName;
            }
    public void setFirstName(String FirstName)
            {
                this.FirstName = FirstName;
            }
     public void setSurName(String SurName)
            {
                this.SurName = SurName;
            }
     public int getID ()
            {
                return id;
            }
    
    public  void setID (int id)
            {
               this.id=id;
            }
    public void confirm_order (Order order)
        {
            order.setStatus_confirmFromCustomer();
        }
    public void give_away_order (Order order)
        {
            order.setStatus_giveAway();
        }
    public void close_order (Order order)
        {
            order.setStatus_close();
        }
    public Exchange_process start_exchange ()
        {
            return new Exchange_process( exchange_repo.getInstance().getLastExchangeId());
        }
    public void CloseExchange (Exchange_process exchange, Product product)
        {   
             product_repo.getInstance().decreaseQuantityProduct(product);
             exchange.SetClosed();
        }
}

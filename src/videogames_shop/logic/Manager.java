/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.logic;

import videogames_shop.storage.product_repo;
import videogames_shop.storage.exchange_repo;


public class Manager extends User {
    
    public Manager(String FirstName, String SurName,int id,String pass)
        {
             super(FirstName,SurName,id,pass);
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
     public  String getPass ()
        {
            return password;
        }
    
    public  void setPass (String pass)
        {
            this.password=pass;
        }
    
    public void confirm_order (Order order)
        {
            order.setStatus(Order_Status.AwaitMoneyTransfer);
        }
    public void give_away_order (Order order)
        {
            order.setStatus(Order_Status.ProductGivenAway);
        }
    public void close_order (Order order)
        {
            order.setStatus(Order_Status.Closed);
        }
    public Exchange_process start_exchange ()
        {
            return new Exchange_process( exchange_repo.getInstance().getLastExchangeId());
        }
    public void CloseExchange (Exchange_process exchange, Product product)
        {   
             product_repo.getInstance().decreaseQuantityProduct(product);
             exchange.SetStatus(Exchange_Status.Closed);
        }
}

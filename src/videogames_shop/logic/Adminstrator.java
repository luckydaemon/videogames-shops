/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.logic;


public class Adminstrator extends User 
{
    public Adminstrator (String FirstName, String SurName,int id)
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
    public void ConfirmExistanceOfProducts(Order order)
        {
            order.setStatus_confirmExistion();
        }
    public void ExchangeProductTesting(Exchange_process exchange)
        {
           exchange.SetStatusTesting();
        }
    public void ExchangeWorkingStatus(Exchange_process exchange, boolean status)
        {
            exchange.SetWorkingStatus(status);
        }
    public void ExchangeCategory(Exchange_process exchange, String category)
        {
            exchange.SetCategory(category);
        }
    public void ExchangeCost(Exchange_process exchange, float cost)
        {
            exchange.SetCost(cost);
        }
    public void SetAwaitStatus(Exchange_process exchange)
        {
            exchange.SetAwaitGameExchange();
        }
    
}

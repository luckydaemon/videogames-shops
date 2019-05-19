/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop_test;
import java.util.ArrayList;



public class Client extends User 
{   
    
    private String TeleNumber;
    private String Email;
    
    public Client (String FirstName, String SurName,int id, String TeleNumber, String Email)
           {    
              super(FirstName,SurName,id);
              this.TeleNumber = TeleNumber;
              this.Email = Email;
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
     public String getTNumber()
            {
                return TeleNumber;
            }
    public void setTNumber(String TNumber)
            {
                this.TeleNumber = TNumber;
            }
    public String getEmail()
            {
                return Email;
            }
    public void setEmail(String Email)
            {
                this.Email = Email;
            }
    
    public int getID ()
            {
                return id;
            }
    
    public  void setID (int id)
            {
               this.id=id;
            }
    
    public Order CreateOrder (ArrayList<Product> list)
            {   
                int id = DB_usage.getLastOrderId();
                return new Order(id, list);
            }
    public void payForOrder(Order order)
            {
                order.setStatus_paid();
            }
}

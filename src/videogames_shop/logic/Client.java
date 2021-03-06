/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.logic;
import java.util.ArrayList;
import videogames_shop.storage.order_repo;


public class Client extends User 
{   
    
    private String TeleNumber;
    private String Email;
    
    public Client (String FirstName, String SurName,int id, String TeleNumber, String Email, String pass)
           {    
              super(FirstName,SurName,id,pass);
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
     public  String getPass ()
        {
            return password;
        }
    
    public  void setPass (String pass)
        {
            this.password=pass;
        }
    
    public Order CreateOrder (ArrayList<Product> list)
            {   
                int id = order_repo.getInstance().getLastOrderId();
                return new Order(id, list);
            }
}

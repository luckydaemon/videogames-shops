/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.logic;


public abstract class User 
{ 
    String FirstName;
    String SurName;
    int id;
    String password;
    public User (String FirstName, String SurName, int id, String password)
            {
                this.FirstName = FirstName;
                this.SurName = SurName;
                this.id=id;
                this.password=password;
            }
    public abstract String getFirstName();

    public abstract String getSurName();
    
    public abstract void setFirstName(String FirstName);
 
    public abstract void setSurName(String SurName);
    
    public abstract int getID ();
    
    public abstract void setID (int id);
    
    public abstract String getPass ();
    
    public abstract void setPass (String pass);

}

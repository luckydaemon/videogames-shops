/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop_test;


public abstract class User 
{ 
    String FirstName;
    String SurName;
    int id;
    public User (String FirstName, String SurName, int id)
            {
                this.FirstName = FirstName;
                this.SurName = SurName;
                this.id=id;
            }
    public abstract String getFirstName();

    public abstract String getSurName();
    
    public abstract void setFirstName(String FirstName);
 
    public abstract void setSurName(String SurName);
    
    public abstract int getID ();
    
    public abstract void setID (int id);

}

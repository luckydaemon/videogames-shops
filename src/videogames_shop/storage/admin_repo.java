/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.storage;

import java.util.ArrayList;
import videogames_shop.logic.Adminstrator;

/**
 *
 * @author Леонид
 */
public class admin_repo {
    private static admin_repo instance;
    private ArrayList<Adminstrator> admins =  new ArrayList<>();
    private admin_repo(){}
    public static admin_repo getInstance()
    { 
        if(instance == null)		
            instance = new admin_repo();
        return instance;		
    }
    
    public void addAdmin(Adminstrator admin)
        {
           admins.add(admin);
        }
    public ArrayList<Adminstrator> getAdmins() 
        {
            return admins;
        }
    public Adminstrator FindAdminstratorById(int id)
            {   
                return admins.get(id-1);
            }
     public Adminstrator FindAdminstratorForLogin(String name, String pass)
            {   
                for (int i = 1; i <=admins.size(); i++)
                {   Adminstrator admin= FindAdminstratorById(i);
                    if ((admin.getFirstName().equals(name)) && (admin.getPass().equals(pass)))
                        {
                            return admin;
                        }
                    i++;
                }
                return null;
            }

    
}

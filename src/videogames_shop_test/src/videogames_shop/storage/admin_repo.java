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
    private ArrayList<Adminstrator> admins;
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

    
}

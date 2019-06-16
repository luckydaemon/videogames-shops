/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.storage;

import java.util.ArrayList;
import videogames_shop.logic.Manager;

/**
 *
 * @author Леонид
 */
public class managaer_repo {
    private static managaer_repo instance;
    private ArrayList<Manager> Managers  =  new ArrayList<>();
    private managaer_repo(){}
    public static managaer_repo getInstance()
    { 
        if(instance == null)		
            instance = new managaer_repo();
        return instance;		
    }
    
    public void addManager(Manager manager)
        {
           Managers.add(manager);
        }
        public ArrayList<Manager> getManagers() 
    {
        return Managers;
    }

    
}

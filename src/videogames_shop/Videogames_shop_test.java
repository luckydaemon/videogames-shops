/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop;
import GUI.User_Chose;
import java.util.ArrayList;

import videogames_shop.logic.Adminstrator;
import videogames_shop.logic.Manager;
import videogames_shop.logic.Order;
import videogames_shop.logic.Product;
import videogames_shop.storage.exchange_repo;
import videogames_shop.storage.managaer_repo;
import videogames_shop.storage.RepoInit;

public class Videogames_shop_test {

   

    
    public  static void main(String[] args) {
        
        RepoInit.orderrep.addOrder(new Order(1, new ArrayList<>()));
        RepoInit.adrep.addAdmin(new Adminstrator("fname1", "sname1", 1, "123"));
        RepoInit.adrep.addAdmin(new Adminstrator("fname2", "sname2", 2, "1234"));
        RepoInit.adrep.addAdmin(new Adminstrator("fname2", "sname3", 3, "12345"));
        RepoInit.manrep.addManager(new Manager("fname1", "sname1", 1, "123"));
        RepoInit.manrep.addManager(new Manager("fname2", "sname2", 2, "1234"));
        RepoInit.manrep.addManager(new Manager("fname2", "sname3", 3, "12345"));
        new User_Chose().setVisible(true);
    }
    
}


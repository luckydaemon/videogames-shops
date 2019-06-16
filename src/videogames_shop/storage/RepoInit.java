/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.storage;

import java.util.ArrayList;
import videogames_shop.Videogames_shop_test;
import videogames_shop.logic.Adminstrator;
import videogames_shop.logic.Order;
import videogames_shop.storage.admin_repo;
import videogames_shop.storage.order_repo;
import videogames_shop.storage.exchange_repo;
import videogames_shop.storage.managaer_repo;
/**
 *
 * @author Леонид
 */
public class RepoInit {
    
    public static admin_repo adrep = admin_repo.getInstance();
    public static order_repo orderrep = order_repo.getInstance();
    public static exchange_repo exrep = exchange_repo.getInstance();
    public static managaer_repo manrep = managaer_repo.getInstance();      
}

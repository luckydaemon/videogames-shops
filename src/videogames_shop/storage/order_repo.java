/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.storage;

import java.util.ArrayList;
import videogames_shop.logic.Order;

/**
 *
 * @author Леонид
 */
public class order_repo {
        private static order_repo instance;
    private ArrayList<Order> orders  =  new ArrayList<>();
    private order_repo(){}
    public static order_repo getInstance()
    { 
        if(instance == null)		
            instance = new order_repo();
        return instance;		
    }
    
    public void addOrder(Order order)
        {
            orders.add(order);
        }
    public ArrayList<Order> getOrders() 
    {
        return  orders;
    }
    public  int getLastOrderId()
               {
                   return  orders.size();
               } 
    public Order FindOrderById(int id)
            {   
                return orders.get(id-1);
            }


    
}

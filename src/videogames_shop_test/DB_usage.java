/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop_test;
import java.util.ArrayList;


public class DB_usage  //mock functions
{
    public static int getLastOrderId()
               {
                   int id=0;
                   return id;
               } 
     public static Order FindOrderById(int id)
            {   
                ArrayList<Product> arrlist = new ArrayList<Product>(5);
                return new Order(id, arrlist);
            }
}

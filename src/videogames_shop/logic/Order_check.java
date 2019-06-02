/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.logic;
import java.util.ArrayList;
import videogames_shop.storage.order_repo;


public class Order_check {
    
    private int order_id;
    private float Cost;
    private ArrayList<Product> ProductList = new ArrayList<Product>();   
    public Order_check(int id)
        {   
            Order order_check_out = order_repo.getInstance().FindOrderById(id);
            this.order_id=id;
            this.Cost = order_check_out.getOrderCost();
            this.ProductList = order_check_out.getOrderList();
        }
    
}

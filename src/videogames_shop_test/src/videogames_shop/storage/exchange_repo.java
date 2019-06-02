/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.storage;

import java.util.ArrayList;
import videogames_shop.logic.Exchange_process;
/**
 *
 * @author Леонид
 */
public class exchange_repo {
    private static exchange_repo instance;
    private ArrayList<Exchange_process> exchanges;
    private exchange_repo(){}
    public static exchange_repo getInstance()
    { 
        if(instance == null)		
            instance = new exchange_repo();
        return instance;		
    }
    
    public void addExchange(Exchange_process exchange)
        {
           exchanges.add( exchange);
        }
        public ArrayList<Exchange_process> getExchanges() 
    {
        return exchanges;
    }
        public int getLastExchangeId()
               {
                   Exchange_process lastorder = exchanges.get(exchanges.size() - 1);
                   return  lastorder.getId();
               }
    
}

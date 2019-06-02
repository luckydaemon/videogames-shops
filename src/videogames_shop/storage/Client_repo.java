/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.storage;

import java.util.ArrayList;
import videogames_shop.logic.Client;

/**
 *
 * @author Леонид
 */
public class Client_repo {
    private static Client_repo instance;
    private ArrayList<Client> Clients;
    private Client_repo(){}
    public static Client_repo getInstance()
    { 
        if(instance == null)		
            instance = new Client_repo();
        return instance;		
    }
    
    public void addClient(Client client)
        {
           Clients.add(client);
        }
        public ArrayList<Client> getClients() 
    {
        return Clients;
    }
 
}

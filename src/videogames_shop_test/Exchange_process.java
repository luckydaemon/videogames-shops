/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop_test;
enum Exchange_Status
{
    ProductRecevied,
    ProductTesting,
    ProductWorking,
    AwaitGameExchange,
    Closed
}

public class Exchange_process {
    
    int id;
    Exchange_Status Status;
    float cost;
    
}

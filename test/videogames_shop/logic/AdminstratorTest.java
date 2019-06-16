/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames_shop.logic;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
//import org.junit.*;

/*import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*/

/**
 *
 * @author Леонид
 */
public class AdminstratorTest {
    
    public AdminstratorTest() {
    }
    


    /**
     * Test of getFirstName method, of class Adminstrator.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Adminstrator instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getSurName method, of class Adminstrator.
     */
    @Test
    public void testGetSurName() {
        System.out.println("getSurName");
        Adminstrator instance = null;
        String expResult = "";
        String result = instance.getSurName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Adminstrator.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String FirstName = "Leo";
        Adminstrator instance = null;
        instance.setFirstName(FirstName);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setSurName method, of class Adminstrator.
     */
    @Test
    public void testSetSurName() {
        System.out.println("setSurName");
        String SurName = "Bars";
        Adminstrator instance = null;
        instance.setSurName(SurName);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Adminstrator.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Adminstrator instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Adminstrator.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int id = 1;
        Adminstrator instance = null;
        instance.setID(id);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getPass method, of class Adminstrator.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        Adminstrator instance = null;
        String expResult = "";
        String result = instance.getPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setPass method, of class Adminstrator.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "admin";
        Adminstrator instance = null;
        instance.setPass(pass);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ConfirmExistanceOfProducts method, of class Adminstrator.
     */
    @Test
    public void testConfirmExistanceOfProducts() {
        System.out.println("ConfirmExistanceOfProducts");
        Order order = null;
        Adminstrator instance = null;
        instance.ConfirmExistanceOfProducts(order);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ExchangeProductTesting method, of class Adminstrator.
     */
    @Test
    public void testExchangeProductTesting() {
        System.out.println("ExchangeProductTesting");
        Exchange_process exchange = null;
        Adminstrator instance = null;
        instance.ExchangeProductTesting(exchange);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ExchangeWorkingStatus method, of class Adminstrator.
     */
    @Test
    public void testExchangeWorkingStatus() {
        System.out.println("ExchangeWorkingStatus");
        Exchange_process exchange = null;
        boolean status = false;
        Adminstrator instance = null;
        instance.ExchangeWorkingStatus(exchange, status);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ExchangeCategory method, of class Adminstrator.
     */
    @Test
    public void testExchangeCategory() {
        System.out.println("ExchangeCategory");
        Exchange_process exchange = null;
        String category = "";
        Adminstrator instance = null;
        instance.ExchangeCategory(exchange, category);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of ExchangeCost method, of class Adminstrator.
     */
    @Test
    public void testExchangeCost() {
        System.out.println("ExchangeCost");
        Exchange_process exchange = null;
        float cost = 0.0F;
        Adminstrator instance = null;
        instance.ExchangeCost(exchange, cost);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of SetAwaitStatus method, of class Adminstrator.
     */
    @Test
    public void testSetAwaitStatus() {
        System.out.println("SetAwaitStatus");
        Exchange_process exchange = null;
        Adminstrator instance = null;
        instance.SetAwaitStatus(exchange);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.newport.ac.uk;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eyoka
 */
public class ItemTest {
    
    public ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getItemName method, of class Item.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        Item instance = new Item("Sword");
        String expResult = "Sword";
        String result = instance.getItemName();
        assertEquals(expResult, result);
        
        Item instance2 = new Item("Lamp");
        String expResult2 = "Lamp";
        String result2 = instance2.getItemName();
        assertEquals(expResult2, result2);
        
        Item instance3 = new Item("Dragon");
        String expResult3 = "Dragon";
        String result3 = instance3.getItemName();
        assertEquals(expResult3, result3);
    }
}
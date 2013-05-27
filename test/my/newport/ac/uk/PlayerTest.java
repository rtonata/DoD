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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getLives method, of class Player.
     */
    @Test
    public void testGetLives() {
        System.out.println("getLives");
         Location bb = new Location("Babbling Brook", "by a babbling brook", null);
        Player instance = new Player(bb,3);
        int expResult = 3;
        int result = instance.getLives();
        assertEquals(expResult, result);
    }

    /**
     * Test of decreaseLives method, of class Player.
     */
    @Test
    public void testDecreaseLives() {
        System.out.println("decreaseLives");
        Location bb = new Location("Babbling Brook", "by a babbling brook", null);
        Player instance = new Player(bb,3);
        instance.decreaseLives();
        assertEquals(2, instance.getLives());
    }
}
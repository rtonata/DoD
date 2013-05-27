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
public class WorldTest {
    
    public WorldTest() {
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

    @Test
    public void testSomeMethod() {
        World world = new World();
        //Creates a new instance object of player/avatar at location with 3 lives
        Player player = new Player(world.locations.get(0), 3);
        
        //Start location description
        String startLocationDesc = player.location.desc;
        assertEquals(startLocationDesc, "by a babbling brook");      
    }
}
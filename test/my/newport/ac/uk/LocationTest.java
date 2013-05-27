/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.newport.ac.uk;

import java.util.ArrayList;
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
public class LocationTest {

    public LocationTest() {
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
     * Test of setExits method, of class Location.
     */
    @Test
    public void testSetExits() {
        System.out.println("setExits");
        ArrayList<Item> sword = new ArrayList<>();
        ArrayList<Item> lamp = new ArrayList<>();
        ArrayList<Item> dragon = new ArrayList<>();
        sword.add(new Item("Sword"));
        lamp.add(new Item("Lamp"));
        dragon.add(new Item("Dragon"));

        Location bb = new Location("Babbling Brook", "by a babbling brook", sword);
        Location hc = new Location("High Cliffs", "on top of some high cliffs", lamp);
        Location dc = new Location("Dragon's Cave", "in the cave of Gwent the dragon", dragon);
        Location sf = new Location("Sunny Field", "in a sunny field", null);
        Location mm = new Location("Misty Mountains", "up in some misty mountains", null);
        Location lb = new Location("Lonely Beach", "on a lonely beach", null);
        Location go = new Location("Great Oak", "by a great oak", null);

        bb.setExits(sf, mm, null, null);
        hc.setExits(null, lb, go, null);
        dc.setExits(null, null, null, mm);

        Player player = new Player(bb, 3);//Default Location is Babbling Brook

        String navigate = "South";
        //If player navigates to the South, the system should return a NULL
        //value becasue there is no exit to the south of Babbling Brook
        if (navigate.equals("South")) {
            player.location = player.location.south;
            //Asserts that an object (South of babbling brook) is null
            assertNull(player.location);
        }
        player = new Player(bb, 3);//Default Location is Babbling Brook
        navigate = "North";
        //If player navigates to the North, then the new location should be
        //Sunny Field
        if (navigate.equals("North")) {
            player.location = player.location.north;
            //Asserts that two objects (The new player location and the set player location) are equal
            assertEquals(player.location, sf);
        }

        player = new Player(bb, 3);//Default Location is Babbling Brook
        navigate = "East";
        //If player navigates to the East, then the new location should be
        //Misty Mountains
        if (navigate.equals("East")) {
            player.location = player.location.east;
            //Asserts that two objects (The new player location and the set player location) are equal
            assertEquals(player.location, mm);
        }

        player = new Player(bb, 3);//Default Location is Babbling Brook
        navigate = "West";
        //If player navigates to the East, then the new location should be
        //Misty Mountains
        if (navigate.equals("West")) {
            player.location = player.location.west;
            //Asserts that two objects (The new player location and the set player location) are equal
            assertNull(player.location);
        }
    }

    /**
     * Test of getItems method, of class Location.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        ArrayList<Item> sword = new ArrayList<>();
        ArrayList<Item> lamp = new ArrayList<>();
        ArrayList<Item> dragon = new ArrayList<>();
        sword.add(new Item("Sword"));
        lamp.add(new Item("Lamp"));
        dragon.add(new Item("Dragon"));

        Location bb = new Location("Babbling Brook", "by a babbling brook", sword);
        Location hc = new Location("High Cliffs", "on top of some high cliffs", lamp);
        Location dc = new Location("Dragon's Cave", "in the cave of Gwent the dragon", dragon);

        //Test for sword item
        ArrayList<Item> expResult1 = sword;
        ArrayList<Item> result1 = bb.getItems();
        assertEquals(expResult1, result1);

        //test for lamp item
        ArrayList<Item> expResult2 = lamp;
        ArrayList<Item> result2 = hc.getItems();
        assertEquals(expResult2, result2);

        //Test for dragon item
        ArrayList<Item> expResult3 = dragon;
        ArrayList<Item> result3 = dc.getItems();
        assertEquals(expResult3, result3);

    }

    /**
     * Test of setItems method, of class Location.
     */
    @Test
    public void testSetItems() {
        System.out.println("setItems");
        String itemName1 = "Sword";
        String itemName2 = "Lamp";
        String itemName3 = "Dragon";

        ArrayList<Item> sword = new ArrayList<>();
        ArrayList<Item> lamp = new ArrayList<>();
        ArrayList<Item> dragon = new ArrayList<>();

        //Create new instance objects for locations
        Location bb = new Location("Babbling Brook", "by a babbling brook", sword);
        Location hc = new Location("High Cliffs", "on top of some high cliffs", lamp);
        Location dc = new Location("Dragon's Cave", "in the cave of Gwent the dragon", dragon);

        //Test for setting the sword item
        bb.setItems(itemName1);
        assertEquals(bb.getItems().get(0).getItemName(), itemName1);

        //Test for setting the lamp item
        hc.setItems(itemName2);
        assertEquals(hc.getItems().get(0).getItemName(), itemName2);

        //Test for setting the dragon item
        dc.setItems(itemName3);
        assertEquals(dc.getItems().get(0).getItemName(), itemName3);
    }

    /**
     * Test of getLocationName method, of class Location.
     */
    @Test
    public void testGetLocationName() {
        System.out.println("getLocationName");
        ArrayList<Item> sword = new ArrayList<>();
        ArrayList<Item> lamp = new ArrayList<>();
        ArrayList<Item> dragon = new ArrayList<>();
        sword.add(new Item("Sword"));
        lamp.add(new Item("Lamp"));
        dragon.add(new Item("Dragon"));

        Location bb = new Location("Babbling Brook", "by a babbling brook", sword);
        Location hc = new Location("High Cliffs", "on top of some high cliffs", lamp);
        Location dc = new Location("Dragon's Cave", "in the cave of Gwent the dragon", dragon);
        Location sf = new Location("Sunny Field", "in a sunny field", null);
        Location mm = new Location("Misty Mountains", "up in some misty mountains", null);
        Location lb = new Location("Lonely Beach", "on a lonely beach", null);
        Location go = new Location("Great Oak", "by a great oak", null);

        //Test for Babbling Brook
        String expResult1 = "Babbling Brook";
        String result1 = bb.getLocationName();
        assertEquals(expResult1, result1);

         //Test for High Cliffs
        String expResult2 = "High Cliffs";
        String result2 = hc.getLocationName();
        assertEquals(expResult2, result2);

         //Test for Dragon's Cave
        String expResult3 = "Dragon's Cave";
        String result3 = dc.getLocationName();
        assertEquals(expResult3, result3);

         //Test for Sunny Field
        String expResult4 = "Sunny Field";
        String result4 = sf.getLocationName();
        assertEquals(expResult4, result4);

         //Test for Misty Mountains
        String expResult5 = "Misty Mountains";
        String result5 = mm.getLocationName();
        assertEquals(expResult5, result5);

         //Test for Lonely Beach
        String expResult6 = "Lonely Beach";
        String result6 = lb.getLocationName();
        assertEquals(expResult6, result6);

         //Test for Great Oak
        String expResult7 = "Great Oak";
        String result7 = go.getLocationName();
        assertEquals(expResult7, result7);
    }
}
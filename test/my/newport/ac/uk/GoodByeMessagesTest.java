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
public class GoodByeMessagesTest {

    public GoodByeMessagesTest() {
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
     * Test of getGoodByeMessage method, of class GoodByeMessages.
     */
    @Test
    public void testGetGoodByeMessage() {
        System.out.println("getGoodByeMessage");

        GoodByeMessages instance = new GoodByeMessages();

        int index = 0;
        String expResult = "Never, never, never give up.";
        String result = instance.getGoodByeMessage(index);
        assertEquals(expResult, result);

        int index1 = 5;
        String expResult1 = "The reason I never give up hope is because everything is so basically hopeless.";
        String result1 = instance.getGoodByeMessage(index1);
        assertEquals(expResult1, result1);

        int index2 = 10;
        String expResult2 = "Never give in and never give up.";
        String result2 = instance.getGoodByeMessage(index2);
        assertEquals(expResult2, result2);

        int index3 = 15;
        String expResult3 = "Never give up. You only get one life. Go for it!";
        String result3 = instance.getGoodByeMessage(index3);
        assertEquals(expResult3, result3);
    }
}
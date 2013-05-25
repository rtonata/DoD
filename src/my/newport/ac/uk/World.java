/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.newport.ac.uk;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author tdahl01
 */
public class World {

    ArrayList<Location> locations;
    ArrayList<Item> bbItems = new ArrayList<>(); //babbling brook items
    ArrayList<Item> mmItems = new ArrayList<>(); //misty mountains items
    ArrayList<Item> dcItems = new ArrayList<>(); //dragon cave items
    ArrayList<Item> sfItems = new ArrayList<>(); //sunny fields items
    ArrayList<Item> goItems = new ArrayList<>(); //great oak items
    ArrayList<Item> msItems = new ArrayList<>(); //murky marshes items
    ArrayList<Item> trItems = new ArrayList<>(); //tower ruins items
    ArrayList<Item> hcItems = new ArrayList<>(); //high cliffs items
    ArrayList<Item> lbItems = new ArrayList<>(); //lonely beach items

    /**
     * Default constructor. It sets the game in a default state, such as
     * location descriptions and items that are found at different locations
     */
    World() {
        trItems.add(new Item("Sword"));
        hcItems.add(new Item("Lamp"));
        dcItems.add(new Item("Dragon"));
        Location bb = new Location("Babbling Brook","by a babbling brook", bbItems);
        Location mm = new Location("Misty Mountains","up in some misty mountains", mmItems);
        Location dc = new Location("Dragon's Cave","in the cave of Gwent the dragon", dcItems);
        Location sf = new Location("Sunny Field","in a sunny field", sfItems);
        Location go = new Location("Great Oak","by a great oak", goItems);
        Location ms = new Location("Murky Marshes","in some murky marshes", msItems);
        Location tr = new Location("Tower Ruins","in some deserted tower ruins", trItems);
        Location hc = new Location("High Cliffs","on top of some high cliffs", hcItems);
        Location lb = new Location("Lonely Beach","on a lonely beach", lbItems);

        bb.setExits(sf, mm, null, null);
        mm.setExits(go, dc, null, bb);
        dc.setExits(null, null, null, mm);
        sf.setExits(tr, go, bb, null);
        go.setExits(hc, ms, mm, sf);
        ms.setExits(lb, null, null, go);
        tr.setExits(null, null, sf, null);
        hc.setExits(null, lb, go, null);
        lb.setExits(null, null, ms, hc);

        Location[] ls = new Location[]{bb, mm, dc, sf, go, ms, tr, hc, lb};
        locations = new ArrayList(Arrays.asList(ls));
    }
}

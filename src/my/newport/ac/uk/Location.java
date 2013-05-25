package my.newport.ac.uk;

import java.util.ArrayList;

/**
 *
 * @author tdahl01
 */
public class Location {
    
    String desc;//Location description
    String locationName; //Short name of the location
    Location north, east, south, west; //Location exits and directions
    ArrayList<Item> items; //Stores list of items that are at this location
    
    /**
     * Default constructor. Used to create object references to this class
     * @param d the description of the location
     * @param items the items found at this location
     */
    Location(String name, String d, ArrayList<Item> items){
        this.locationName = name;
        desc = d;
        this.items = items;
    }
        
    /**
     * Sets the exits of different locations
     * 
     * @param n north exit
     * @param e east exit
     * @param s south exit
     * @param w west exit
     */
    void setExits(Location n, Location e, Location s, Location w){
        north = n;
        east = e;
        south = s;
        west = w;
    }

    /**
     * Gets the items at the location specified
     * @return the item at this location;
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * Sets the item at the location specified
     * @param items the item at this location
     */
    public void setItems(String itemName) {
        Item item = new Item(itemName);
        this.items.add(item);
    }

    /**
     * Gets the name of the location
     * @return the name of the location
     */
    public String getLocationName() {
        return locationName;
    }
    
    
}
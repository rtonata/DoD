/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.newport.ac.uk;

/**
 * Gets and Sets the items that are found at various locations in the world
 * @author Richard Chambula
 */
public class Item {
    
    private String itemName;//Holds the name of the item

    /**
     * Default constructor 
     * @param itemName the name of the item
     */
    public Item(String itemName) {
        this.itemName = itemName;
    }

    /**
     * Gets the name of the item
     * @return the name of the item
     */
    public String getItemName() {
        return itemName;
    }
    
}

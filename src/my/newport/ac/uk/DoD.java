package my.newport.ac.uk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tdahl01
 */
public class DoD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //This BufferedReader handles navigation related inputs
        java.io.BufferedReader navInput = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        //This BufferedReader handles navigation related inputs
        java.io.BufferedReader actionInput = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        //Holds the items that the player is carrying
        ArrayList<Item> playerItems = new ArrayList<>();
        //Create a new instance of world in a default state
        World world = new World();
        //Creates a new instance object of player/avatar at location with 3 lives
        Player player = new Player(world.locations.get(0), 3);
        GoodByeMessages goodByeMessage = new GoodByeMessages();

        String cmd = "";
        String action = "";
        boolean success = false;
        //Loop through for as long the player does not quit and the number of lives is more than 0
        while (!cmd.equalsIgnoreCase("quit") && (player.getLives() > 0)) {
            System.out.println("You are " + player.location.desc);
            System.out.println("What next?");
            try {
                cmd = navInput.readLine();//Scan in player command
            } catch (java.io.IOException e) {
                System.out.println(e);
            }

            //If the player just wants to take a peek without making a turn or navigating away
            //from current location. The look describes the surrounding of the avatar
            if (cmd.equalsIgnoreCase("look")) {
                //First check if there are any items of this location by checking
                //the size of the array list that holds the items for the location
                if (player.location.getItems().size() > 0) {
                    System.out.println("You see:");
                    //Print all items at this location
                    for (int i = 0; i < player.location.getItems().size(); i++) {
                        System.out.println(player.location.getItems().get(i).getItemName());
                    }
                } else { //if no items at this location
                    System.out.println("There are no items at this location");
                }
            }

            //If the player wants to pick up an item. The take command picks up items
            //from the current location and places this items into the player's hands
            //The item must exist at this location
            if (cmd.equalsIgnoreCase("take")) {
                //First check if there are any items at this location
                if (player.location.getItems().size() > 0) {
                    //loop through all items one by one and ask if player wants to pick this item

                    for (int i = 0; i < player.location.getItems().size(); i++) {
                        System.out.println("Take this? Y/N");
                        System.out.println(player.location.getItems().get(i).getItemName());
                        action = actionInput.readLine();
                        //If the player wants to take the item;
                        //Do: add item to the player items collection, and remove item from this location
                        if (action.equalsIgnoreCase("y")) {
                            //add item to the player items list
                            playerItems.add(player.location.getItems().get(i));

                            //remove the item from this location
                            player.location.getItems().remove(i);
                        }
                    }
                } else { //inform player that there are no items at this location
                    System.out.println("There are no items at this location");
                }
            }

            //If the player wants to drop an item.
            //The drop command is for dropping the items the player is carrying
            if (cmd.equalsIgnoreCase("drop")) {
                //First check if the player is carrying any item
                if (playerItems.size() > 0) {
                    //Loop through all the items the player is carryig.
                    //one by one ask the player if he/she wants to drop the item
                    for (int i = 0; i < playerItems.size(); i++) {
                        System.out.println("drop this? Y/N");
                        System.out.println(playerItems.get(i).getItemName());
                        action = actionInput.readLine();
                        //if the player wants to drop, then add the selected item to 
                        //the current location, and remove the item from the player's location
                        if (action.equalsIgnoreCase("y")) {
                            //add item to this location
                            player.location.setItems(playerItems.get(i).getItemName());
                            //remove item the players list
                            playerItems.remove(i);
                        }
                    }
                } else { //inform user they have no items
                    System.out.println("You have nothing to drop");
                }
            }

            //if the user wants to kill the dragon.
            //Conditions: 1. Player must be in dragon cave, 
            //            2. Player must have a sword and a lamp
            //and if player tries to kill the dragon without any of the required items, 
            //he will get killed by the dragon and lose a life and will wake up at babbling brook 
            if (cmd.equalsIgnoreCase("kill")) {
                //check if the player is in the dragon cave.
                if (player.location.getLocationName().equalsIgnoreCase("Dragon's Cave")) {
                    //check if the player is carrying any items at all
                    if (playerItems.size() > 0) {
                        boolean sword = false;
                        boolean lamp = false;
                        //loop through the items the playe is holding
                        for (int i = 0; i < playerItems.size(); i++) {
                            //check if the player has the necessary items to kill the dragon
                            if (playerItems.get(i).getItemName().equals("Sword")) {
                                sword = true;
                            }
                            if (playerItems.get(i).getItemName().equals("Lamp")) {
                                lamp = true;
                            }
                        }
                        //If the player has both the sword and the lamp, he can kill the dragon
                        if (sword && lamp) {
                            System.out.println("Hurray! You have killed the Dragon");
                            success = true; //Player has won the game.
                            break;
                        } else {
                            System.out.println("Awww! You have been killed by the Dragon");
                            player.decreaseLives(); //decrement the number of lives
                            player.location = world.locations.get(0);
                        }
                    } else {
                        System.out.println("Awww! You have been killed by the Dragon");
                        player.decreaseLives(); //decrement the number of lives
                        player.location = world.locations.get(0);
                    }
                } else { //inform player, there is no dragon here
                    System.out.println("Easy Tiger!, we ain't there yet");
                }
            }
            System.out.println();
            if (cmd.equalsIgnoreCase("n")) {
                if (player.location.north != null) {
                    player.location = player.location.north;
                } else {
                    System.out.println("There is no exit to the north.");
                }
            }
            if (cmd.equalsIgnoreCase("e")) {
                if (player.location.east != null) {
                    player.location = player.location.east;
                } else {
                    System.out.println("There is no exit to the east.");
                }
            }
            if (cmd.equalsIgnoreCase("s")) {
                if (player.location.south != null) {
                    player.location = player.location.south;
                } else {
                    System.out.println("There is no exit to the south.");
                }
            }
            if (cmd.equalsIgnoreCase("w")) {
                if (player.location.west != null) {
                    player.location = player.location.west;
                } else {
                    System.out.println("There is no exit to the west.");
                }
            }
            if (cmd.equalsIgnoreCase("quit")) {
                System.out.println(goodByeMessage.getGoodByeMessage(getRandomIdx()));
            }
        }

        if (player.getLives() == 0) {
            System.out.println(goodByeMessage.getGoodByeMessage(getRandomIdx()));
        }
    }

    /**
     * Generates a random number between 0 and 19;
     *
     * @return a random number between 0 and 19
     */
    private static int getRandomIdx() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(19);
    }
}

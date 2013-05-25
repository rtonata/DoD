/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.newport.ac.uk;

/**
 *
 * @author tdahl01
 */
public class Player {

    Location location;
    private int lives;
    

    Player(Location start, int lives) {
        location = start;
        this.lives = lives;
       
    }

    /**
     * Gets the number of lives the player has left
     *
     * @return number of lives or hearts a player has left
     */
    public int getLives() {
        return lives;
    }

    /**
     * Decrements the number of lives by one every time a player gets killed by
     * a dragon
     */
    public void decreaseLives() {
        lives--;
    }
    
}

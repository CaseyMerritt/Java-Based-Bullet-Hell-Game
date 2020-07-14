import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a invulnerability powerup class that moves down the screen
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class InvinciblePowerUp extends powerUpSprites
{
    /**
     * constructor to set the initial rotation of the sprite
     */
    public InvinciblePowerUp(){
        turn(-90);
    }
    /**
     * Act - do whatever the InvinciblePowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-3);
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a fireRate powerup class that moves down the screen
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class FireRatePowerUp extends powerUpSprites
{
    /**
     * constructor to set the initial rotation of the sprite
     */
    public FireRatePowerUp(){
        turn(-90);
    }
    /**
     * Act - do whatever the FireRatePowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-3);
    }    
}

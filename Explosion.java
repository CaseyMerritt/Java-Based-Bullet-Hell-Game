import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates an explosion for a short period of time
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class Explosion extends Actor
{
    public int timer = 10;
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(timer > 0){
            timer--;
        }else{
            Greenfoot.playSound("explosionSound.wav");
            getWorld().removeObject(this);
        }
    }    
}

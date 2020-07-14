import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a laser class that is utilized by enemy ships
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class Laser extends Actor
{
    public int timer = 180;
    /**
     * constructor that sets the initial angle of the laser
     */
    public Laser(){
        turn(90);
    }
    /**
     * creates a timer that destroys this sprite after a set time.
     * (Obsolete after borders were added)
     */
    public void removeLaser(){
        if(timer > 0){
           timer--;
           
           if(timer == 0){
               getWorld().removeObject(this);
            }
       }
    }
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
       move(10);
       removeLaser();
       }
    }    


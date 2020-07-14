import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a assisting ship for a short period of time
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class AssistShip extends Actor
{
    public int timer = 600;
    public int timer2 = 60;
    public int count = 0;
    public int multiplier = 10;
    /**
     * @param x angle in which the laser is fired.
     */
    public void fire(int x){
        int thing = x;
        AssistLaser laser1 = new AssistLaser();
        getWorld().addObject(laser1, getX(), getY());
        thing = thing + 10;
        laser1.turn(-thing);
    }
    /**
     * Act - do whatever the AssistShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(timer >0){
            timer--;
        
        }else{
            getWorld().removeObject(this);
        }
        
        if(timer2 == 0){
            if(count < 50){
                fire(90 + multiplier);
                multiplier = multiplier + 10;
                count++;
                if(count == 50){
                    count = 0;
                    timer2 = 60;
                    multiplier = 10;
                }
            } 
        }else{
            timer2--;
        }
    }      
}

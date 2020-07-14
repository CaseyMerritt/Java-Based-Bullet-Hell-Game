import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * creates a enemy that spawns on the rigght side of the screen and shoots left.
 * 
 * @author (Casey Merritt, Austin Nguyen, Eddie Huang) 
 * @version (Final)
 */
public class rightEnemy extends Enemy
{
   public int timer = 60;
    public int count = 0;
    public int multiplier = 10;
    /**
     * @param x angle in which the laser is shot
     */
    public void fire(int x){
        int thing = x;
        Laser laser1 = new Laser();
        getWorld().addObject(laser1, getX(), getY());
        thing = thing + 10;
        laser1.turn(thing);
    }
    /**
     * Act - do whatever the ShootObject3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(timer == 0){
            if(count < 6){
                fire(-90 + multiplier);
                multiplier = multiplier + 10;
                count++;
                if(count == 6){
                    count = 0;
                    timer = 60;
                    multiplier = 10;
                }
            } 
        }else{
            timer--;
        }
    }    
}

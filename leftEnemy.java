import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * creates a enemy that spawns on the Left side of the screen and shoots Right.
 * 
 * @author (Casey Merritt, Austin Nguyen, Eddie Huang) 
 * @version (Final)
 */
public class leftEnemy extends Enemy
{
    public int timer = 60;
    public int count = 0;
    public int multiplier = 10;
    /**
     * @param x angle in which the laser is fired
     */
    public void fire(int x){
        int thing = x;
        Laser laser1 = new Laser();
        getWorld().addObject(laser1, getX(), getY());
        thing = thing + 10;
        laser1.turn(-thing);
    }
    /**
     * Act - do whatever the ShootObject2 wants to do. This method is called whenever
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

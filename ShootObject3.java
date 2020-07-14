import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShootObject3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootObject3 extends BadGuy2
{
    public int timer = 60;
    public int count = 0;
    public int multiplier = 10;
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

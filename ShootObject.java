import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShootObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootObject extends BadGuy
{
    public int timer = 10;
    public int urmom = 0;
    public int hashit50 = 0;
    public int turnthing = 1;
    public void fire(int x){
        Laser laser1 = new Laser();
        getWorld().addObject(laser1, getX(), getY());
        laser1.turn(-x);
    }
    /**
     * Act - do whatever the ShootObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (timer == 0){
          turnthing = turnthing + 45;
          fire(turnthing);
          timer = 10;
        }else{
            timer--;
        }
       if(urmom < 50 && hashit50 == 0){
            move(-5);
            urmom++;
            if(urmom >= 50){
                hashit50 = 1;
            }
        }
       if(hashit50 == 1){
            move(5);
            urmom--;
            if(urmom <= 0){
                hashit50 = 0;
            }
        } 
    }    
}

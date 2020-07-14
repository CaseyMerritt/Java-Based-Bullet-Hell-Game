import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates an Abstract special enemy class
 * 
 * @author (Austin Nguyen) 
 * @version (Final)
 */
public abstract class specialEnemy extends Actor
{
    /**
     * Act - do whatever the speciaEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void fire(int x){
        Laser laser1 = new Laser();
        getWorld().addObject(laser1, getX(), getY());
        laser1.turn(-x);
    }
    
    public abstract void move();
    
    public abstract void specialFire();
    
    public void act() 
    {
        
    }    
}

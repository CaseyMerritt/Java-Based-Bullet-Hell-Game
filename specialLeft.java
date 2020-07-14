import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class specialRight here.
 * 
 * @author (Austin Nguyen) 
 * @version (Final)
 */
public class specialLeft extends specialEnemy
{
    public int x = 0;
    public int maxX = 0;
    /**
     * method fire fires a laser
     * 
     * @param x angle in which the laser is fired
     */
       public void fire(int x){
        Laser laser1 = new Laser();
        getWorld().addObject(laser1, getX(), getY());
        laser1.turn(-x);
    }
     /**
     * method move, moves the ship
     */
    public void move(){
        if(x < 50 && maxX == 0){
            move(-5);
            x++;
            if(x >= 50){
                maxX = 1;
            }
        }
       if(maxX == 1){
            move(5);
            x--;
            if(x <= 0){
                maxX = 0;
            }
        } 
    }
    /**
     * method specialFire checks to see if the letter q is pressed
     * then fires lasers based on wether it is pressed or not
     */
    public void specialFire(){
        if(Greenfoot.isKeyDown("q")){
                fire(5);
                
    }
}
/**
     * Act - do whatever the specialLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        specialFire();
    }    

}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns a enemy that shoots in the circle 
 * 
 * @author (Casey Merritt, Austin Nguyen, Eddie Huang) 
 * @version (Final)
 */
public class LineEnemy extends Enemy
{
 public int timer = 10;
    public int turnthing = 1;
    public int x = 0;
    public int maxX = 0;
    /**
     * Constructor for objects of class Enemy
     */
    public LineEnemy()
    {
    }
    /**
     * Method move makes the enemy ship move back and forth in the location it is spawned
     */
    public void move(){
         if(x < 1500 && maxX == 0){
            move(-1);
            x++;
            if(x >= 1500){
                maxX = 1;
            }
        }
       if(maxX == 1){
            move(1);
            x--;
            if(x <= 0){
                maxX = 0;
            }
        } 
    }
    /**
     * @param x angle in which the laser is fired
     */
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
      move();
    }    
}


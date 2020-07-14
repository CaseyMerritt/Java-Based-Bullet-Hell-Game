import greenfoot.*;
/**
 * Write a description of class Enemy here.
 * 
 * @author Austin Nguyen, Casey Merritt, Eddie Huang
 * @version 5/11/18
 */
public class Enemy extends Actor
{
    // instance variables - replace the example below with your own
    public int timer = 10;
    public int turnthing = 1;
    public int x = 0;
    public int maxX = 0;
    /**
     * Constructor for objects of class Enemy
     */
    public Enemy()
    {
    }
    /**
     * Method move creates movement for the ships
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
     * Method fire creates a new laser that will be fired by the enemy ships
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
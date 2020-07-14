import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    public int timer = 100;
  
    public Laser(){
        turn(90);
    }
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


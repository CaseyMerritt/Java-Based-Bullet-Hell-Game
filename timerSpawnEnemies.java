import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timerSpawnEnemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timerSpawnEnemies extends Actor
{
    public int minutes = 0;
    public double counter = 120;
    Random rand = new Random();
    public int temp = 0;
    public int location = 0;
    /**
     * Act - do whatever the timerSpawnEnemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       getImage().setTransparency(0);
       if(counter > 0){
           counter--;
        }else{
            minutes++; 
            counter = 120 - (120 * .1);
            temp = rand.nextInt(3)+1;
            if(temp == 1){
                location = rand.nextInt(1000)+600;
                BadGuy bdgy1 = new BadGuy();
                ShootObject sht1 = new ShootObject();
                getWorld().addObject(bdgy1, location, 200);
                getWorld().addObject(sht1, location, 200);
            }
            if(temp == 2){
                location = rand.nextInt(1500)+1000;
                ShootObject2 sht2 = new ShootObject2();
                getWorld().addObject(sht2, location, 200);
            }
            if(temp == 3){
                location = rand.nextInt(600)+100;
                ShootObject3 sht3 = new ShootObject3();
                getWorld().addObject(sht3, location, 200);
            }
        }
      
    }    
}

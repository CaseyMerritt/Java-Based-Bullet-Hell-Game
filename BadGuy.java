import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class BadGuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadGuy extends Actor
{
      int urmom = 0;
      int hashit50 = 0;
    public BadGuy(){
    }

    /**
     * Act - do whatever the BadGuy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
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


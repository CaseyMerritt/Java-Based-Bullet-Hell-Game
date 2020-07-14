import greenfoot.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
{
    private int timeElapsed = 0; // to count sets of act cycles
    private int timeCounter = 0;
    public static int currentMinute;
    public static int currentSecond;
    public static int highMinutes;
    public static int highSeconds;
    
    public void updateTimerDisplay(){
        int seconds = timeCounter / 60;
        setImage(new GreenfootImage("Time: "+timeElapsed + ": " + seconds, 24, Color.BLACK, Color.WHITE));
    }
    public int getMinutes(){
        return currentMinute;
    }
    public int getSeconds(){
        return currentSecond;
    }
    public int getHighMinutes(){
        return highMinutes;
    }
    public int getHighSeconds(){
        return highSeconds;
    }
    public void checkHighScore(){
        if(timeElapsed >= highMinutes){
            highMinutes = timeElapsed;
            highSeconds = timeCounter / 60;
        }
    }
    public void checkRegScore(){
        currentSecond = timeCounter / 60;
        currentMinute = timeElapsed;
    }
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updateTimerDisplay();
        if(timeCounter < 3600){
            timeCounter++;
            
        }else{
            timeElapsed++;
            timeCounter = 0;
        }
        checkHighScore();
        checkRegScore();

    }    
}

import greenfoot.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * updates timer on screen.
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class timer extends Actor
{
    private int timeElapsed = 0; // to count sets of act cycles
    private int timeCounter = 0;
    public static int currentMinute;
    public static int currentSecond;
    public static int highMinutes;
    public static int highSeconds;
    /**
     * Method updateTimerDisplay updates the current time the player has survived 
     * in real time on the screen
     */
    public void updateTimerDisplay(){
        int seconds = timeCounter / 60;
        setImage(new GreenfootImage("Time: "+timeElapsed + ": " + seconds, 24, Color.BLACK, Color.WHITE));
    }
    /**
     * @Return current minute
     */
    public int getMinutes(){
        return currentMinute;
    }
    /**
     * @Return current seconds
     */
    public int getSeconds(){
        return currentSecond;
    }
    /**
     * @Return highest minute
     */
    public int getHighMinutes(){
        return highMinutes;
    }
    /**
     * @Return highest seconds
     */
    public int getHighSeconds(){
        return highSeconds;
    }
    /**
     * Method checkHighScore checks to see if the current player time is higher than the highest minutes
     */
    public void checkHighScore(){
        if(timeElapsed >= highMinutes){
            highMinutes = timeElapsed;
            highSeconds = timeCounter / 60;
        }
    }
    /**
     * Method checkRegScore sets the current times to be transfered to other methods and classes.
     */
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

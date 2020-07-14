import greenfoot.*;
import java.util.Scanner;
import java.io.File;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * set the time survived in position 1.
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class one extends Actor
{
    public int x = 0;
    public int y = 0;
    int[] topMinutes = new int[] {0,0,0,0,0};
    int[] topSeconds = new int[] {0,0,0,0,0};
    /**
     * Method setNumbers initializes the both arrays to values found in the corresponding text files
     */
    public void setNumbers() throws java.io.FileNotFoundException{
        Scanner thing = new Scanner(new File("ScoreMinutes.txt"));
        Scanner thing2 = new Scanner(new File("ScoreSeconds.txt"));
        
        for(int i =0; i < topMinutes.length; i++){
            topMinutes[i] = thing.nextInt();
      }
      for(int i =0; i < topSeconds.length; i++){
            topSeconds[i] = thing2.nextInt();
      }
      thing.close();
      thing2.close();
    }
    /**
     * Method getNumbers calls setNumbers and gets the specific numbers to print.
     */
    public void getNumbers()throws java.io.FileNotFoundException{
        setNumbers();
        for(int i = 0; i < topMinutes.length; i++){
            if(i == 0){
                x = topMinutes[i];
            }
            if(i == 0){
                y = topSeconds[i];
            }
        }
    }
    /**
     * Method setTime sets the sprite to the specific time.
     */
    public void setTime() throws java.io.FileNotFoundException{
        getNumbers();
        setImage(new GreenfootImage(x + ": " + y, 24, Color.BLACK, Color.WHITE));
    }
    /**
     * Act - do whatever the one wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      try{
           setTime();
       }catch(Exception e){
        e.printStackTrace();
    }
    }    
}

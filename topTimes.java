import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the Top Times text on the Game Over screen
 * 
 * @author (Casey Merritt) 
 * per.2
 * @version (Final)
 */
public class topTimes extends Actor
{
    GifImage gifImage = new GifImage("topTimes.gif");
    /**
     * Act - do whatever the HighScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }   
}

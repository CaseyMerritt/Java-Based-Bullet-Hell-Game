import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the HighScore text on the Game Over screen
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class HighScore extends Actor
{
    GifImage gifImage = new GifImage("HighScore.gif");
    /**
     * Act - do whatever the HighScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }    
}

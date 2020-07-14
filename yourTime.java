import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the Your Time text on the Game Over screen
 * 
 * @author (Casey Merritt) 
 * per.2
 * @version (Final)
 */
public class yourTime extends Actor
{
    GifImage gifImage = new GifImage("urmom.gif");
    /**
     * Act - do whatever the HighScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }  
}

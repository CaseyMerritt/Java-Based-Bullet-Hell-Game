import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the Star Fighter text on the Start screen
 * 
 * @author (Casey Merritt) 
 * per.2
 * @version (Final)
 */
public class GameName extends Actor
{
    GifImage gifImage = new GifImage("StarFighter.gif");
    /**
     * Act - do whatever the GameName wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
    }    
}

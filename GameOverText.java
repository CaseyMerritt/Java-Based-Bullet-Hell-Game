import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the Game Over! text on the Game Over screen
 * 
 * @author (Casey Merritt) 
 * per.2
 * @version (Final)
 */
public class GameOverText extends Actor
{
    GifImage gifImage = new GifImage("GameOver.gif");
    /**
     * Act - do whatever the GameOverText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setImage(gifImage.getCurrentImage());
    }    
}

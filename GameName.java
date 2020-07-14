import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{

    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public StartMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1);
        GameName gn = new GameName();
        PlayButton pb = new PlayButton();
        addObject(gn, 800, 200);
        addObject(pb, 800, 550);
    }
}

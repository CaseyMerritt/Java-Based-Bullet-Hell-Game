import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1);
        GameOverText got = new GameOverText();
        Score s = new Score();
        HighScore hs = new HighScore();
        TryAgain ta = new TryAgain();
        getScores gs = new getScores();
        getRegScore grs = new getRegScore();
        addObject(got, 800, 100);
        addObject(s, 500, 400);
        addObject(hs, 1100, 400);
        addObject(ta, 800, 700);
        addObject(gs, 1450, 400);
        addObject(grs, 725, 400);
    }
}

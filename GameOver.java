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
        TryAgain ta = new TryAgain();
        yourTime yt = new yourTime();
        topTimes tt = new topTimes();
        one on = new one();
        two tw = new two();
        three thr = new three();
        four fr = new four();
        five fv = new five();
        getRegScore grs = new getRegScore();
        ScoreSetterRecursion ssr = new ScoreSetterRecursion();
        addObject(yt, 590, 300);
        addObject(tt, 600, 500);
        addObject(on, 915, 452);
        addObject(tw, 915, 476);
        addObject(thr, 915, 500);
        addObject(fr, 915, 524);
        addObject(fv, 915, 548);
        addObject(ssr, 0, 0);
        addObject(got, 800, 100);
        addObject(ta, 800, 700);
        addObject(grs, 915, 300);
    }
}

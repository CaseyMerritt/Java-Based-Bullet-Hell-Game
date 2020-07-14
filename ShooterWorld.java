import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShooterWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShooterWorld extends World
{

    /**
     * Constructor for objects of class ShooterWorld.
     * 
     */
    public ShooterWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1);
        Fighter fighter1 = new Fighter();
        Enemy enemy = new Enemy();
        powerUps pu = new powerUps();
        Border border = new Border();
        Border border2 = new Border();
        BorderSide side = new BorderSide();
        BorderSide side2 = new BorderSide();

        timer tm = new timer();
        timerSpawnEnemies tse = new timerSpawnEnemies();
        addObject(enemy, 800, 120);
        addObject(fighter1,800,750);
        addObject(tm, 1500, 800);
        addObject(tse, 0, 0);
        addObject(pu,0,0);
        addObject(border,800,0);
        addObject(border2,800,900);
        addObject(side,0,450);
        addObject(side2,1600,450);
    }
}

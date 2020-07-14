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
        BadGuy bdgy1 = new BadGuy();
        //ShootObject2 shoot2 = new ShootObject2();
        ShootObject Shoot = new ShootObject();
        timer tm = new timer();
        timerSpawnEnemies tse = new timerSpawnEnemies();
        addObject(Shoot, 800, 120);
        addObject(fighter1,800,750);
        addObject(bdgy1,800, 120);
        //addObject(shoot2,1400, 120);
        addObject(tm, 1500, 800);
        addObject(tse, 0, 0);
    }
}

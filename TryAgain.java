import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryAgain extends Actor
{
    GifImage gifImage = new GifImage("Try Again.gif");
    public void click(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new ShooterWorld());
        }
    }
    /**
     * Act - do whatever the TryAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
        click();
    }    
}

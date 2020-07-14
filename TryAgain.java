import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the Game Over! text on the Game Over screen
 * 
 * @author (Casey Merritt) 
 * per.2
 * @version (Final)
 */
public class TryAgain extends Actor
{
    GifImage gifImage = new GifImage("Try Again.gif");
    /**
     * method click checks to see if the image is clicked and then loads 
     * the play world if it is clicked.
     */
    public void click(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("tryAgain.wav");
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

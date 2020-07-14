import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the Play text on the Start screen
 * 
 * @author (Casey Merritt) 
 * per.2
 * @version (Final)
 */
public class PlayButton extends Actor
{
    GifImage gifImage = new GifImage("PlayButton.gif");
    /**
     * Method click checks the see if the play button is pressed and
     * spawns the play world if it is clicked
     */
    public void click(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new ShooterWorld());
        }
    }
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gifImage.getCurrentImage());
        click();
    }    
}

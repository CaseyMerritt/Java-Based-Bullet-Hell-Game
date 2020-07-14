import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Displays the current Time
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class getRegScore extends Actor
{
    public int highM;
    public int highS;
    timer tm = new timer();
    /**
     * constructor to initialize highM and highS
     */
    public getRegScore(){
        highM = tm.getMinutes();
        highS = tm.getSeconds();
    }
    /**
     * method setScores sets the image to the current player time
     */
    public void setScores(){
        setImage(new GreenfootImage(highM + ": " + highS, 24, Color.BLACK, Color.WHITE));
    }
    /**
     * Act - do whatever the getScores wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setScores();
    }    
}

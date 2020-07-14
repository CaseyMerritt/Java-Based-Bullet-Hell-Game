import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class getScores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class getScores extends Actor
{
    public int highM;
    public int highS;
    timer tm = new timer();
    public getScores(){
        highM = tm.getHighMinutes();
        highS = tm.getHighSeconds();
    }
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

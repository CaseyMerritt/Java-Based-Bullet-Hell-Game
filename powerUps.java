import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Creates a arraylist of powerups and chooses a random one to spawn in the world
 * 
 * @author (Casey Merritt, Austin Nguyen, Eddie Huang) 
 * @version (Final)
 */
public class powerUps extends Actor
{
    public int timer = 600;
    SpeedPowerUp speed = new SpeedPowerUp();
    FireRatePowerUp firerate = new FireRatePowerUp();
    InvinciblePowerUp invincible = new InvinciblePowerUp();
    Random rand = new Random();
    ArrayList<String> powerups = new ArrayList<String>();
    Iterator iterator = powerups.iterator();
    /**
     * constructor to initialize the arraylist with the names of
     * the powerups
     */
    public powerUps(){
        powerups.add("Speed");
        powerups.add("FireRate");
        powerups.add("invincible");
        getImage().setTransparency(0);

    }
    /**
     * Method addPowerUps adds powerups to the arraylist
     */
    public void addPowerUps (){
        powerups.add("Speed");
        powerups.add("FireRate");
        powerups.add("invincible");
        getImage().setTransparency(0);
    }
    /**
     * method initiatePowerUps chooses a random powerup and spawns in randomly 
     * somewhere on the screen.
     */
    public void initiatePowerUps(){
        int number = rand.nextInt(3);
        int x = rand.nextInt(1599)+1;
        String power = powerups.get(number);
        
        if (iterator.hasNext()){
           if(power.equals("Speed")){
            getWorld().addObject(speed, x, 30);
            x++;
        }
            if(power.equals("FireRate")){
            getWorld().addObject(firerate, x, 30);
            x++;
        }
            if(power.equals("invincible")){
            getWorld().addObject(invincible, x, 30);
            x++;
        }
        }
        
    }
    /**
     * Act - do whatever the powerUps wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (timer > 0){
            timer--;
        }else{
            initiatePowerUps();
            timer = 600;
    }
        
    }    
}

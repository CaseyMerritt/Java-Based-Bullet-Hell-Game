import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a player controlled fighter with shooting abilities.
 * 
 * @author (Casey Merritt, Eddie Huang, Austin Nguyen) 
 * @version (a version number or a date)
 */
public class Fighter extends Actor
{
    Random rand = new Random();
    int speed = 10;
    int count = 600;
    int x = 255;
    int timer = 20;
    int timer2 = 20;
    int timer3 = 20;
    public boolean isInvuln = false;
    /**
     * Method CollisionDection detects if specific classes collide with this sprite
     * and then carries out specific tasks depending on what collided with this sprite
     */
    public void collisionDetection(){
        Actor a = this.getOneIntersectingObject(Laser.class);
        
        if(a != null && isInvuln == false){
           this.getWorld().removeObject(a);
           getImage().setTransparency(0);
           Greenfoot.setWorld(new GameOver());
           Greenfoot.playSound("gameOver.wav");
        }
        Actor b = this.getOneIntersectingObject(SpeedPowerUp.class);
        
        if(b != null){
            this.getWorld().removeObject(b);
            Greenfoot.playSound("speedUp.wav");
            if (speed != 25) {
            speed = speed + (int)(speed * 0.2);
        }
        }
        Actor c = this.getOneIntersectingObject(FireRatePowerUp.class);
        
        if(c != null){
            this.getWorld().removeObject(c);
            int x = rand.nextInt(1400)+200;
            Greenfoot.playSound("assist.wav");
            AssistShip as = new AssistShip();
            getWorld().addObject(as,x, 700);
        }
        Actor d = this.getOneIntersectingObject(InvinciblePowerUp.class);
        
        if(d != null){
            this.getWorld().removeObject(d);
            isInvuln = true;
            Greenfoot.playSound("invuln.wav");
        }
    }
    /**
     * Method Invuln checks to see if the fighter is currently Invuln or not
     */
    public void Invuln(){
        if(isInvuln == true && count > 0){
            count--;
            if(x == 255){
                x = 0;
                getImage().setTransparency(x);
            }else{
                x = 255;
                getImage().setTransparency(x);
            } 
        }else{
            isInvuln = false;
            count = 600;
        }
    }
    /**
     * Method fire, fires a laser directly forward from the player sprite
     */
    public void fire(){
        playerLaser laser = new playerLaser(90);
        getWorld().addObject(laser, getX(), getY());
        Greenfoot.playSound("shootSound.wav");
    }
    /**
     * Method fireLeft, fires a laser 45 degrees to the left of the player sprite
     */
    public void fireLeft(){
        playerLaser laserLeft = new playerLaser(45);
        getWorld().addObject(laserLeft, getX(), getY());
        Greenfoot.playSound("shootSound.wav");
    }
    /**
     * Method fireRight, fires a laser 45 degrees to right of the player sprite
     */
    public void fireRight(){
        playerLaser laserRight = new playerLaser(135);
        getWorld().addObject(laserRight, getX(), getY());
        Greenfoot.playSound("shootSound.wav");
    }
    /**
     * Act - do whatever the Fighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            move(-speed);
        }
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            move(speed);
        }
        if(Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("q") && !Greenfoot.isKeyDown("e")){
            if(timer2 > 0){
                timer2--;
            }else{
                fire();
                timer2 = 10;
            }
        }
        if(Greenfoot.isKeyDown("e") && !Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("q")){
            if(timer > 0){
                timer--;
            }else{
                fireRight();
                timer = 10;
            }
        }
        if(Greenfoot.isKeyDown("q") && !Greenfoot.isKeyDown("e") && !Greenfoot.isKeyDown("space")){
            if(timer3 > 0){
                timer3--;
            }else{
                fireLeft();
                timer3 = 10;
            }
        }
        Invuln();
        collisionDetection();
    }
    
}

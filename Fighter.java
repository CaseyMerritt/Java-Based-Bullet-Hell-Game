import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fighter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fighter extends Actor
{
    public void collisionDetection(){
        Actor a = this.getOneIntersectingObject(Laser.class);
        
        if(a != null){
           this.getWorld().removeObject(a);
           getImage().setTransparency(0);
           Greenfoot.setWorld(new GameOver());
        }
    }
    public void fire(){
        Laser2 ls2 = new Laser2();
        getWorld().addObject(ls2, getX(), getY());
    }
    public void fireLeft(){
        Laser4 ls4 = new Laser4();
        getWorld().addObject(ls4, getX(), getY());
    }
    public void fireRight(){
        Laser3 ls3 = new Laser3();
        getWorld().addObject(ls3, getX(), getY());
    }
    /**
     * Act - do whatever the Fighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            move(-10);
        }
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            move(10);
        }
        if(Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("q") && !Greenfoot.isKeyDown("e")){
            fire();
        }
        if(Greenfoot.isKeyDown("e") && !Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("q")){
            fireLeft();
        }
        if(Greenfoot.isKeyDown("q") && !Greenfoot.isKeyDown("e") && !Greenfoot.isKeyDown("space")){
            fireRight();
        }
        collisionDetection();
    }
    
}

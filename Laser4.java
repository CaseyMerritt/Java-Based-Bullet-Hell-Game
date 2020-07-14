import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser4 extends Actor
{
    public int timer = 100;
  
    public Laser4(){
        turn(-45);
    }
    public void removeLaser(){
        if(timer > 0){
           timer--;
           
           if(timer == 0){
               getWorld().removeObject(this);
            }
       }
    }
    public void collisionDetection(){
        Actor a = this.getOneIntersectingObject(BadGuy.class);
        Actor b = this.getOneIntersectingObject(ShootObject.class);
        Actor c = this.getOneIntersectingObject(ShootObject2.class);
        Actor d = this.getOneIntersectingObject(ShootObject3.class);
        
        if(a != null){
           this.getWorld().removeObject(a);
           getImage().setTransparency(0);

        }
        if(b != null){
           //this.getWorld().removeObject(b);
           //getImage().setTransparency(0);

        }
        if(c != null){
          this.getWorld().removeObject(c);
           getImage().setTransparency(0);

        }
       if(d != null){
          this.getWorld().removeObject(d);
          getImage().setTransparency(0);

        }
    }
    /**
     * Act - do whatever the Laser4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       collisionDetection(); 
       move(10);
       removeLaser();
       }
    }    


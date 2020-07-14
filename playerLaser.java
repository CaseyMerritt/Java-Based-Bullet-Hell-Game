import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Sets parameters for the player spawned lasers as well as create collision detection for it.
 * 
 * @author (Casey Merritt, Austin Nguyen) 
 * @version (Final)
 */
public class playerLaser extends Actor
{
    public int timer = 180;
    /**
     * Constructor to set the direction of the laser
     * @Param direction the direction of the laser in degrees
     */
    public playerLaser(int direction){
        turn(direction);
    }
    /**
     * Method collisionDetection detects when certain objects collide with this sprite
     */
    public void collisionDetection(){
        Explosion ex = new Explosion();
        Actor a = this.getOneIntersectingObject(Enemy.class);
        Actor b = this.getOneIntersectingObject(specialEnemy.class);
       // Actor c = this.getOneIntersectingObject(ShootObject2.class);
        //Actor d = this.getOneIntersectingObject(ShootObject3.class);
        
        if(a != null){
           this.getWorld().removeObject(a);
           getImage().setTransparency(0);
           getWorld().addObject(ex, getX(), getY());

        }
        if(b != null){
           this.getWorld().removeObject(b);
           getImage().setTransparency(0);

        }
        /*if(c != null){
          this.getWorld().removeObject(c);
           getImage().setTransparency(0);
           getWorld().addObject(ex, getX(), getY());

        }
       if(d != null){
          this.getWorld().removeObject(d);
          getImage().setTransparency(0);
          getWorld().addObject(ex, getX(), getY());

        }*/
    }
    /**
     * Act - do whatever the Laser2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(-10);
       collisionDetection();
       if(timer > 0){
           timer--;
           if(timer == 0){
               getWorld().removeObject(this);
            }
        }
    }    
}
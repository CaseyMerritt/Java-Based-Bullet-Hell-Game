import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the laser that is fired from the assistship
 * 
 * @author (Casey Merritt) 
 * @version (a version number or a date)
 */
public class AssistLaser extends Actor
{
    /**
     * constructor to set the beginning angle of the assisting ship laser
     */
    public AssistLaser(){
        turn(90);
    }
    /**
     * Method CollisionDection detects if specific classes collide with this sprite
     * and then carries out specific tasks depending on what collided with this sprite
     */
    public void collisionDetection(){
        Explosion ex = new Explosion();
        Actor a = this.getOneIntersectingObject(Enemy.class);
        Actor b = this.getOneIntersectingObject(specialEnemy.class);
        //Actor c = this.getOneIntersectingObject(ShootObject2.class);
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
     * Act - do whatever the AssistLaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(10);
       collisionDetection();
    }    
}

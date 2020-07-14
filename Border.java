import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a Border that will destroy projectiles when they collide with it
 * 
 * @author (Casey Merritt) 
 * @version (Final)
 */
public class Border extends Actor
{
    /**
     * constructor to set the transparency of the border to 0, so it can not be
     * seen by the player.
     */
    public Border(){
        getImage().setTransparency(0);
    }
    /**
     * Method collisionDetection checks if certain classes collide with this sprite
     * and then deletes or removes that sprite from the world.
     */
    public void collisionDetection(){
        Actor a = this.getOneIntersectingObject(Laser.class);
        
        if(a != null){
           this.getWorld().removeObject(a);
        }
        Actor b = this.getOneIntersectingObject(playerLaser.class);
        
        if(b != null){
           this.getWorld().removeObject(b);
        }

        
        Actor x = this.getOneIntersectingObject(AssistLaser.class);
        
        if(x != null){
           this.getWorld().removeObject(x);
        }
        Actor f = this.getOneIntersectingObject(SpeedPowerUp.class);
        
        if(f != null){
           this.getWorld().removeObject(f);
        }
        Actor e = this.getOneIntersectingObject(FireRatePowerUp.class);
        
        if(e != null){
           this.getWorld().removeObject(e);
        }
       Actor g = this.getOneIntersectingObject(InvinciblePowerUp.class);
        
        if(g != null){
           this.getWorld().removeObject(g);
        }
    }
    /**
     * Act - do whatever the Border wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        collisionDetection();
    }    
}

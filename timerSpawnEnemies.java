import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Timer class to spawn enemies at set intervals
 * 
 * @author (Casey Merritt, Eddie Huang, Austin Nguyen) 
 * @version (Final)
 */
public class timerSpawnEnemies extends Actor
{
    public int minutes = 0;
    public double counter = 120;
    Random rand = new Random();
    public int temp = 0;
    public double temp2 = 120;
    public int location = 0;
    public int wavesSurvived = 0;
    Enemy enemy = new Enemy();
    Enemy enemyLeft = new leftEnemy();
    Enemy enemyRight = new rightEnemy();
    Enemy line = new LineEnemy();
    specialEnemy left = new specialLeft();
    specialEnemy right = new specialRight();
    specialEnemy space = new specialSpace();
    
    /**
     *@Return returns number of waves survived
     */
    public int getWavesSurvived(){
        return wavesSurvived;
    }
    /**
     * Method specialSpawn spawns special enemies at certain intervals
     */
    public void specialSpawn(){
                int x = rand.nextInt(3) + 1;
                getWorld().addObject(line, location, 200);
                line.fire(90);
                line.fire(5);
                line.fire(50);
                line.fire(135);
                line.fire(-50);
                if(x == 1){
                   location = rand.nextInt(600)+100;
                getWorld().addObject(left, location, 200);
            }
                else if(x == 2){
                    location = rand.nextInt(1000)+500;
                    
                    getWorld().addObject(right, location, 200);
                }
                else {
                    getWorld().addObject(space, location, 200);
                }
                wavesSurvived = 0;
           
    }
    /**
     * Act - do whatever the timerSpawnEnemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       getImage().setTransparency(0);
       if(counter > 0){
           counter--;
        }else{
            minutes++; 
            temp2 = temp2 - (temp2 * .01);
            counter = temp2;
            temp = rand.nextInt(3)+1;
            if(temp == 1){
                location = rand.nextInt(1000)+600;
                
                if(wavesSurvived >=5){
                    specialSpawn();
                }
                else {
                getWorld().addObject(enemy, location, 200);
                wavesSurvived++;
            }
            }
            if(temp == 2){
                location = rand.nextInt(700)+900;
                
                if(wavesSurvived >=5){
                    specialSpawn();
                }
                else {
                getWorld().addObject(enemyLeft, location, 200);
                wavesSurvived++;
            }
                
            }
            if(temp == 3){
                location = rand.nextInt(400)+50;
                   if(wavesSurvived >=5){
                    specialSpawn();
                }
                else {
                getWorld().addObject(enemyRight, location, 200);
                wavesSurvived++;
            }
            }

        }
      
    }    
}

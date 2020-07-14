import greenfoot.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreSetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreSetter extends Actor
{
    public int highM;
    public int highS;
    public int timer = 0;
    timer tm = new timer();
    int[] topMinutes = new int[] {0,0,0,0,0};
    int[] topSeconds = new int[] {0,0,0,0,0};
    public ScoreSetter(){
        getImage().setTransparency(0);
        highM = tm.getMinutes();
        highS = tm.getSeconds();
    }
    public void initializeScores() throws java.io.FileNotFoundException{
        Scanner thing = new Scanner(new File("ScoreMinutes.txt"));
        Scanner thing2 = new Scanner(new File("ScoreSeconds.txt"));
        
        for(int i =0; i < topMinutes.length; i++){
            topMinutes[i] = thing.nextInt();
      }
      for(int i =0; i < topSeconds.length; i++){
            topSeconds[i] = thing2.nextInt();
      }
      thing.close();
      thing2.close();
    }
    public void addScore() throws java.io.FileNotFoundException{
        initializeScores();
        for (int i = 0; i < topMinutes.length; i++) {
            if (highM >= topMinutes[i]) {
                    for(int thing = topMinutes.length-1; thing > i; thing--) {
                        topMinutes[thing] = topMinutes[thing-1];
                        topSeconds[thing] = topSeconds[thing-1];
                    }
                    topMinutes[i] = highM;
                    topSeconds[i] = highS;
                    i = topMinutes.length;
            }
        }
    }
    public void printArray() throws java.io.FileNotFoundException,java.io.IOException {
        addScore();
        writeScores();
    }
    
    public void writeScores() throws java.io.IOException { 
        FileWriter scores = new FileWriter("ScoreMinutes.txt");
        FileWriter names = new FileWriter("ScoreSeconds.txt");
        BufferedWriter out = new BufferedWriter(scores);
        BufferedWriter out1 = new BufferedWriter(names);
        for(int i = 0; i < topMinutes.length; i++){
            out.write(topMinutes[i] + "" + '\r' + '\n');
        }
        for(int i = 0; i < topSeconds.length; i++){
            out1.write(topSeconds[i] + "" + '\r' + '\n');
        }
        out.close();
        out1.close();
    }
    /**
     * Act - do whatever the ScoreSetter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    try{
       if(timer == 1){
       printArray();
       timer++;
    }else{
        timer++;
    }
    }catch(Exception e){
        e.printStackTrace();
    }
    }   
}

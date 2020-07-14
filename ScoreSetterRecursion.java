import greenfoot.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.util.*;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class the sort and save the top 5 scores to a text file
 * 
 * @author (Casey Merritt, Austin Nguyen, Eddie Huang) 
 * @version (Final)
 */
public class ScoreSetterRecursion extends Actor
{
    public int highM;
    public int highS;
    public int timer = 0;
    timer tm = new timer();
    one o = new one();
    two tw = new two();
    three thr = new three();
    four fr = new four();
    five fv = new five();
    int[] topMinutes = new int[] {0,0,0,0,0};
    int[] topSeconds = new int[] {0,0,0,0,0};
    /**
     * constructor to set the image transparency to 0 and to initialize
     * both highM and highS
     */
    public ScoreSetterRecursion(){
        
        getImage().setTransparency(0);
        highM = tm.getMinutes();
        highS = tm.getSeconds();
    }
    /**
     * Method initializeScores reads in the highest recorded minutes and seconds
     * and places them based on their location in the text file
     * into corresponding arrays.
     * 
     * the seconds are also increased based on their corresponding minutes * 100 for
     * easier sorting
     */
    public void initializeScores() throws java.io.FileNotFoundException{
        Scanner thing = new Scanner(new File("ScoreMinutes.txt"));
        Scanner thing2 = new Scanner(new File("ScoreSeconds.txt"));
        
        for(int i =0; i < topMinutes.length; i++){
            topMinutes[i] = thing.nextInt();
      }
      for(int i =0; i < topSeconds.length; i++){
            topSeconds[i] = thing2.nextInt() + (topMinutes[i] * 100);
      }
      thing.close();
      thing2.close();
    }
    /**
     * method addScore checks to see if the current player score is high enough
     * to be added to the top 5 list
     * 
     * if current player score is high enough, it is then added to the array and sorted
     * accordingly
     * 
     * @param n number of times left to run through the loops
     */
    public void addScore(int n) throws java.io.FileNotFoundException{
        int i = n;
        if(i < topMinutes.length) {
            if (highM >= topMinutes[i]) {
                    for(int thing = topMinutes.length-1; thing > i; thing--) {
                        topMinutes[thing] = topMinutes[thing-1];
                    }
                    topMinutes[i] = highM;
                    int temp = highS + (highM * 100);
                    for(int x = 0; x < topSeconds.length; x++){
                        if(temp > topSeconds[x]){
                            for(int y = topSeconds.length-1; y > x; y--){
                                topSeconds[y] = topSeconds[y-1];
                            }
                            topSeconds[x] = temp;
                            x = topSeconds.length;
                        }
                    }
                    i = topMinutes.length;
            }
           addScore(i+1);
        }
    }
    /**
     * Method printArray calls all the methods together so that the times are displayed
     * correctly
     */
    public void printArray() throws java.io.FileNotFoundException,java.io.IOException {
        initializeScores();
        addScore(0);
        writeScores();
    }
    /**
     * method writeScores takes the sorted arrays and then outputs them into a text file
     * to be read later and displayed on screen.
     * 
     * keep in mind the seconds and altered at this point by subtracting their corresponding
     * minutes * 100 to leave a seconds value between 0 - 59.
     */
    public void writeScores() throws java.io.IOException { 
        FileWriter scores = new FileWriter("ScoreMinutes.txt");
        FileWriter names = new FileWriter("ScoreSeconds.txt");
        BufferedWriter out = new BufferedWriter(scores);
        BufferedWriter out1 = new BufferedWriter(names);
        for(int i = 0; i < topMinutes.length; i++){
            out.write(topMinutes[i] + "" + '\r' + '\n');
        }
        for(int i = 0; i < topSeconds.length; i++){
            out1.write(topSeconds[i] - (topMinutes[i] * 100) + "" + '\r' + '\n');
        }
        out.close();
        out1.close();
    }
    /**
     * Act - do whatever the ScoreSetterRecursion wants to do. This method is called whenever
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


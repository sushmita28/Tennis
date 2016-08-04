/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Player
{
    int gameScore = 0;
    int[] setScores  = {0,0,0};
    
    public void incrementGameScore(){
        ++gameScore;
    }
    
    public int getGameScore() {
        return gameScore;
    }
    
    public void resetGameScore(){
        gameScore = 0;
    }
    
    public void incrementSetScore(int setNumber){
        ++setScores[setNumber];
    }
    
    public int getSetScore(int setNumber){
        return setScores[setNumber];
    }
    
    
}

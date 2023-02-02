package com.methods.java;

public class MethodEx {
    public static void main(String[] args) {
        calculateScore(10000,8,200,true);
    }
    //another methods
    //return type is mandatory for exit from any another block to send the data to the main block
    public static void calculateScore(int score,int levelCompleted,int bonus,boolean gameOver){
        /*int score = 10000;
        int levelCompleted =8;
        int bonus =200;
        boolean gameOver = true;
*/
        int finalScore = score;

        if(gameOver){
            finalScore += (bonus*levelCompleted);
            finalScore +=1000;
            System.out.println("final Score : " + finalScore);
        }
    }
}

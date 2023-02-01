package com.ExpStatement.Java;

public class IFElseChallenge {
    public static void main(String[] args) {
        int score = 10000;
        int levelCompleted =8;
        int bonus =200;
        boolean gameOver = true;

        int finalScore = score;

        if(gameOver){
            finalScore += bonus*levelCompleted;
            System.out.println("final Score : " + finalScore);
        }



    }
}

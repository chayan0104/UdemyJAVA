package com.methods.java;
public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScore(200);
        displayHighScorePosition("tom", highScorePosition);

        highScorePosition = calculateHighScore(700);
        displayHighScorePosition("tsf", highScorePosition);

        highScorePosition = calculateHighScore(1200);
        displayHighScorePosition("sfsfs", highScorePosition);

        highScorePosition = calculateHighScore(24);
        displayHighScorePosition("tosfwm", highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get the position "
                + highScorePosition + " on the high score list ");
    }
    public static int calculateHighScore(int playerScore) {
     /*  if (playerScore >= 1000){
           return 1;
       } else if (playerScore >= 500) {
           return  2;
       }else if(playerScore >= 100) {
           return 3;
        }else {
           return 4;
*/
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}

package com.methods.java;
// Same method but different parameter can considered unique

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore(800,"tom");
        System.out.println("the new score is "+ newScore);

        calculateScore(75);
    }
    public static int calculateScore(int score,String playerName) {
        System.out.println(playerName + " new scores "+score);
        return score*500;
    }
    public static int calculateScore(int score) {
        System.out.println(" scores "+score);
        return score*500;
    }
}

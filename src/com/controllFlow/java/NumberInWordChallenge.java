package com.controllFlow.java;

public class NumberInWordChallenge {
    public static void main(String[] args) {
        printNumberInWord(3);

    }
    public static void printNumberInWord(int number){
        String noPram = "OTHER";
        if(number==0){
           noPram ="Zero";
        } else if (number==1) {
            noPram ="ONE";
        } else if (number==2) {
            noPram="TWO";
        }else if (number==3) {
            noPram="THREE";
        }else if (number==4) {
            noPram="FOUR";
        }else if (number==5) {
            noPram="FIVE";
        }else if (number==6) {
            noPram="SIX";
        }else if (number==7) {
            noPram="SEVEN";
        }else if (number==8) {
            noPram="EIGHT";
        }else if (number==9) {
            noPram="NINE";
        }
        System.out.println(noPram);

    }

}

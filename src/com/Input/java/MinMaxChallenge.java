package com.Input.java;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int loopCount = 0;
        while (loopCount <= 2) {  // it will act as 3 as it's starts from 0 .
            System.out.println("enter a number");
            String nextEntry = sc.nextLine();
            try {
                int validNum = Integer.parseInt(nextEntry);//validation

                if (loopCount == 0 || validNum < min) {  //checking min number
                    min = validNum;

                }
                if (loopCount == 0 || validNum > max) {// checking max number
                    max = validNum;
                }
                loopCount++;

            } catch (NumberFormatException e) {
                System.out.println("Only number are allowed");
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("max vale " + max + ", min value " + min);
        } else {
            System.out.println("invalid input");
        }


    }
}

package com.Input.java;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // int sum = 0;
        double sum =0;
        int counter = 1;
        while (counter <= 5) {
            System.out.println("enter Number # " + counter + ":");
            String nextNumber = sc.nextLine(); // taking number one by one
            try {
               // int num = Integer.parseInt(nextNumber); //validating input is integer or not
                double num = Double.parseDouble(nextNumber);
                counter++;
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");

            }
        }
        System.out.println("Sum of Number Is :" + sum);
    }
}


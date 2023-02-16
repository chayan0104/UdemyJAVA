package com.excercise.java;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12221));


    }
    public static boolean isPalindrome(int number){

        int reverse = 0;
        int originalNumber = number;

        while (number !=0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        System.out.println(originalNumber);
        return originalNumber == reverse;
    }

    }

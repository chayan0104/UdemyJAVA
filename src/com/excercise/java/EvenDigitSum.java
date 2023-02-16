package com.excercise.java;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234567));
    }
    public static int getEvenDigitSum(int number){

        int sumEvenDigits = 0;
        if (number < 0)
            return -1;

        while (number > 0) {
            int evenDigits = number % 10;
            if (evenDigits % 2 == 0 )
                sumEvenDigits += evenDigits;
            number /= 10;
        }
        return sumEvenDigits;
    }
}

package com.controllFlow.java.forloop;
/*for(init;expression;increment){
    block of code
        }*/
public class ForLoop {
    public static void main(String[] args) {
        for (double rate=2.0; rate<=7.0;rate++){
            double interestAmount =calculateInterest(10000,rate);
            System.out.println("10000 at "+ rate+ "% interest "+interestAmount);
        }
    }
    public static double calculateInterest(double amount,double interestRate){
        return (amount*(interestRate/100));
    }

}

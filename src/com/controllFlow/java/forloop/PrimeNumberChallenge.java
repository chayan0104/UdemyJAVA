package com.controllFlow.java.forloop;

public class PrimeNumberChallenge {
    public static void main(String[] args) {
        System.out.println("0 is "+ (isPrime(0)?"": "not")+" a prime no");
        System.out.println("1 is "+ (isPrime(1)?"": "not")+" a prime no");
        System.out.println("2 is "+ (isPrime(2)?"": "not")+" a prime no");
        System.out.println("3 is "+ (isPrime(3)?"": "not")+" a prime no");
        System.out.println("8 is "+ (isPrime(8)?"": "not")+" a prime no");
        System.out.println("17 is "+ (isPrime(17)?"": "not")+" a prime no");
    }
    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int devisor=2;devisor<wholeNumber/2;devisor++){
            if (wholeNumber % devisor==0){
                return false;
            }
        }
        return true;
    }
}

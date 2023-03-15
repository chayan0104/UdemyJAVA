package com.Oops.java.inheritance.Excercise;

public class Main {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.deposit(500);
        System.out.println(bA.getBalance());

        bA.withdraw(1000);
        System.out.println(bA.getBalance());

        System.out.println("Account Details "+ bA.getCustomerName() + bA.getEmail() + bA.getAccountNumber());
    }
}

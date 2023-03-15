package com.Oops.java.inheritance.Excercise;

public class BankAccount {
    private int accountNumber = 18738163;
    private int balance= 7000;
    private String customerName="Ram";
    private String email="ram123@gmai;com";
    private long phoneNumber= 8388823581l;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static void main(String[] args) {
    }
    public  int deposit(int depBal){

        balance+=depBal;
        return balance;
    }
    public   int withdraw(int withBal){
       if(balance<0){
           System.out.println("insufficient Amount");
       }else {
           balance-=withBal;
       }
        return balance;
    }

}

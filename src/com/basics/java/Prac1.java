package com.basics.java;

public class Prac1 {
    public static void main(String[] args) {
        Double noOne =20.00d;
        Double noTwo =80.00d;
        Double mul =((noOne+noTwo)*100.00d);
        System.out.println(mul + " is the multiplication");

        //reminder
        Double rem = mul%40.00d;
        System.out.println(rem + " is the reminder");
        //it will check the reminder is 0 or not.
        boolean isNotReminder =(rem == 0)? true :false;
        System.out.println("the ans is " + isNotReminder + " as we checked for equally 0 or not");

        //if else statement
        if(!isNotReminder){
            System.out.println("got some reminder");
        }else {
            System.out.println("no reminder");
        }

    }
}

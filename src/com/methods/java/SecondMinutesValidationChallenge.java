package com.methods.java;
//we will be having  some validation over here for passing particular data
public class SecondMinutesValidationChallenge {
    public static void main(String[] args) {
    System.out.println(getDuraationString(-3945));
    System.out.println(getDuraationString(-45,65));
        System.out.println(getDuraationString(45,65));
        System.out.println(getDuraationString(80));
}
    public  static String getDuraationString(int seconds){
        if(seconds<0){
            return "invalid number "+ seconds +" please enter valid one";
        }else {
            int minutes = seconds/60;
            return getDuraationString(seconds%60,seconds/60);//for passing the value from another method
        }
    }
    public  static String getDuraationString(int seconds,int minutes){
        if(seconds <= 0 || seconds >= 59){
            return "invalid number "+ seconds +" please enter valid one";
        }
        if(minutes<0){
            return "invalid number "+ minutes +" please enter valid one";
        }else {
            int hours = minutes/60;
            int remainingminutes = minutes%60;
           // int remainingSeconds = seconds%60;
            return hours +"h " + remainingminutes+ "m " + seconds +"s ";
        }
    }
}

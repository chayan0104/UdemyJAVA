package com.methods.java;
public class SecondMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDuraationString(3945));
        System.out.println(getDuraationString(45,65));
    }
    public  static String getDuraationString(int seconds){
        int minutes = seconds/60;
        return getDuraationString(seconds,minutes);
    }
    public  static String getDuraationString(int seconds,int minutes){
        int hours = minutes/60;
        int remainingminutes = minutes%60;
        int remainingSeconds = seconds%60;
        return hours +"h " + remainingminutes+ "m " + remainingSeconds +"s ";
    }
}

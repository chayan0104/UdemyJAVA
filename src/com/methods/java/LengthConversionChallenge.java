package com.methods.java;

public class LengthConversionChallenge {
    public static void main(String[] args) {
        System.out.println("68 inch= " + convertToCentimeter(68)+ " cm");
        System.out.println("5ft 8 inch= " + convertToCentimeter(5,8)+ " cm");
    }
    public static double convertToCentimeter(int heightFeet){
        //double heightCenti = 2.54* heightFeet;
        // return heightCenti
        return heightFeet*2.54;
    }
    public static double convertToCentimeter(int heightFeet,int heightInches){
        /*int feetInches = heightInches*12;
        int totalInches= feetInches+ heightInches;
        double result = totalInches*2.54;
        return result;*/
        //or
        return ((heightFeet*12)+heightInches)*2.54;
    }
}

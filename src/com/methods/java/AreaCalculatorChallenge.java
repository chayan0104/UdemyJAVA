package com.methods.java;

public class AreaCalculatorChallenge {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5,4));
    }
    public static double area(double radius){
       /* double returnValue= -1.0;*/
        if(radius<0){
            return -1.0;
        }else {

            return 3.14*(radius*radius);
        }
    }
    public static double area(double x, double y ){

        if((x<0 && y<0)||(x<0 || y<0)){
            return -1.0;
        }else {
         return x*y;
        }
    }
}

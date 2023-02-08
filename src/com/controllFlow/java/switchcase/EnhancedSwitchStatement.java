package com.controllFlow.java.switchcase;
// cannot use double,long , float or the wrappers in  switch statement
public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        int switchValue=4;
       // int switchValue =10;
        switch (switchValue) {
            case 1 -> System.out.println("value is 1");
            case 2 -> System.out.println("value is 2");
            case 3, 4, 5 -> System.out.println("Value is " + switchValue);
            default -> System.out.println("value is not 1 or 2 or 3 or 4 or 5");
        }
    }
}

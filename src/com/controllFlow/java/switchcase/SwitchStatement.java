package com.controllFlow.java.switchcase;
// cannot use double,long , float or the wrappers in  switch statement
public class SwitchStatement {
    public static void main(String[] args) {
        /*int value = 1;
        if(value==1){
            System.out.println("value ia 1");
        } else if (value==2) {
            System.out.println("value is 2");
        }else {
            System.out.println("not 1 or 2");
        }*/
        int switchValue=4;
       // int switchValue =10;
        switch (switchValue){
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is "+switchValue);
                break;
            default:
                System.out.println("value is not 1 or 2 or 3 or 4 or 5");
                break;
        }
    }
}

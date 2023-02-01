package com.basics.java;

//operand1 ? operand2 : operand 3
//it will compare operand 1 with operand 2 if true then it will return operand 2, or it will return 3.
/*we can say it's shortcut of if else statement,ternary operator is a shortcut to
assigning one of two values to a variable , depending on given condition.*/
public class TernaryOperator {
    public static void main(String[] args) {
        String makeOfCar = "Mahindra";
        boolean isDomestic = makeOfCar == "Mahindra" ? false : true;

       /* if(isDomestic){
            System.out.println("this is an indian car manufacturer");
        }*/

        String s = (isDomestic) ? "not domestic" : "is Domestic";

        System.out.println(s);

    }
    }



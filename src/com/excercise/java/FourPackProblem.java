package com.excercise.java;

public class FourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,5,6));
    }

    public static boolean canPack(int bigCount,int smallCount, int goal) {
        int allSunm= (bigCount*5)+smallCount;
        int count =0;
        int temp = 0;

        if (allSunm<0){
            return false;
        }else if (allSunm==0){
            return true;
        }else {
            for(int i=0;i<goal;i++){               //For loop that gets the largest number that is divisible by 5 in the number 'goal'.
            temp = goal - i;
            if (temp % 5 == 0){
                break;
            }
        }
        if (bigCount>= temp/5) {               //If the number of big bags is bigger than the biggest number divisible by 5
            goal -= temp;
            if (smallCount >= goal) {          //Compares the remaining kilos with the small bags
                return true;
            }
            return false;
        }
        else{                                   //If the number of big bags is smaller than the biggest number divisible by 5
            goal -= (temp-bigCount*5);
            if (smallCount >= goal) {
                return true;
            }
            return false;
        }
    }

    }
}

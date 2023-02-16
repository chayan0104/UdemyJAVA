package com.controllFlow.java.forloop;

public class DebuggerUsage {
    public static void main(String[] args) {
        int countOfMatches=0;
        int sunOfMatches=0;
        for(int loopnumbber=1;loopnumbber<=1000;loopnumbber++){
            if((loopnumbber%3==0)&&(loopnumbber%5==0)){
                countOfMatches++;
                sunOfMatches+=loopnumbber;
                System.out.println("found Match= " + loopnumbber);
            }
            if(countOfMatches==5){
                break;
            }
        }
        System.out.println("sum= "+ sunOfMatches);
    }
}

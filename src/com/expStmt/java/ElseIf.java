package com.expStmt.java;

public class ElseIf {
    public static void main(String[] args) {
        int score = 5001;

        if(score>0 && score<=5000){
            System.out.println(score + " is Valid score");
        }else if (score>0 && score>5000){
            System.out.println(score + " is more than 5000");
        }else{
            System.out.println(score + " is not valid score");
        }

    }
}

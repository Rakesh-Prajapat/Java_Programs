package com.company;

public class Conditionals {
    public static void main(String[] args) {
        /*
             Syntax of if statement:
             if(condition){
               do this if condition is true
             }
             else{
             do this id condition is false
         */

        int age = 17;
        if(age >= 18){
            System.out.println("He is able to make a vote...");
        }
        else{
            System.out.println("He is not able to make a vote...");
        }

        boolean isRain = false;

        if(isRain == true){
            System.out.println("There is no need for giving the water to the plants...");
        }
        else{
            System.out.println("There is need to give water to the plants...");
        }

        boolean isMarried = true;

        if(isMarried == true){
            System.out.println("Life is boring...");
        }
        else if(isMarried==false){
            System.out.println("Life is normal goint...");
        }
        else{
            System.out.println("Life is running very good...");
        }
    }
}

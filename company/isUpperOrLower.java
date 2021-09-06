package com.company;

import java.util.Scanner;

public class isUpperOrLower {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char ch = scn.next().trim().charAt(0);

        for(int val = 65 ; val <= 90 ; val++){
           if(val == (int)ch){
               System.out.println("Upper Case Alphabets...");
           }
        }

        for (int val = 97 ; val <= 122;val++){
            if(val == (int)ch){
                System.out.println("Lower Case Alphabets...");
            }
        }

    }
}

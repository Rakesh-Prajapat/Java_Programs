package com.Functions;

import java.util.Scanner;

public class MorningMsg {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Greetings Message...");
        String message = scn.nextLine();

        System.out.println(greets(message));
    }

    private static String greets(String str){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Name...");
        String Name = scn.nextLine();
        return str+" "+Name;
    }
}

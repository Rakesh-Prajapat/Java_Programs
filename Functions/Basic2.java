package com.Functions;

import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        morningGreetings();
    }
    private static void morningGreetings(){
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("Good Morning "+name);
    }
}

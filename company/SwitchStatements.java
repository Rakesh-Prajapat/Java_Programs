package com.company;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String fruitName = scn.next();

        switch (fruitName) {
            case "mango":
                System.out.println("King of Fruits...");
                break;
            case "apple":
                System.out.println("A Sweet Red Fruit...");
                break;
            case "orange":
                System.out.println("A Round Fruit...");
                break;
            default:
                System.out.println("Invalid Input....Please Enter A Fruit Name...");
                break;
            case "grapes":
                System.out.println("A Green Small Fruit...");
                break;
        }
    }
}

package com.company;

import java.util.Scanner;

public class PrintDay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int day = scn.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week Days");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Please Enter A Valid Day...");
        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week Days");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Please Enter A Valid Day...");
        }
    }
}

package com.assignment;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int base = scn.nextInt();
        int exp = scn.nextInt();
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        System.out.println(result);
    }
}

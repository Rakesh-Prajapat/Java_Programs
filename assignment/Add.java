package com.assignment;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println(add(num1,num2));
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }
}

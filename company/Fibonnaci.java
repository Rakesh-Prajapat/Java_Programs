package com.company;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(n + "th fibonacci number is -> " + a);
    }
}

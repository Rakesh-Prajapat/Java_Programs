package com.Functions;

import java.util.Scanner;

public class Basic4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        int res = mul(10, 20);
        System.out.println("10 * 20 -> " + res);

        int result = mul(a, b);
        System.out.println(a+" * "+b+" -> "+ result);
    }

    private static int mul(int a, int b) {
        return a * b;
    }
}

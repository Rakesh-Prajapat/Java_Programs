package com.Functions;

import java.util.Scanner;

public class OddEvenUsingBit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int res = num & 1;

        String str = res == 1 ? "Odd" : "Even";
        System.out.println(str);
    }
}

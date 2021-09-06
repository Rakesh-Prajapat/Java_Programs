package com.Functions;

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt();
        int B = scn.nextInt();
        swap(A,B);
    }

    private static void swap(int A ,int B){

        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println(A);
        System.out.println(B);
    }
}

package com.Functions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt();
        int B = scn.nextInt();
        swap(A,B);
    }

    private static void swap(int A ,int B){
        int temp = A;
        A = B;
        B = temp;
        System.out.println(A);
        System.out.println(B);
    }
}

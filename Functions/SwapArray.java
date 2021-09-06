package com.Functions;

import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        swap(arr);

        for (int a : arr
        ) {
            System.out.print(a + " ");
        }
    }

    private static void swap(int[] pmi) {
        pmi[0] = 1000;
    }
}

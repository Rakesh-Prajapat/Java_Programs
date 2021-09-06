package com.Arrays;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        int max = findMin(arr);
        System.out.println(max);
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int val : arr) {
            min = Math.min(min, val);
        }
        return min;
    }
}

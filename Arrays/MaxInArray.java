package com.Arrays;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        int max = findMax(arr);
        System.out.println(max);
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
        }
        return max;
    }
}

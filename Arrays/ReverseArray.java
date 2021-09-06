package com.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[scn.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        reverse(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    private static void reverse(int[] copy) {
        int index1 = 0;
        int index2 = copy.length - 1;

        while (index1 <= index2) {
            swap(copy, index1, index2);
            index1++;
            index2--;
        }
    }

    private static void swap(int[] copy, int index1, int index2) {
        int temp = copy[index1];
        copy[index1] = copy[index2];
        copy[index2] = temp;
    }
}
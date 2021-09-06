package com.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        long t1 = System.currentTimeMillis();
        int index = linearSearch(arr, target);
        System.out.println(index);
        long t2 = System.currentTimeMillis();
        long timeTaken = t2 - t1;
        System.out.println(timeTaken);
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

package com.Arrays;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();

        int[][] arr = new int[row][1];

        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }
}

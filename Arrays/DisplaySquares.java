package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DisplaySquares {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int input = scn.nextInt();
            arr[i] = input * input;
        }
        System.out.println(Arrays.toString(arr));
    }
}

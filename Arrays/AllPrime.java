package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int input = scn.nextInt();
            int div = 2;
            boolean isPrime = input > 1;
            while (div * div <= input) {

                int rem = input % div;
                if (rem == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }
            if (isPrime)
                arr[i] = input;
        }
        System.out.println(Arrays.toString(arr));
    }
}

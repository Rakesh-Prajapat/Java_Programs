package com.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[scn.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int index1 = scn.nextInt();
        int index2 = scn.nextInt();

        swap(arr, index1, index2);

        for(int val:arr){
            System.out.print(val+" ");
        }
    }

    private static void swap(int[] copy, int index1, int index2) {
        int temp = copy[index1];
        copy[index1] = copy[index2];
        copy[index2] = temp;
    }
}
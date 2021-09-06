package com.Arrays;

import java.util.Scanner;

public class DisplayArrayElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for(int i = 0 ; i < size;i++){
            arr[i] = scn.nextInt();
        }
        displayElements(arr);
    }

    private static void displayElements(int[] arr) {
        for(int value : arr){
            System.out.println(value);
        }
    }
}

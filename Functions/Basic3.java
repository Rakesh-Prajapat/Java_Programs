package com.Functions;

import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        int sum = add();       //sum contains the value which is returned by add method
        System.out.println("sum is -> "+sum);
    }

    private static int add() {                //int specify that the function should return int type of value
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = scn.nextInt();

        System.out.println("Enter Second Number :");
        int num2 = scn.nextInt();

        return num1 + num2;    //return the sum of num1 and num2
    }
}

package com.Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        sum();                            //this step is known as function calling
    }
    static void sum(){                    // this step is called as function Definition

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = scn.nextInt();

        System.out.println("Enter Second Number :");
        int num2 = scn.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }

}

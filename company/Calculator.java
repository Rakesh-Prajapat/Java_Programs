package com.company;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ans = 0;

        while (true) {

            System.out.println("\nPlease Enter A Operator....!");
            char ch = scn.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {

                System.out.println("Please Enter Two Numbers....!");
                int num1 = scn.nextInt();

                int num2 = scn.nextInt();

                if (ch == '+') {
                    ans = num1 + num2;
                } else if (ch == '-') {
                    ans = num1 - num2;
                } else if (ch == '/') {
                    ans = num1 / num2;
                } else if (ch == '*') {
                    if (num2 != 0)
                        ans = num1 * num2;
                } else {
                    ans = num1 % num2;
                }
            } else if (ch == 'X' || ch == 'x') {
                break;
            } else {
                System.out.println("Invalid Operation...");
                continue;
            }
            System.out.println(ans);
        }
    }
}

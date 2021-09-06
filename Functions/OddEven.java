package com.Functions;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        boolean ans = oddEven(num);
        String str = ans ? "Even" : "Odd";
        System.out.println(str);
    }

    private static boolean oddEven(int num) {
        return num % 2 == 0;
    }
}


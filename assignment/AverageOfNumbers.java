package com.assignment;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int i = 1, sum = 0;

        while (i <= num) {
            int a = scn.nextInt();
            sum += a;
            i++;
        }
        double AVERAGE = sum / num;
        System.out.println(AVERAGE);
    }
}

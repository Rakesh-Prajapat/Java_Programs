package com.assignment;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int radius = scn.nextInt();
        double Area = 22 * Math.pow(radius,2)/7;
        System.out.println(Area);
    }
}

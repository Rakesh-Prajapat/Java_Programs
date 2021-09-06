package com.company;

import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float tempC = scn.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}

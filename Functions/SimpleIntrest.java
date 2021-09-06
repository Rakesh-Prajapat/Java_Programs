package com.Functions;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Principle..");
        int P = scn.nextInt();

        System.out.println("Enter The Rate Of Intrest...");
        float ROI = scn.nextFloat();

        System.out.println("Enter The Time Period...");
        float T = scn.nextFloat();

        float interest = findInterest(P, ROI, T);
        System.out.println("Interest after " + T + " years of " + P + "Rs is " + interest);
    }

    private static float findInterest(int p, float roi, float t) {
        return (p * roi * t) / 100;
    }
}

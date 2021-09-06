package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num_1 = scn.nextInt();

        int num_2 = scn.nextInt();

        int sum = num_1 + num_2;
        System.out.println("Sum of "+num_1+" and "+num_2+" is "+sum);
    }
}

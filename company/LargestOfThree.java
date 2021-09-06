package com.company;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num_1 = scn.nextInt();
        int num_2 = scn.nextInt();
        int num_3 = scn.nextInt();

        System.out.println(maxValue(num_1, num_2, num_3) + " is the largest number...");

        int max_Value = maxValueNew(num_1, num_2, num_3);
        System.out.println(max_Value +" is the largest number...");
    }

    public static int maxValue(int num_1, int num_2, int num_3) {
        if (num_1 > num_2 && num_1 > num_3) {
            return num_1;
        } else if (num_2 > num_3) {
            return num_2;
        } else {
            return num_3;
        }
    }

    public static int maxValueNew(int num_1, int num_2, int num_3) {
        int max = num_1;

        if (max < num_2) {
            max = num_2;
        }
        if (max < num_3) {
            max = num_3;
        }
        return max;
    }
}

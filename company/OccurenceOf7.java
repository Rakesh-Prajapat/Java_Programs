package com.company;

import java.util.Scanner;

public class OccurenceOf7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int check = scn.nextInt();

        int ans = findRepeat(num, check);
        System.out.println(ans);
    }

    public static int findRepeat(int num, int x) {
        int count = 0;
        while (num != 0) {
            int rem = num % 10;
            if (rem == x) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

}

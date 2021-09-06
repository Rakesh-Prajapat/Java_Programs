package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int totalNames = scn.nextInt();

        String[] names = new String[totalNames];
        for (int i = 0; i < names.length; i++) {
            names[i] = scn.next();
        }

        System.out.println(Arrays.toString(names));

        for (String str : names) {
            System.out.println(str);
        }
    }
}

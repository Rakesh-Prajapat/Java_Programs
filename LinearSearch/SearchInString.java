package com.LinearSearch;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        String[] names = new String[num];

        for (int i = 0; i < num; i++) {
            names[i] = scn.next();
        }
        String target = scn.next();
        int result = linearSearch(names, target);
        System.out.println(result);
    }

    private static int linearSearch(String[] names, String target) {
        if (names.length == 0) {
            return -1;
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}

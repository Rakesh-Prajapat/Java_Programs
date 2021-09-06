package com.LinearSearch;

import java.util.Scanner;

public class SearchCharacterInString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char ch = 'a';

        int index = linearSearch(str, ch);
        System.out.println(index);
    }

    private static int linearSearch(String str, char ch) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}

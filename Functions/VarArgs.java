package com.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(10, 20, "Rakesh", "Kumar");
    }

    private static void fun(int i, int i1, String ...as) {
        System.out.println(i +" "+i1);
        System.out.println(Arrays.toString(as));
    }
}

package com.Functions;

public class Shadow {
    static int x; //value of x is shadowed at line number 7 known as shadowing

    public static void main(String[] args) {
        System.out.println(x);
        int x = 1000;
        //scope begin when we provide the value to the variables
        System.out.println(x);
        test();
    }

    private static void test() {
        System.out.println(x);
    }
}

package com.Functions;

public class Scope {

    public static void main(String[] args) {
        int a = 10;

        {
            a = 100; //Can't initialise but modify the upper a because it is already defined in the same function
            int c = 10;
        }
       // System.out.println(c); //cannot use c which is of block type


        for (int i = 0; i <= 5 ; i++) {
            int num = 10;
            int sum = 0;
            System.out.println(num);
        }
        //System.out.println(i); //cannot use outside for because it can use only inside for loop
    }
}

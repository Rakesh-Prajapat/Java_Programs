package com.Functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println(isPrime);
    }

    private static boolean isPrime(int num) {
        if(num <= 0){
            return false;
        }
        int div = 2;
        while(div * div <= num){
            int rem = num % div;
            if(rem ==0){
                return false;
            }
            div++;
        }
        return true;
    }
}

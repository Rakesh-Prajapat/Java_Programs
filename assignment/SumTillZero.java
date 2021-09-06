package com.assignment;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {

        int sum = 0;
        while(true){
            Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();

            if(num == 0){
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}

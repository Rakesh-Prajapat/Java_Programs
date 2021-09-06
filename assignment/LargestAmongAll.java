package com.assignment;

import java.util.Scanner;

public class LargestAmongAll {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        while(true){
            Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();

            if(num == 0){
                break;
            }
            max = Math.max(max,num);
        }
        System.out.println(max);
    }
}

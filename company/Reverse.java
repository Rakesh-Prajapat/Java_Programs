package com.company;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int ans =  findReverse(num);
        System.out.println(ans);
    }

    public  static int findReverse(int num){

        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }
}

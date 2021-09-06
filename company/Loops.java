package com.company;

public class Loops {
    public static void main(String[] args) {

        int i = 1;
        while(i <= 10){
            System.out.print(i+" ");
            i++;
        }

        System.out.println();

        for (int count = 10 ; count > 0 ; count--) {
            System.out.print(count + " ");
        }

        System.out.println();

        int value = 50;

        do{
            if(value %  2 == 0)
            System.out.print(value+" ");

            value--;
        }while(value >= 0);

        System.out.println();
        for(int nums = 0 ; nums <= 50 ;nums++){
            if(nums % 2 != 0)
                System.out.print(nums+" ");
        }
    }
}

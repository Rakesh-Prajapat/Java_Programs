package com.assignment;

import java.util.Objects;
import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {

        int result = 0;
        int flag = 0;

        while(true){
            Scanner scn  = new Scanner(System.in);
            String str = scn.nextLine();

            if(Objects.equals(str, "x") || Objects.equals(str, "X")){
                flag = 1;
                break;
            }
            else {
                result += Integer.parseInt(str);
            }
        }
        System.out.println(result);
    }
}

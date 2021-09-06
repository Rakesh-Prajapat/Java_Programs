package com.Functions;

import java.util.Arrays;

public class VarArgs1 {
    public static void main(String[] args) {
       fun(10,20,30,40,50,60,70,80,90,100);
       fun("Rakesh","Sourabh","Piyush","Akash","Rahul");
//       fun(); -> It is known as Anbiguity because at runtime it never decide which function is call or which not..
    }

    private static void fun(int...abc){
        System.out.println(Arrays.toString(abc));
    }

    private static void fun(String...abc){
        System.out.println(Arrays.toString(abc));
    }
}


package com.Functions;
import java.util.Arrays;

public class VArgs {
    public static void main(String[] args) {
      fun(1,2,3,4,5,6,7,8,9,10,11,12);
      int result = add(1,2,3,4,5,6,7,8,9,10);
        System.out.println(result);
     }

    private static int add(int ...add) {
        int res=0;
        for(int a : add){
            res += a;
        }
        return res;
    }

    private static void fun(int ...val) {
        System.out.println(Arrays.toString(val));
    }
}

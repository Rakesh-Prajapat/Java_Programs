package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {

        ArrayList<Integer>  list = new ArrayList<>(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        System.out.println(list);
        list.set(0,100);
        for(int val:list){
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println(list.size());
    }
}

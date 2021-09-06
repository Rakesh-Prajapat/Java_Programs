package com.assignment;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int first_number = scn.nextInt();
        int second_number = scn.nextInt();

        int div = first_number;
        int dvd = second_number;

        while (dvd % div != 0) {
            int rem = dvd % div;
            dvd = div;
            div = rem;
        }
        int lcm = (first_number * second_number)/div;
        System.out.println("Gcd of " + first_number + " and " + second_number + " is -> " + div);
        System.out.println("Lcm of " + first_number + " and " + second_number + " is -> " + lcm);
    }
}

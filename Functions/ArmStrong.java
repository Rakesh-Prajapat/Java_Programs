package com.Functions;

public class ArmStrong {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            int sum = 0, num = i, n = i, count = 0;
            while (n != 0) {
                count++;
                n /= 10;
            }
            while (num != 0) {
                int rem = num % 10;
                sum += (int) Math.pow(rem, count);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i + " is the armStrong number...");
            }
        }
    }
}

package com.company;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int rollNo = scn.nextInt();
        String course = scn.next();

        switch (rollNo) {
            case 19:
            case 29:
                System.out.println("RollNo is -> " + rollNo);
                break;
            case 39:
                System.out.println("RollNo is -> " + rollNo);
                switch (course) {
                    case "MCA":
                    case "BCA":
                    case "B.TECH":
                    case "M.SC":
                        System.out.println("Course Name is -> " + course);
                        break;
                }
                break;
            default:
                System.out.println("Enter Correct RollNo....");
        }
    }
}

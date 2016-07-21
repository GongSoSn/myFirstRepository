package com.structure.cn;

import java.util.Scanner;

public class LeapYearCheck {
    private static void checkYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input a year : ");

        int year = scanner.nextInt();
        scanner.close();

        if (((year % 4) == 0 && (year % 100) != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year !");
        } else {
            System.out.println(year + " is not a leap year !");
        }
    }

    public static void main(String[] args) {
        checkYear();
    }
}

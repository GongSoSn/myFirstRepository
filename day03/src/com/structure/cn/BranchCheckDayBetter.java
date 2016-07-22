package com.structure.cn;

import java.util.Scanner;

public class BranchCheckDayBetter {
    private static int checkYear(int year) {
        int secondMonth = 0;
        if (((year % 4) == 0 && (year % 100) != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year !");
            return secondMonth = 29;
        } else {
            System.out.println(year + " is not a leap year !");
            return secondMonth = 28;
        }
    }

    private static int checkDay(int year, int Month, int day) {
        int monthDays = 0;
        switch (Month - 1) {
            case 11:
                monthDays += 31;
            case 10:
                monthDays += 30;
            case 9:
                monthDays += 31;
            case 8:
                monthDays += 31;
            case 7:
                monthDays += 30;
            case 6:
                monthDays += 30;
            case 5:
                monthDays += 31;
            case 4:
                monthDays += 30;
            case 3:
                monthDays += 31;
            case 2:
                monthDays += checkYear(year);
            default:
                monthDays += 31;
                break;
        }
        return monthDays + day;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("please input 'year','month','day'");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.close();
        System.out.println(checkDay(year, month, day));
    }
}

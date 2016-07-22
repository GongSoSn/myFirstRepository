package com.structure.cn;

import java.util.Scanner;

public class BranchTest {
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
        switch (Month) {
            case 1:
                monthDays = 31;
                break;
            case 2:
                monthDays = checkYear(year) + 31;
                break;
            case 3:
                monthDays = checkYear(year) + 31 * 2;
                break;
            case 4:
                monthDays = checkYear(year) + 31 * 2 + 30;
                break;
            case 5:
                monthDays = checkYear(year) + 31 * 3 + 30;
                break;
            case 6:
                monthDays = checkYear(year) + 31 * 3 + 30 * 2;
                break;
            case 7:
                monthDays = checkYear(year) + 31 * 4 + 30 * 2;
                break;
            case 8:
                monthDays = checkYear(year) + 31 * 5 + 30 * 2;
                break;
            case 9:
                monthDays = checkYear(year) + 31 * 5 + 30 * 3;
                break;
            case 10:
                monthDays = checkYear(year) + 31 * 6 + 30 * 3;
                break;
            case 11:
                monthDays = checkYear(year) + 31 * 6 + 30 * 4;
                break;
            default:
                monthDays = checkYear(year) + 31 * 7 + 30 * 4;
                break;
        }
        System.out.println("second ＝ " + checkYear(year));
        System.out.println("monthDays ＝ " + monthDays);
        System.out.println("day ＝ " + day);
        if (Month < 8 && Month % 2 != 0 && Month != 2) {
            monthDays = monthDays - 31;
        } else if (Month == 8 || Month == 10 || Month == 12) {
            monthDays = monthDays - 31;
        } else if (Month == 2) {
            monthDays = monthDays - 0;
        } else {
            monthDays = monthDays - 30;
        }
        return (monthDays + day);
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

package com.LoopTest.cn;

import java.util.Scanner;

public class FactorialTest {
    private static int getFactorial(int a) {
        int sum = 1;
        while (a > 1) {
            sum = sum + a * (a - 1);
            a--;
        }
        return sum;
    }

    private static void addFactorial(int f) {
        int a = 1;
        int sum = 1;
        while (a < 1) {

            sum += getFactorial(a);
            a++;
        }
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        System.out.println("please input a number : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        addFactorial(a);
    }
}

package com.LoopTest.cn;

import java.util.Scanner;

public class FactorialTest {
    private static int getFactorial(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }

    private static void addFactorial(int f) {
        int sum = 0;
        for (int a = 1; a <= f; a++) {
            sum += getFactorial(a);
        }
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        System.out.println("please input a number : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(getFactorial(a));
        addFactorial(a);
    }
}

package com.LoopTest.cn;

public class LoopWhileTest {
    private static void addWihle() {
        // Loop while
        int a = 1;
        int sum = 0;
        while (a < 101) {
            sum += a;
            a++;
        }
        System.out.println("while ==> sum = " + sum);
    }

    private static void addDoWhile() {
        int a = 0;
        int sum = 0;
        do {
            a++;
            sum += a;
        } while (a < 100);
        System.out.println("do..while ==> sum = " + sum);
    }

    public static void main(String[] args) {
        addWihle();
        addDoWhile();
    }
}

package com.operators.cn;

public class Test {
    public static void main(String[] args) {
        for (int a = 0; a < 100; a++) {
            if (a % 10 != 0) {
                System.out.print(a + " ");
                continue;
            }
            // System.out.print(a + " ");
        }
    }
}

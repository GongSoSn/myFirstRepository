package com.examTest.cn;

public class Monkey {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i < 10; i++) {
            sum = (sum + 1) * 2;
        }
        System.out.print(sum);
    }
}


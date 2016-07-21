package com.structure.cn;

import java.util.Scanner;

public class ASCTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Three numbers type of int : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Three Numbers print According to ASC : ");
        System.out.println(a + "," + b + "," + c);
    }

}

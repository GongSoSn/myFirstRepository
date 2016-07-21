package com.structure.cn;

import java.util.Scanner;

/**
 * Size comparison of three number,According to the descending output
 */
public class IfTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Three numbers type of int : ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.close();
        int Max = x;
        if (Max < y) {
            Max = y;
            if (x < z) {
                System.out.println("Three Numbers print According to Desc : ");
                System.out.println(Max + "\t" + x + "\t" + y);
            } else {
                System.out.println("Three Numbers print According to Desc : ");
                System.out.println(Max + "\t" + x + "\t" + z);
            }
        }
        if (Max < z) {
            Max = z;
            if (x < y) {
                System.out.println("Three Numbers print According to Desc : ");
                System.out.println(Max + "\t" + y + "\t" + x);
            } else {
                System.out.println("Three Numbers print According to Desc : ");
                System.out.println(Max + "\t" + x + "\t" + y);
            }

        }
    }
}

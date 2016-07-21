package com.structure.cn;

import java.util.Scanner;

public class IfTest {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input first Number type of int : ");
        int first = s.nextInt();
        System.out.println("Please input second Number type of int : ");
        int second = s.nextInt();
        System.out.println("Please input third Number type of int : ");
        int third = s.nextInt();
        int Max = first;
        // compare
        if (Max < second) {
            Max = second;
        }
        if (Max < third) {
            Max = third;
        }
        System.out.println("Print Max : " + Max);

    }
}

package com.ArraysTest.cn;

import java.util.Arrays;

public class MethodTest {
    public static void main(String[] args) {
        // 'fill'
        int[] fillTest = new int[5];
        Arrays.fill(fillTest, 99);
        System.out.print("fill Method :" + "\t");
        for (int i : fillTest) {
            System.out.print(i + "  ");
        }
        System.out.println("\n****************************************\n");
        // 'copyOf'
        int[] copyOf;
        copyOf = Arrays.copyOf(fillTest, 7);
        System.out.print("copyOf Method :" + "\t");
        for (int i = 0; i < copyOf.length; i++) {
            System.out.print(copyOf[i] + "  ");
        }
        System.out.println("\n****************************************\n");
        // 'sort'
        int[] sortTest = {2, 5, 1, 8, 4, 5, 7, 2};
        System.out.println("sort Method call before: ");
        for (int i : sortTest) {
            System.out.print(i + "  ");
        }
        System.out.println("\nsort Method : ");
        Arrays.sort(sortTest);
        for (int i : sortTest) {
            System.out.print(i + "  ");
        }
        System.out.println("\n****************************************\n");
        // 'binarysearch'
        int b = Arrays.binarySearch(sortTest, 8);
        System.out.println("binarySearch method ：" + b);

    }
}

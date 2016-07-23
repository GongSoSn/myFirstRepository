package com.operators.cn;

public class DifferentTest {
    /**
     * Testing the comparison of 'break','continue','return'
     */
    // 'Continue'
    private static void testContinue() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j % 3 == 0) {
                    continue;
                }
                System.out.print("i = " + i + ",j = " + j + "  ");
            }
        }
        System.out.println("\tcontinue");
    }

    // 'break'
    private static void testBreak() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j % 3 == 0) {
                    break;
                }
                System.out.print("i = " + i + ",j = " + j + "  ");
            }
        }
        System.out.println("\tbreak");
    }

    // 'return'
    private static void testReturn() {
        for (int i = 1; i < 10; i++) {
            if (i / 2 != 0) {
                return;
            }
            System.out.print(i);
        }
        System.out.println("return");
    }

    public static void main(String args[]) {
        testContinue();
        System.out.println();
        testBreak();
        System.out.println();
        testReturn();
    }
}

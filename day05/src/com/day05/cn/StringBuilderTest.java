package com.day05.cn;

public class StringBuilderTest {
    public static void main(String[] args) {
        long start01 = System.currentTimeMillis();
        String str = " ";
        for (int i = 0; i < 20000; i++) {
            str = str + i;
        }
        long end01 = System.currentTimeMillis();
        System.out.println(end01 - start01);
        long startBuffer = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < 20000; i++) {
            sf.append(i);
        }
        long endBuffer = System.currentTimeMillis();
        System.out.println(endBuffer - startBuffer);
        long startBuilder = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            sbd.append(i);
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println(endBuilder - startBuilder);
    }
}

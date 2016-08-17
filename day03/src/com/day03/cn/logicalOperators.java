package com.day03.cn;

public class logicalOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //renjianyong
        boolean test = a > b;
        boolean test01 = a < b;

        System.out.println("test : " + test);
        System.out.println("test01 : " + test01);
        System.out.println("*******************************");

        boolean test03 = test ^ test01;// false ^ true(异或)

        System.out.println("test03 : " + test03);// true

        boolean test04 = !test ^ test;
        System.out.println("test04 : " + test04);

        /*
         * Logical And (&), Logical or(|)
         */

        System.out.println("Logical And (&), Logical or(|)");

        System.out.println("L_And : " + (true & false));// false
        System.out.println("L_Or : " + (true | false));// true

        System.out.println("Short Logical And,or !");

        System.out.println("Short And : " + ((1 > 2) && (1 < 2)));// false
        System.out.println("Short or : " + (1 < 2 || 2 < 3));// true

        char c = 'A';
        // System.out.println(c);
        char ch = (char) (c + 1);
        System.out.println(ch);

        double a1 = 12.345678;

        int a2 = (int) (a1 * 100 + 0.5);// 1235.0678
        System.out.println((a1 * 100 + 0.5));
        System.out.println((int) (123.6789));
        System.out.println(a2);
        double a3 = (double) a2 / 100;// 1235.0/100
        System.out.println((double) a2);
        System.out.println(a3);
        double hh = 12.0000000000000000;
        System.out.println(hh);
        System.out.println(((double) 1235) / 100);
        int ￥ii = 9;// This is a legal identifier;
    }
}

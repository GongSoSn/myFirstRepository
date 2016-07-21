package com.day03.cn;

public class logicalOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        boolean test = a > b;
        boolean test01 = a < b;

        System.out.println("test : " + test);
        System.out.println("test01 : " + test01);
        System.out.println("*******************************");

        boolean test03 = test ^ test01;// false ^ true(异或)

        System.out.println("test03 : " + test03);// true

        boolean test04 = !test ^ test;
        System.out.println("test04 : " + test04);
    }
}

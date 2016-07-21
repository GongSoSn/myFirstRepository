package com.ThinkingInJava.cn;

public class AnotherNameTest {

    public static void main(String args[]) {
        TestFloat t1 = new TestFloat();
        TestFloat t2 = new TestFloat();

        t1.f1 = 1.1f;
        t2.f1 = 2.2f;

        System.out.println("old t1.f1 = " + t1.f1);
        System.out.println("old t2.f1 = " + t2.f1);

        t1 = t2;
        t2.f1 = 3.3f;
        System.out.println("new t1.f1 = " + t1.f1);
        System.out.println("new t2.f1 = " + t2.f1);
    }
}


class TestFloat {
    float f1;
}

package com.day05.cn;

public class StringBufferTest {
    public static void main(String[] args) {

        String strSetCharAt = "aaaa";
        StringBuffer Buffer = new StringBuffer();
        System.out.println(Buffer.hashCode());
        Buffer = Buffer.append("AAAAAAAAAAAA");
        System.out.println(Buffer);
        System.out.println(Buffer.hashCode());
        // 'setCharAt'
        Buffer.setCharAt(1, 'a');
        System.out.println(Buffer);
        System.out.println(Buffer.hashCode());
        // 'charAt'
        System.out.println(Buffer.charAt(1));
    }
}

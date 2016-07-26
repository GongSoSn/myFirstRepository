package com.ArraysTest.cn;

public class test {
    public static void main(String[] args) {
        // int beginIndex = 0, endIndex = 0;
        // for (int j = 0; j < 5; j++) {
        // for (int k = 0; k < "aaa&111&a&男&23".length(); k++) {
        // endIndex = "aaa&111&a&男&23".charAt('&');
        // beginIndex = endIndex + 1;
        // // players[i].substring(beginIndex, endIndex);
        // }
        // System.out.print("aaa&111&a&男&23".substring(beginIndex, endIndex) + " ");
        // }

        // System.out.println("aaa&111&a&男&23".charAt('&'));
        // boolean[][] test = new boolean[2][3];

        // for (boolean[] is : test) {
        // for (boolean i : is) {
        // System.out.println(i);
        // }
        // }
        String str = "aaa&111&a&男&23";
        String[] s = str.split("\\&");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + "  ");
        }
    }
}

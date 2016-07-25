package com.day05.cn;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";

        System.out.println("str1 == str2 : " + (str1 == str2));

        String str3 = new String("ABC");
        System.out.println("\nstr1 == str3 : " + (str1 == str3));
        // int str1Hash = str1.hashCode();
        // int str2Hash = str2.hashCode();
        // int str3Hash = str3.hashCode();
        System.out.println("str3Hash : " + str3.hashCode());
        str3 += str3 + "DE";
        System.out.println("str1Hash : " + str1.hashCode());
        System.out.println("str2Hash : " + str2.hashCode());
        System.out.println("str3Hash : " + str3.hashCode());
    }
}

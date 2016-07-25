package com.day05.cn;

public class StringMethodTest {
    public static void main(String[] args) {
        // 'Length'
        String strLength = "abc";
        System.out.println("strLength Length : " + strLength.length());
        System.out.println("*******************************************\n");
        // 'charAt'
        String strCharAt = "0123456";
        System.out.println("index : " + strCharAt.charAt(4));
        System.out.println("*******************************************\n");
        // 'contains'
        String strContains = "abcdef";
        System.out.println(
                "strContains中是否存在字符串“de” ? " + (strContains.contains("de") ? " Yes " : " No "));
        System.out.println("*******************************************\n");
        // 'indexOf'
        String strIndexOf = "Hello World !";
        System.out.println("'r' 在字符串strIndexOf中的索引是 ： " + strIndexOf.indexOf('r'));
        System.out.println("'rl' 在字符串strIndexOf中的索引是 ： " + strIndexOf.indexOf("rl"));
        System.out.println("*******************************************\n");
        // 'substring'
        String strSub = "basketball";
        System.out.println(strSub.substring(6));
        System.out.println(strSub.substring(6, 9));// index begin(inclusive)|| index
                                                   // ending(exclusive)
        System.out.println(strSub.substring(0, 6));
        System.out.println("*******************************************\n");
        // 'equals'
        String strEquals = "test";
        System.out.println(strEquals.equals("Test"));
        String strEqualsIgnore = "Test";
        System.out.println(strEqualsIgnore.equalsIgnoreCase("test"));
        System.out.println("*******************************************\n");
        // 'compareTo'
        String strCompare = "Compare";
        String strCompareTo = "CompareTo";
        System.out.println(strCompare.compareTo(strCompareTo));// compare by String`Length
        System.out.println("*******************************************\n");
        // 'toUpperCase'
        String strUpper = "a";
        System.out.println("a to Upper : " + strUpper.toUpperCase());
        System.out.println("*******************************************\n");
        // 'toLowerCase'
        String strLower = "A";
        System.out.println("A to Lower : " + strLower.toLowerCase());
        System.out.println("*******************************************\n");
        // 'replace'
        String strReplace = "replaceAB";
        System.out.println("replaceAB == > " + strReplace.replace("AB", "ab"));
        System.out.println(strReplace.replace(strReplace, "new"));
        System.out.println("*******************************************\n");
        // 'startsWith'
        String strStart = "start";
        System.out.println(strStart.startsWith("s"));
        System.out.println(strStart.startsWith("S"));// 区分大小写
        System.out.println(strStart.startsWith("ss"));
        System.out.println("*******************************************\n");
        // 'endsWith'
        String strEnd = "ending";
        System.out.println(strEnd.endsWith("g"));
        System.out.println(strEnd.endsWith("G"));
        System.out.println(strEnd.endsWith("gf"));
        System.out.println("*******************************************\n");
    }
}

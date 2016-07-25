package com.day05.cn;

public class testDemo {
    public static void main(String[] args) {
        /**
         * 第一种方法
         */
        String str = "how are you hOw Old are you".toLowerCase();
        String str1 = "o";
        int count = 0;
        int start = 0;
        while (str.indexOf(str1, start) >= 0 && start < str.length()) {
            count++;
            start = str.indexOf(str1, start) + str1.length();
        }
        System.out.println("第一种方法");
        System.out.println(" “ " + str1 + " ” " + " 在 " + str + " 出现的次数为 " + count + "次 ！");


        // String str = "how are you hOw Old are you".toLowerCase();
        // int count = 0;
        // int j = 0;
        // for (int i = 0; i < str.length(); i++) {
        // j = str.indexOf('o', j) + 1;
        // System.out.println(j);
        // }

        /**
         * 第二种方法
         */
        String strSecond = "how are you hOw Old are you".toLowerCase();
        int countSecond = 0;
        int j = 0;
        for (int i = 0; i < strSecond.length(); i++) {
            if (strSecond.charAt(i) == 'o') {
                countSecond++;
            }
        }
        System.out.println("第二种方法 : ");
        System.out.println(countSecond);
    }
}

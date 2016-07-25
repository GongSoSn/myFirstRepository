package com.day05.cn;

import java.util.Scanner;

public class IdentifyExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个身份证号 ： ");
        String identify = scanner.next();
        scanner.close();
        String year = identify.substring(6, 10);
        String month = identify.substring(10, 12);
        String day = identify.substring(12, 14);
        System.out.println("该身份证持有者的生日是 ： " + year + " 年 " + month + " 月 " + day + " 日 ！");

    }
}

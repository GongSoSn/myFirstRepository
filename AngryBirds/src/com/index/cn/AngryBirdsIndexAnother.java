package com.index.cn;

import java.util.Scanner;

public class AngryBirdsIndexAnother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************************\n");
        System.out.println("\t\t愤  怒  的  小  鸟\t\t\n");
        System.out.print("请选择登录方式:      ");
        System.out.println("1、玩家登陆           2、管理员登录        0、退出");
        System.out.println("\n**********************************************\n");
        // Login Type Choose
        int type = scanner.nextInt();
        switch (type) {
            case 1:
                System.out.println("**********************************************\n");
                System.out.println("\t\t玩   家   登   陆\t\t\n");
                System.out.println("请输入用户名:");
                System.out.println("请输入密码:");
                System.out.println("\n**********************************************\n");
                String userName = scanner.next();
                String userPwd = scanner.next();
                if (userName.equals("player") && userPwd.equals("player")) {
                    System.out.println("**********************************************\n");
                    System.out.println("\t\t愤  怒  的  小  鸟\t\t\n");
                    System.out.println("\t\t1、开始游戏           \n\t\t2、查看成绩        \n\t\t0、返回上级");
                    System.out.println("\n**********************************************\n");
                }
                break;
            case 2:
                System.out.println("**********************************************\n");
                System.out.println("\t\t管   理   员   登   陆\t\t\n");
                System.out.println("请输入用户名:");
                System.out.println("请输入密码:");
                System.out.println("\n**********************************************\n");
                String adminName = scanner.next();
                String adminPwd = scanner.next();
                for (int count = 1; count <= 3; count++) {
                    if (adminName.equals("admin") && adminPwd.equals("admin")) {
                        System.out.println("**********************************************\n");
                        System.out.println("\t\t系   统   管   理\t\t\n");
                        System.out.println(
                                "\t\t1、新 增 玩 家           \n\t\t2、修 改 玩 家        \n\t\t3、删 除 玩 家\n\t\t4、查 询 玩 家\n\t\t5、查 询 游 戏\n\t\t6、分 数 统 计\n\t\t7、参 数 设 置\n\t\t0、返 回");
                        System.out.println("\n**********************************************\n");
                        break;
                    } else {
                        if ((3 - count) > 0) {
                            System.out.println("你还有" + (3 - count) + "机会 ！\n");
                            System.out.println("**********************************************\n");
                            System.out.println("\t\t管   理   员   登   陆\t\t\n");
                            System.out.println("请输入用户名:");
                            System.out.println("请输入密码:");
                            System.out
                                    .println("\n**********************************************\n");
                            adminName = scanner.next();
                            adminPwd = scanner.next();
                        }
                    }
                }
                scanner.close();
                break;
            case 0:
                System.out.println("游戏退出 ！！");
                break;
            default:
                break;
        }
    }
}

package com.index.cn;

import java.util.Scanner;

public class AngryBirdIndex {
    // index
    public static void index() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************************\n");
        System.out.println("\t\t愤  怒  的  小  鸟\t\t\n");
        System.out.print("请选择登录方式:      ");
        System.out.println("1、玩家登陆           2、管理员登录        0、退出");
        System.out.println("\n**********************************************\n");
        int type = scanner.nextInt();
        loginType(type);
    }

    // Players Login
    public static void playersLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************************\n");
        System.out.println("\t\t玩   家   登   陆\t\t\n");
        System.out.println("请输入用户名:");
        System.out.println("请输入密码:");
        System.out.println("\n**********************************************\n");
        String userName = scanner.next();
        String userPwd = scanner.next();
        checkUser(userName, userPwd, "player");
    }

    // adminLogin
    static int count = 0;

    public static void adminLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************************\n");
        System.out.println("\t\t管   理   员   登   陆\t\t\n");
        System.out.println("请输入用户名:");
        System.out.println("请输入密码:");
        System.out.println("\n**********************************************\n");
        String userName = scanner.next();
        String userPwd = scanner.next();
        // int count = 1;
        if (!checkUser(userName, userPwd, "admin")) {
            count++;
            // System.out.println(count);
            while (count > 3) {
                // 退出游戏

                System.out.println("退出游戏......");
                index();
            }
            adminLogin();
        };
    }

    // check user.name,user.pwd
    public static boolean checkUser(String n, String p, String t) {
        boolean flag = false;
        if (n.equals("admin") && p.equals("admin") && t.equals("player")) {
            System.out.println("**********************************************\n");
            System.out.println("\t\t愤  怒  的  小  鸟\t\t\n");
            System.out.println("\t\t1、开始游戏           \n\t\t2、查看成绩        \n\t\t0、返回上级");
            System.out.println("\n**********************************************\n");
            return flag = true;
        } else if (n.equals("admin") && p.equals("admin") && t.equals("admin")) {
            System.out.println("**********************************************\n");
            System.out.println("\t\t系   统   管   理\t\t\n");
            System.out.println(
                    "\t\t1、新 增 玩 家           \n\t\t2、修 改 玩 家        \n\t\t3、删 除 玩 家\n\t\t4、查 询 玩 家\n\t\t5、查 询 游 戏\n\t\t6、分 数 统 计\n\t\t7、参 数 设 置\n\t\t0、返 回");
            System.out.println("\n**********************************************\n");
            return flag = true;
        }
        return flag;
    }

    // LoginType choose
    public static void loginType(int a) {
        switch (a) {
            case 1:
                playersLogin();
                break;
            case 2:
                adminLogin();
                break;

            case 0:
                System.out.println("游戏结束。。。。。。");
                break;
        }
    }

    public static void main(String[] args) {
        index();
    }
}

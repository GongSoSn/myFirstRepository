package com.index.cn;

import java.util.Scanner;

public class AngryBirdsIndexAnother {
    public static void main(String[] args) {
        boolean flag = true;
        String[] players = new String[1];
        // String[][] playerMessage = new String[1][5];



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
                        int adminType = scanner.nextInt();
                        // String[] players = new String[1];
                        // String[][] playerMessage = new String[1][5];


                        switch (adminType) {
                            case 1:// 新增玩家
                                while (flag) {
                                    for (int i = 0; i < players.length; i++) {
                                        players[i] = scanner.next();
                                    }
                                    for (String strings : players) {
                                        String[] playerMessage = strings.split("\\&");
                                        for (String string : playerMessage) {
                                            System.out.print(string + "  ");
                                        }
                                    }
                                    System.out.println();
                                    System.out.println("如果不添加玩家请输入‘N’");
                                    String YesOrNo = scanner.next();
                                    if (YesOrNo.equals("N")) {
                                        flag = false;
                                    }
                                }
                                // System.out.println(
                                // "**********************************************\n");
                                // System.out.println("\t\t系 统 管 理\t\t\n");
                                // System.out.println(
                                // "\t\t1、新 增 玩 家 \n\t\t2、修 改 玩 家 \n\t\t3、删 除 玩 家\n\t\t4、查 询 玩
                                // 家\n\t\t5、查 询 游 戏\n\t\t6、分 数 统 计\n\t\t7、参 数 设 置\n\t\t0、返 回");
                                // System.out.println(
                                // "\n**********************************************\n");
                                break;
                            case 2:// 修改玩家

                                break;
                            case 3:// 删除玩家

                                break;
                            case 4:// 查询玩家
                                   // 遍历玩家信息
                                /*
                                 * test using... ...add start
                                 */
                                // players[0] = "aaa & 111 & a & 男 & 23";
                                // players[1] = "aaa & 111 & a & 男 & 23";
                                // players[2] = "aaa & 111 & a & 男 & 23";
                                /*
                                 * test using... ...add end
                                 */
                                for (int i = 0; i < players.length; i++) {
                                    // 处理每一个玩家信息
                                    // playerMessage[i] = players[i].split("\\&");
                                    // for (int j = 0; j < playerMessage[i].length; j++) {
                                    // System.out.print(playerMessage[i][j] + " ");
                                    // }
                                    // System.out.println();
                                }
                                break;
                            case 5:// 查询游戏

                                break;
                            case 6:// 分数统计

                                break;
                            case 7:// 参数设置

                                break;
                            case 0:// 返回

                                break;

                            default:
                                break;

                        }

                        break;// TODO
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
                // scanner.close();
                break;
            case 0:
                System.out.println("游戏退出 ！！");
                break;
            default:
                break;
        }
    }
}

package com.index.cn;

import java.util.Scanner;

public class AngryBirdGame {
    public static void main(String[] args) {
        boolean loop = true;
        // 声明控制新增玩家循环的开关
        boolean flag = true;
        // 声明存放玩家信息的数组
        String[] players = new String[20];
        // 声明用于指定数组索引的标识符
        int index = 0;

        while (loop) {
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
                    // 遍历玩家信息
                    String loginName = null;
                    String loginPass = null;
                    for (String player : players) {
                        // 排除数组为空
                        if (player != null && player != "") {
                            String[] loginUser = player.split("&");
                            for (int i = 0; i < players.length; i++) {
                                loginName = loginUser[0];
                                loginPass = loginUser[1];
                                // 用户名和密码验证验放在循环中，避免验证的只能是最后一个输入的用户信息
                                if (userName.equals(loginName) && userPwd.equals(loginPass)) {
                                    System.out.println(loginName + " 您好！您已登录成功！");
                                    System.out.println(
                                            "**********************************************\n");
                                    System.out.println("\t\t愤  怒  的  小  鸟\t\t\n");
                                    System.out.println(
                                            "\t\t1、开始游戏           \n\t\t2、查看成绩        \n\t\t0、返回上级");
                                    System.out.println(
                                            "\n**********************************************\n");
                                    break;
                                }
                            }
                        }
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
                            System.out
                                    .println("\n**********************************************\n");
                            int adminType = scanner.nextInt();
                            switch (adminType) {
                                case 1:// 新增玩家
                                    while (flag) {
                                        // 输入玩家相关信息
                                        System.out.println("请输入玩家姓名:");
                                        String playerName = scanner.next();
                                        System.out.println("请输入玩家密码:");
                                        String playerPass = scanner.next();
                                        System.out.println("请输入玩家昵称:");
                                        String playerNick = scanner.next();
                                        System.out.println("请输入玩家性别:");
                                        String playerSex = scanner.next();
                                        System.out.println("请输入玩家年龄:");
                                        String playerAge = scanner.next();
                                        // 转换格式a&b&c&d
                                        String playerMessages = playerName + "&" + playerPass + "&"
                                                + playerNick + "&" + playerSex + "&" + playerAge;
                                        // 将玩家信息存放在声明好的数组中
                                        players[index] = playerMessages;
                                        index++;
                                        // 提示是否结束新增玩家操作
                                        System.out.println("是否结束添加新增玩家？ [Y/N]");
                                        String addEnd = scanner.next();
                                        if (addEnd.equalsIgnoreCase("N")) {
                                            flag = false;
                                            System.out.println(
                                                    "添加的玩家信息如下：\n玩家姓名\t玩家密码\t玩家昵称\t玩家性别\t玩家年龄");
                                            for (String player : players) {
                                                // 排除数组元素为空的情况
                                                if (player != null && player != "") {
                                                    String[] showPlayer = player.split("&");
                                                    for (String string : showPlayer) {
                                                        System.out.print(string + "\t");
                                                    }
                                                    System.out.println();
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 2:// 修改玩家
                                       // 首先遍历一下玩家信息
                                    System.out.println("添加的玩家信息如下：\n玩家姓名\t玩家昵称\t玩家性别\t玩家年龄");
                                    for (String player : players) {
                                        // 排除数组元素为空的情况
                                        if (player != null && player != "") {
                                            String[] showPlayer = player.split("&");
                                            for (String showOut : showPlayer) {
                                                System.out.print(showOut + "\t");
                                            }
                                            System.out.println();
                                        }
                                    }
                                    // 修改玩家操作
                                    // ①获取需要修改的玩家(通过匹配姓名找到需要修改的玩家)
                                    System.out.println("请您输入需要修改的名字:");
                                    String modName = scanner.next();
                                    // 判断是否存在此玩家
                                    for (int z = 0; z < players.length; z++) {
                                        // 排除数组中不符合要求的元素
                                        if (players[z] != null && players[z] != "") {
                                            // 拆分玩家信息，找到‘玩家姓名’
                                            String[] modMessages = players[z].split("&");// TODO
                                            for (int i = 0; i < players.length; i++) {
                                                String checkName = modMessages[0];
                                                // 验证此玩家是不是存在
                                                if (modName.equals(checkName)) {
                                                    System.out.println(
                                                            "您已经选中  " + modName + " 玩家，请您修改相关信息 ！");
                                                    // ②开始修改玩家信息(实现的功能：只能修改除了玩家姓名之外的信息)
                                                    System.out.println("请您输入需要修改的玩家密码 ！");
                                                    modMessages[1] = scanner.next();
                                                    System.out.println("请您输入需要修改的玩家昵称 ！");
                                                    modMessages[2] = scanner.next();
                                                    System.out.println("请您输入需要修改的玩家性别 ！");
                                                    modMessages[3] = scanner.next();
                                                    System.out.println("请您输入需要修改的玩家年龄 ！");
                                                    modMessages[4] = scanner.next();
                                                    // 拼接当前的玩家信息(A&A&A&A&A..)
                                                    String modPlayer = modMessages[0] + "&"
                                                            + modMessages[1] + "&" + modMessages[2]
                                                            + "&" + modMessages[3] + "&"
                                                            + modMessages[4];
                                                    // 新修改的用户添加到数组中
                                                    // ①获取当前用户在数组中的索引(必须在当前的索引上修改)
                                                    int newIndex = z;
                                                    players[newIndex] = modPlayer;
                                                    break;
                                                } else {
                                                    System.out.println("您输入的玩家不存在，请重新输入 ！");
                                                }
                                            }
                                        }
                                    }

                                    break;
                                case 3:// 删除玩家

                                    break;
                                case 4:// 查询玩家
                                       // 遍历玩家信息
                                    System.out.println("添加的玩家信息如下：\n玩家姓名\t玩家昵称\t玩家性别\t玩家年龄");
                                    for (String player : players) {
                                        // 排除数组元素为空的情况
                                        if (player != null && player != "") {
                                            String[] showPlayer = player.split("&");
                                            for (int i = 0; i < showPlayer.length; i++) {
                                                // 查询时，密码不可见！
                                                if (i != 1) {
                                                    System.out.print(showPlayer[i] + "\t");
                                                }
                                            }
                                            System.out.println();
                                        }
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
                            break;
                        } else {
                            if ((3 - count) > 0) {
                                System.out.println("你还有" + (3 - count) + "机会 ！\n");
                                System.out.println(
                                        "**********************************************\n");
                                System.out.println("\t\t管   理   员   登   陆\t\t\n");
                                System.out.println("请输入用户名:");
                                System.out.println("请输入密码:");
                                System.out.println(
                                        "\n**********************************************\n");
                                adminName = scanner.next();
                                adminPwd = scanner.next();
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("游戏退出 ！！");
                    break;
                default:
                    break;
            }
        }

    }
}

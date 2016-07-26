package com.hyhu.demo;

import java.util.Scanner;

public class AbGame {

    public static void main(String[] args) {
        boolean bool = true;
        String[] plays = new String[5];
        int j = 0;
        boolean pl = true;

        while (bool) {
            System.out.println("************************");
            System.out.println();
            System.out.println("\t�� ŭ �� С ��");
            System.out.println("��ѡ���¼��ʽ��");
            System.out.println();
            System.out.println("1.��ҵ�½  2.����Ա��½    0.�˳�");
            System.out.println();
            System.out.println("************************");
            Scanner sc = new Scanner(System.in);
            System.out.println("�����������:");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("������ҵ�½����");
                    for (int k = 1; k <= 3; k++) {
                        System.out.println("��������ҵ�½��");
                        String playName = sc.next();
                        System.out.println("�������������");
                        String playPwd = sc.next();
                        System.out.println("�����û���:" + playName + ",��������:" + playPwd);
                        for (String pls : plays) {
                            if (pls != null && pls.length() > 0) {
                                String[] s = pls.split("&");
                                String loginName = s[0];
                                String loginPwd = s[1];
                                // System.out.println("��¼��:"+loginName+",����:"+loginPwd);
                                if (playName.equals(loginName) && playPwd.equals(loginPwd)) {
                                    System.out.println("************************");
                                    System.out.println("\t�� ŭ �� С ��");
                                    System.out.println();
                                    System.out.println("1���� ʼ �� Ϸ");
                                    System.out.println();
                                    System.out.println("2���� �� �� ��");
                                    System.out.println();
                                    System.out.println("0���� �� ��  ��");
                                    System.out.println("************************");
                                    int in = sc.nextInt();
                                    switch (in) {
                                        case 1:
                                            System.out.println("��ʼ��Ϸ");
                                            break;
                                        case 2:
                                            System.out.println("�鿴�ɼ�");
                                            break;
                                        case 0:
                                            System.out.println("������һ��");
                                            break;

                                        default:
                                            System.out.println("û�д�ѡ��");
                                            break;
                                    }


                                } else {
                                    if (3 - k == 0) {
                                        System.out.println("��λ��������,�˺ű�����");
                                    } else {
                                        System.out.println("�û�����������,����" + (3 - k) + "�λ��");
                                    }

                                }
                            }
                        }
                    }
                    break;
                case 2:

                    for (int a = 1; a <= 3; a++) {

                        System.out.println("���������Ա�û���:");
                        String adminName = sc.next();
                        System.out.println("���������Ա����:");
                        String adminPwd = sc.next();
                        System.out.println("�û���:" + adminName + ",����:" + adminPwd);
                        if (adminName.equals("admin") && adminPwd.equals("admin")) {
                            System.out.println("************************");
                            System.out.println("\tϵͳ����");
                            System.out.println();
                            System.out.println("1���� �� �� ��");
                            System.out.println();
                            System.out.println("2���޸����");
                            System.out.println();
                            System.out.println("3��ɾ �� �� ��");
                            System.out.println();
                            System.out.println("4���� ѯ �� ��");
                            System.out.println();
                            System.out.println("5���� ѯ �� Ϸ");
                            System.out.println();
                            System.out.println("6���� �� ͳ ��");
                            System.out.println();
                            System.out.println("7���� �� �� ��");
                            System.out.println();
                            System.out.println("0���� �� �� ��");

                            System.out.println("************************");
                            System.out.println("�����������:");
                            int b = sc.nextInt();// ��ȡint���͵�����
                            switch (b) {
                                case 1:
                                    while (pl) {
                                        System.out.println("��ҵĵ�¼��:");
                                        String loginName = sc.next();
                                        System.out.println("�������:");
                                        String loginPwd = sc.next();
                                        System.out.println("����ǳ�:");
                                        String loginNick = sc.next();
                                        System.out.println("����Ա�:");
                                        String loginSex = sc.next();
                                        System.out.println("�������:");
                                        String loginAge = sc.next();
                                        String sumLogin = loginName + "&" + loginPwd + "&"
                                                + loginNick + "&" + loginSex + "&" + loginAge;
                                        System.out.println("���������Ϣ:" + sumLogin);
                                        plays[j] = sumLogin;
                                        j++;
                                        System.out.println("�Ƿ����������� ��:N");
                                        String n = sc.next();
                                        if ("N".equals(n)) {
                                            pl = false;
                                        }

                                    }
                                    break;
                                case 4:
                                    System.out.println("���ǲ�ѯ��ҽ���");
                                    System.out.println("��ҵ�¼��\t�������\t����ǳ�\t����Ա�\t�������");

                                    for (String playLogin : plays) {
                                        if (playLogin != null && playLogin.length() > 0) {
                                            String player[] = playLogin.split("&");
                                            for (String p : player) {
                                                System.out.print(p + "\t");
                                            }
                                            System.out.println();
                                        }
                                    }

                                    break;
                                default:
                                    System.out.println("û�д�ѡ��");
                            }

                            break;
                        } else {
                            if (3 - a == 0) {
                                System.out.println("�����������ѵ�,�ѱ���");
                            } else {
                                System.out.println("�û���������������,�㻹��" + (3 - a) + "�λ��");
                            }
                        }

                    }

                    break;
                case 0:
                    System.out.println("ϵͳ�˳�.....");
                    break;
                default:
                    System.out.println("û�д�ѡ��");
            }

        }
        System.out.println("��Ϸ����");

    }

}

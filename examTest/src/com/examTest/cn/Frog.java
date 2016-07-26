package com.examTest.cn;


public class Frog {

    private static int getOutDays(int wellDepth, int dayUp, int nightDown) {
        int nowDepth = 0;
        int days = 0;

        while (nowDepth + dayUp < wellDepth) {
            days++;
            nowDepth += dayUp - nightDown;
            System.out.println("第" + days + "天过去了，目前位置距离井底" + nowDepth + "米！");
        }

        System.out.println("第" + (++days) + "天:爬出来了。");
        return days;

    }

    public static void main(String[] args) {

        int wellDepth = 7;
        int dayUp = 3;
        int nightDown = 2;
        int days = getOutDays(wellDepth, dayUp, nightDown);

        System.out.println("小青蛙用了" + days + "天爬出井口！");
    }
}

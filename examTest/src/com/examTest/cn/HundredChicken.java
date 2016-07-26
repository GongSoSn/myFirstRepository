package com.examTest.cn;

public class HundredChicken {
    public static void main(String[] args) {
        int x, y, z;
        for (x = 1; x < 20; x++) {
            for (y = 1; y < 33; y++) {
                if (x * 5 + y * 3 <= 100) {
                    z = 3 * (100 - (x * 5 + y * 3));
                    if (x + y + z == 100) {
                        System.out.print("公鸡、母鸡、小鸡数目分别是：" + x);
                        System.out.print(" " + y);
                        System.out.println(" " + z);
                    }
                }
            }
        }
    }
}

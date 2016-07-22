package com.operators.cn;

public class StringOperator {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x,y,z";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);// convert 'x' to String !
        s += "(summed) = ";
        System.out.println(s + (x + y + z));
    }
}

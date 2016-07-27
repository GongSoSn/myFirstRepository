package com.OOP1.cn;

public class Doctor {
    String name;// 姓名
    Patient patient;// 挂号的病人
    public static int n = 10;

    // 开药方法
    public void Prescription() {
        System.out.println(name + " 医生给  " + patient.name + " 开药 ！治病 ！");
    }

    public static void main(String[] args) {
        /* 演示实例变量和静态变量 */
        Doctor d1 = new Doctor();
        Doctor d2 = new Doctor();
        Doctor d3 = new Doctor();
        d1.name = "d1";
        d2.name = "d2";
        d3.name = "d3";
        System.out.println("d1 name : " + d1.name);
        System.out.println("d2 name : " + d2.name);
        System.out.println("d3 name : " + d3.name);
        System.out.println("d1 n : " + d1.n);
        System.out.println("d2 n : " + d2.n);
        System.out.println("d3 n : " + d3.n);
        System.out.println("d3 n : " + d3.n);
        System.out.println("Doctor n : " + Doctor.n);
        // Modify Static variable
        Doctor.n = 99;
        System.out.println("修改静态变量之后：");
        System.out.println("Doctor n : " + Doctor.n);
        System.out.println("d1 n : " + d1.n);
        System.out.println("d2 n : " + d2.n);
        System.out.println("d3 n : " + d3.n);
        System.out.println("d3 n : " + d3.n);
        d3.n = 888;
        d2.n = 88;
        System.out.println("d2 n : " + d2.n);
        System.out.println("d3 n : " + d3.n);
    }
}

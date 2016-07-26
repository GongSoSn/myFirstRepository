package com.hyhu.demo;

import java.util.Scanner;

public class ShuzuTest {

	public static void main(String[] args) {
	/*	//先声明再创建
		 * Scanner sc;
		sc=new Scanner(System.in);
		
		//1.变量类型   数组名[]
		//int ints[];
		//2.变量类型 [] 数组名
		//int[] ints1;
		//1.先声明后创建
		//int ints[];//声明
		//ints=new int[5];//创建
		//在声明的同时直接创建
		int ints1[]=new int[5];//
		System.out.println("int类型的默认值"+ints1[0]);
		
		//直接赋值
		int ints2[]={1,-2,3,4,5};
		//数组通过下标查找元素   下标从0
		//ints2[0]   intts[下标] 	
		System.out.println("数组的第1个元素:"+ints2[0]);
		System.out.println("数组的第5个元素:"+ints2[4]);
		System.out.println("数组的第4个元素"+ints2[3]);
		//浮点类型
		double dbs[]=new double[5];
		System.out.println("double类型的默认值"+dbs[1]);
		//字符串类型
		
		//当越界是 出现错误信息   java.lang.ArrayIndexOutOfBoundsException
		//System.out.println("字符串类型的默认值;"+str[2]);
		System.out.println("===========================================");
		String str2[]={"今天","我们","学习","数组","ok?"};
		//System.out.println(str2[1]);
		
		for(int i=0;i<5;i++){
			System.out.println(str2[i]);
		}
		System.out.println("=============================");
		String str[]=new String[3];
		str[1]="刘晓鹏";
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println("============================");
		int ints[]=new int[5];
		
		ints[0]=5+3;
		System.out.println(ints[0]);
		System.out.println("===============================");
		int intArrays[] ={3,-9,8,9,6,-4,0,20,39,66};
		System.out.println("数组长度:"+intArrays.length);
		for (int i = 0; i < intArrays.length; i++) {
			System.out.println(intArrays[i]);
		}
		//System.out.println("正序");
		for(int i=0;i<10;i++){
			System.out.println(intArrays[i]);
			
			
		}
		System.out.println("反序");
		for(int i=9;i>=0;i--){
			System.out.println(intArrays[i]);
		}
		
		//可以通过split() 这个方法把 字符串拆成字符串数组
		String str5="刘晓鹏&女&20&男";
		String [] str6=str5.split("&");
		for (int i = 0; i < str6.length; i++) {
			System.out.println(str6[i]);
		}
		//增强for循环(全循环)
		//数据类型    集合元素: 数组名称
		for(String s:str6){
			System.out.println("全循环:"+s);
		}*/
		//增强for循环(全循环)
				//数据类型    集合元素: 数组名称
		int intArrays[] ={3,-9,8,9,6,-4,0,20,39,66};
		for(int i:intArrays){
			System.out.println(i);
		}
		
		
		
		

	}

}

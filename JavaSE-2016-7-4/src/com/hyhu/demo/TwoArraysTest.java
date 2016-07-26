package com.hyhu.demo;

public class TwoArraysTest {

	public static void main(String[] args) {
		String str[]={"","",""};
		int ints[]={1,2,3,6};
		//通过new关键字来创建二维数组
		int [][] ints1=new int[3][4];
		//数据类型[第几个数组][第几个元素] 数组名 
		//数据类型 数组名[][]
		//通过直接赋值方式 来创建二维数组
		int[][] ints2={{1,2,3,6},{3,7,9,30},{8,20,77,92}};
		System.out.println("第1个数组第四个元素:"+ints2[0][3]);
		System.out.println("第3个数组第4个元素:"+ints2[2][3]);
		System.out.println("第2个数组第三个元素"+ints2[1][2]);
		//数组长度
		for (int i = 0; i < ints2.length; i++) {
			//数组元素长度
			//System.out.println(ints2[i].length);
			for (int j = 0; j <ints2[i].length; j++) {
				System.out.print(ints2[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}

}

package com.hyhu.demo;

import java.util.Arrays;



public class ArraysTest {
	public static void main(String[] args) {
		int[] ints=new int[5];
		//通过fill() 给ints数组每个元素赋值
		for(int i:ints){
			System.out.println("ints[]中每个元素值:"+i);
		}
		System.out.println("===============");
		Arrays.fill(ints, 5);
		for (int int1 : ints) {
			System.out.println("ints[] 数组赋值之后每个元素的值:"+int1);
		}
		//Arrays.copyOf()   复制一个新的数组长度, 如果长度增加是用0填充,如果减少长度时截取元素的值
		int [] newInts=Arrays.copyOf(ints, 3);
		for (int i : newInts) {
			System.out.println("增加长度之后的值:"+i);
		}
		System.out.println("=======================");
		int ints2[]={4,9,-8,6,20};
		int ints3[]={3,9,-8,6,20};
		for (int i : ints2) {
			System.out.println("没有升序之前的值:"+i);
		}
		System.out.println("================================");
	/*	Arrays.sort(ints2);
		for (int i2 : ints2) {
			System.out.println("升序之后元素的值:"+i2);
		}*/
		System.out.println("==============");
		//Arrays.equals();判断两个数组否相等 (相同顺序包含相同元素)
		boolean bool=Arrays.equals(ints2, ints3);
		System.out.println(bool);
		
	}

}

package com.hyhu.demo;

import java.util.Arrays;



public class ArraysTest {
	public static void main(String[] args) {
		int[] ints=new int[5];
		//ͨ��fill() ��ints����ÿ��Ԫ�ظ�ֵ
		for(int i:ints){
			System.out.println("ints[]��ÿ��Ԫ��ֵ:"+i);
		}
		System.out.println("===============");
		Arrays.fill(ints, 5);
		for (int int1 : ints) {
			System.out.println("ints[] ���鸳ֵ֮��ÿ��Ԫ�ص�ֵ:"+int1);
		}
		//Arrays.copyOf()   ����һ���µ����鳤��, ���������������0���,������ٳ���ʱ��ȡԪ�ص�ֵ
		int [] newInts=Arrays.copyOf(ints, 3);
		for (int i : newInts) {
			System.out.println("���ӳ���֮���ֵ:"+i);
		}
		System.out.println("=======================");
		int ints2[]={4,9,-8,6,20};
		int ints3[]={3,9,-8,6,20};
		for (int i : ints2) {
			System.out.println("û������֮ǰ��ֵ:"+i);
		}
		System.out.println("================================");
	/*	Arrays.sort(ints2);
		for (int i2 : ints2) {
			System.out.println("����֮��Ԫ�ص�ֵ:"+i2);
		}*/
		System.out.println("==============");
		//Arrays.equals();�ж������������� (��ͬ˳�������ͬԪ��)
		boolean bool=Arrays.equals(ints2, ints3);
		System.out.println(bool);
		
	}

}

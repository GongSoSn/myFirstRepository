package com.hyhu.demo;

import java.util.Scanner;

public class ShuzuTest {

	public static void main(String[] args) {
	/*	//�������ٴ���
		 * Scanner sc;
		sc=new Scanner(System.in);
		
		//1.��������   ������[]
		//int ints[];
		//2.�������� [] ������
		//int[] ints1;
		//1.�������󴴽�
		//int ints[];//����
		//ints=new int[5];//����
		//��������ͬʱֱ�Ӵ���
		int ints1[]=new int[5];//
		System.out.println("int���͵�Ĭ��ֵ"+ints1[0]);
		
		//ֱ�Ӹ�ֵ
		int ints2[]={1,-2,3,4,5};
		//����ͨ���±����Ԫ��   �±��0
		//ints2[0]   intts[�±�] 	
		System.out.println("����ĵ�1��Ԫ��:"+ints2[0]);
		System.out.println("����ĵ�5��Ԫ��:"+ints2[4]);
		System.out.println("����ĵ�4��Ԫ��"+ints2[3]);
		//��������
		double dbs[]=new double[5];
		System.out.println("double���͵�Ĭ��ֵ"+dbs[1]);
		//�ַ�������
		
		//��Խ���� ���ִ�����Ϣ   java.lang.ArrayIndexOutOfBoundsException
		//System.out.println("�ַ������͵�Ĭ��ֵ;"+str[2]);
		System.out.println("===========================================");
		String str2[]={"����","����","ѧϰ","����","ok?"};
		//System.out.println(str2[1]);
		
		for(int i=0;i<5;i++){
			System.out.println(str2[i]);
		}
		System.out.println("=============================");
		String str[]=new String[3];
		str[1]="������";
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println("============================");
		int ints[]=new int[5];
		
		ints[0]=5+3;
		System.out.println(ints[0]);
		System.out.println("===============================");
		int intArrays[] ={3,-9,8,9,6,-4,0,20,39,66};
		System.out.println("���鳤��:"+intArrays.length);
		for (int i = 0; i < intArrays.length; i++) {
			System.out.println(intArrays[i]);
		}
		//System.out.println("����");
		for(int i=0;i<10;i++){
			System.out.println(intArrays[i]);
			
			
		}
		System.out.println("����");
		for(int i=9;i>=0;i--){
			System.out.println(intArrays[i]);
		}
		
		//����ͨ��split() ��������� �ַ�������ַ�������
		String str5="������&Ů&20&��";
		String [] str6=str5.split("&");
		for (int i = 0; i < str6.length; i++) {
			System.out.println(str6[i]);
		}
		//��ǿforѭ��(ȫѭ��)
		//��������    ����Ԫ��: ��������
		for(String s:str6){
			System.out.println("ȫѭ��:"+s);
		}*/
		//��ǿforѭ��(ȫѭ��)
				//��������    ����Ԫ��: ��������
		int intArrays[] ={3,-9,8,9,6,-4,0,20,39,66};
		for(int i:intArrays){
			System.out.println(i);
		}
		
		
		
		

	}

}

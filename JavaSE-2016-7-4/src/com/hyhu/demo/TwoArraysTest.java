package com.hyhu.demo;

public class TwoArraysTest {

	public static void main(String[] args) {
		String str[]={"","",""};
		int ints[]={1,2,3,6};
		//ͨ��new�ؼ�����������ά����
		int [][] ints1=new int[3][4];
		//��������[�ڼ�������][�ڼ���Ԫ��] ������ 
		//�������� ������[][]
		//ͨ��ֱ�Ӹ�ֵ��ʽ ��������ά����
		int[][] ints2={{1,2,3,6},{3,7,9,30},{8,20,77,92}};
		System.out.println("��1��������ĸ�Ԫ��:"+ints2[0][3]);
		System.out.println("��3�������4��Ԫ��:"+ints2[2][3]);
		System.out.println("��2�����������Ԫ��"+ints2[1][2]);
		//���鳤��
		for (int i = 0; i < ints2.length; i++) {
			//����Ԫ�س���
			//System.out.println(ints2[i].length);
			for (int j = 0; j <ints2[i].length; j++) {
				System.out.print(ints2[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}

}

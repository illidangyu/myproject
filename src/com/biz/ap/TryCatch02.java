package com.biz.ap;

import java.util.Scanner;

/*
 * Ű���忡�� �Է¹޴� ���� ��
 */
public class TryCatch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int intSum = 0;
		while(true)
		{
			System.out.print("Number >>");
			String str = scanner.nextLine();
			
			if(str.equals("~END")) break;
			try 
			{
				int intNum= Integer.valueOf(str);
				intSum+=intNum;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("���ڿ��� ���ڷ� ��ȯ�� ���� �߻�\n�ٽ��Է¹ٶ�");				
			}
		}
		System.out.println(intSum);
	}

}

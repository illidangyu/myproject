package com.biz.ap;

public class TryCatch01 {

	public static void main(String[] args) {

		String num1 = "30";
		String num2 = "40";
		
		System.out.println(num1 + num2);
		
		int intNum1 = Integer.valueOf(num1);
		int intNum2 = Integer.valueOf(num2);
		System.out.println(intNum1 + intNum2);
		
		num1 = "30";
		num2 = " 40";
		//try ���ο� �ڵ带 �����ϴ°������� exception�� �߻���
		//exception ������ 
		try {
			intNum1=Integer.valueOf(num1);
			intNum2=Integer.valueOf(num2);
			System.out.println(intNum1+intNum2);
		} catch (Exception e) {
//			e.printStackTrace();// java���� �⺻���� �����ִ� exception�޽���
			System.out.println(e.getMessage());
			System.out.println("���� ���� ��ȯ������ ���ڰ� �ƴ� �ٸ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
		}
	}

}

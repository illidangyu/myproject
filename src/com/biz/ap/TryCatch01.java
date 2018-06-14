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
		//try 내부에 코드를 실행하는과정에서 exception이 발생시
		//exception 정보를 
		try {
			intNum1=Integer.valueOf(num1);
			intNum2=Integer.valueOf(num2);
			System.out.println(intNum1+intNum2);
		} catch (Exception e) {
//			e.printStackTrace();// java에서 기본으로 보여주는 exception메시지
			System.out.println(e.getMessage());
			System.out.println("현재 숫자 변환과정중 숫자가 아닌 다른 문자열이 포함되어 있습니다.");
		}
	}

}

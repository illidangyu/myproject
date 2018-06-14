package com.biz.ap;

import java.util.Scanner;

/*
 * 키보드에서 입력받는 숫자 합
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
				System.out.println("문자열을 숫자로 변환중 문제 발생\n다시입력바람");				
			}
		}
		System.out.println(intSum);
	}

}

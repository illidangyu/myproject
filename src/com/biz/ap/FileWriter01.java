package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter�� ���� ������ �����ϰ� ���� ����ϴ� Ŭ����
 * 
 * �� Ŭ���� �̿��Ͽ� ������ ���� ���
 */
public class FileWriter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/biz/ap/data1.txt";
		
		//���ϻ���
		FileWriter fileWriter = null;
		
		/*
		 * ���� ������ ��Ͻ� 
		 * FileWriter�� ���������� Buffer����
		 */
		BufferedWriter buffer = null;
		
		try {
			//���� ������ ������ ���� ������ ������ ����
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			for( int i=0;i<10;i++)
			{
				int num= (int)(Math.random()*10);
				String strNum = String.valueOf(num);
				/*
				 * write�� ����ϰ��� �ϴ� data�� �������̸� char�� ����Ѵ�
				 * ������ �ڵ�� �ν��ؼ� "����"�� ���̰� ���
				 * ���ڸ� ����� �������� ���ڸ� ���ڷ� ��ȯ���־� ���
				 */
				buffer.write(strNum);
				buffer.newLine(); // \n
			}
			/*
			 * ������ write�Ҷ��� �ݵ�� �ݾƾ� �Ѵ�.
			 * �׷��� ������ buffer�� ���� �ִ� �����Ͱ� ��ϵ��� �ʴ°�찡 �߻�
			 * 
			 * ������ write�Ҷ��� �ݱ����� �Ѱ��� �ؾ��������ִ�.
			 */
			buffer.flush();//buffer�� �����ִ� �����͸� ���Ϸ� �����ϰ� ��� �Ϸ�
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(fileName+" ��������!");
		}
		System.out.println("�Ϸ���.");
	}

}

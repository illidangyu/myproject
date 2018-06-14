package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		FileReader fileReader = null;
		BufferedReader buffer = null;
		String fileName = "src/com/biz/ap/data.txt";
		/*
		 * exception handling
		 */
		try {
			fileReader = new FileReader(fileName);
			buffer =  new BufferedReader(fileReader);
			
			String line="";
			line = new String();
			
			while(true)
			{
				line = buffer.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(); �⺻ �޽����� �޽��� �����ְ� �ߴ�
			System.out.println("������ ���µ� �����߻�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("�����б� ������ ���� �߻�");
		} catch(Exception e)
		{
			System.out.println("���� �߻�");
		}
		
		
	}

}

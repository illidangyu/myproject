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
//			e.printStackTrace(); 기본 메시지는 메시지 보여주고 중단
			System.out.println("파일을 여는데 문제발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일읽기 과정중 문제 발생");
		} catch(Exception e)
		{
			System.out.println("문제 발생");
		}
		
		
	}

}

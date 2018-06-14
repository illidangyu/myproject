package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/biz/ap/grade.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		int intSum=0;
		
		try 
		{
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			String line = new String();
			
			while(true)
			{
				line = buffer.readLine();
				if(line==null) break;
				int intNum = Integer.valueOf(line);
				intSum+=intNum;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("파일내용중 숫자가 아닌 부분이 포함되있음");
			
		}
		try {
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		System.out.println("SUM : "+intSum);
	}

}

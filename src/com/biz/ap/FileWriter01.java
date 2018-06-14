package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter는 없는 파일을 생성하고 값을 기록하는 클래스
 * 
 * 이 클래스 이용하여 임의의 값을 기록
 */
public class FileWriter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/biz/ap/data1.txt";
		
		//파일생성
		FileWriter fileWriter = null;
		
		/*
		 * 실제 파일을 기록시 
		 * FileWriter와 보조역할할 Buffer설정
		 */
		BufferedWriter buffer = null;
		
		try {
			//같은 파일이 있으면 기존 데이터 삭제후 재기록
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			for( int i=0;i<10;i++)
			{
				int num= (int)(Math.random()*10);
				String strNum = String.valueOf(num);
				/*
				 * write는 기록하고자 하는 data가 정수형이면 char로 기록한다
				 * 정수를 코드로 인식해서 "문자"로 보이게 기록
				 * 숫자를 제대로 보기위해 숫자를 문자로 변환해주어 기록
				 */
				buffer.write(strNum);
				buffer.newLine(); // \n
			}
			/*
			 * 파일을 write할때는 반드시 닫아야 한다.
			 * 그렇지 않으면 buffer에 남아 있는 데이터가 기록되지 않는경우가 발생
			 * 
			 * 파일을 write할때는 닫기전에 한가지 해야할일이있다.
			 */
			buffer.flush();//buffer에 남아있는 데이터를 파일로 안전하게 기록 완료
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(fileName+" 생성오류!");
		}
		System.out.println("완료됬다.");
	}

}

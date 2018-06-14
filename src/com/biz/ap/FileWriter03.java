package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 키보드에서 점수를 입력받아 grade2.txt에 기록
 */
public class FileWriter03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String fileName = "src/com/biz/ap/grade2.txt";
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		
		try {
			/*
			 * 파일이름 다음에 true값을 넣어주면 기존파일에 추가하는 방식으로 파일을 연다
			 * 없으면 생성하고 있으면 기록방식으로 열기
			 */
			fileWriter = new FileWriter(fileName,true);
			buffer = new BufferedWriter(fileWriter);
			
			while(true)
			{
				System.out.println("점수입력");
				String line =scanner.nextLine();
				
				if(line.equals("END")) break;
				try {
					int g = Integer.valueOf(line);
					if(g<0 || g>100)
					{
						System.out.println("점수 범위가 아님");
						continue;
					}
					buffer.write(line);
					buffer.newLine();
				} catch (Exception e) {
					System.out.println("숫자만 입력해라");
				}
			}
			buffer.flush();
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("완료");
		scanner.close();
		
	}

}

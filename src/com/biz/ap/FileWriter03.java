package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Ű���忡�� ������ �Է¹޾� grade2.txt�� ���
 */
public class FileWriter03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String fileName = "src/com/biz/ap/grade2.txt";
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		
		try {
			/*
			 * �����̸� ������ true���� �־��ָ� �������Ͽ� �߰��ϴ� ������� ������ ����
			 * ������ �����ϰ� ������ ��Ϲ������ ����
			 */
			fileWriter = new FileWriter(fileName,true);
			buffer = new BufferedWriter(fileWriter);
			
			while(true)
			{
				System.out.println("�����Է�");
				String line =scanner.nextLine();
				
				if(line.equals("END")) break;
				try {
					int g = Integer.valueOf(line);
					if(g<0 || g>100)
					{
						System.out.println("���� ������ �ƴ�");
						continue;
					}
					buffer.write(line);
					buffer.newLine();
				} catch (Exception e) {
					System.out.println("���ڸ� �Է��ض�");
				}
			}
			buffer.flush();
			buffer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�Ϸ�");
		scanner.close();
		
	}

}

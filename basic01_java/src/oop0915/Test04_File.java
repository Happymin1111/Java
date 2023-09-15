package oop0915;

import java.io.File;

public class Test04_File {

	public static void main(String[] args) {
		//File 클래스
		//->파일과 관련된 정보를 알 수 있다.
		//->파일명, 파일크기, 확장명, 파일타입 ~~
		try {
			//예외 발생이 예상되는 코드 작성
			
			//경로명 + 파일명
			
			//경로명으로 \기호로 사용하려면 \\rlghfh 2번씩 사용함
			//String pathName="D:\\java202307\\doc\\20230816_Database.pdf";
			
			//경로명으로 /기호로 사용가능하다
			String pathName="D:/java202307/doc/20230816_Database.pdf";
			
			//File클래스에서 파일 담기
			File file = new File(pathName);
			
			if(file.exists()) {
				System.out.println("파일 있어용~~");
				
				long filesize = file.length();
				System.out.println("파일크기 : " + filesize);
				System.out.println("파일크기 : " + filesize/1024 +"KB");
				System.out.println("파일크기 : " + filesize/1024/1024 +"MB");
				
				String filename=file.getName();
				System.out.println("파일명 : "+filename);
				
				//문) 파일명과 확장명을 분리해서 출력하시오
				// 파일명 : 20230816_Database
				// 확장명 : pdf
				
				int lastdot=filename.lastIndexOf(".");
				String name=filename.substring(0,lastdot);
				String ext =filename.substring(lastdot+1);
				System.out.println("파일명 : "+name);
				System.out.println("확장명 : "+ext);
				
				//파일삭제
				/*
				if(file.delete()) {
					System.out.println(filename+"파일이 삭제 되었습니다~");
				}else {
					System.out.println(filename+"파일 삭제 실패!!");
				}//if end
				*/
				
				}else {
				System.out.println("파일 없는뎅~~");
				
				
				
			}//if end
			
		}catch(Exception e) {
			//예외가 발생하면 처리할 코드를 작성
			e.printStackTrace();
		}//end
		
		System.out.println("END");

	}//main() end

}//class end

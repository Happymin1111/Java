package oop0904;

public class Test02_print {

	public static void main(String[] args) {
		
		//단축키 : syso 입력후 ctrl + space
		//System.out.println(); 콘솔창 출력 명령어
		
		System.out.println(123);      //숫자 데이터
		System.out.println("SEOUL");   //문자열 데이터
		
		
		
		System.out.print("국어");
		System.out.print("영어");
		System.out.print("수학");
		
		System.out.println();
		
		//출력하고 줄바꿈 (엔터)
		System.out.println(123);
		System.out.println(456);
		System.out.println(789);
		
		System.out.println(); // 콘솔창에서 줄바꿈;
		
		// 문자열 데이터 구분 기호 "
		System.out.println("JAVA");
		System.out.println("PYTHON");
		System.out.println(123);      // 숫자형
		System.out.println("456"); 	  // 문자열형
		
		System.out.println("\"");
		System.out.println("\'");
		System.out.println("\\");
		
		// + 연산자
		System.out.println(123+456);      //579
		System.out.println("123"+"456");  //"123456"
		System.out.println(123+"456");    //"123456"
		System.out.println("123"+456);    //"123456"
		System.out.println("123+456");    //"123+456"
		
	}// main() end
}// class end

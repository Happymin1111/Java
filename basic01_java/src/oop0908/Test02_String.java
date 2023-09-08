package oop0908;

import java.util.StringTokenizer;

public class Test02_String {

	public static void main(String[] args) {
		//문자열 관련 클래스

		String name = new String("HAPPY");
		String str = "HAPPY";
		
		System.out.println(name.length());
		System.out.println(str.length());
		
		if(str==name) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}//if end
		
		
		
		
	//문자열의 내용을 비교하는 경우 == 연산자 사용하지 말고 equals() 사용할것
	if(str.equals(name)) {
		System.out.println("같다");
	}else {
		System.out.println("다르다");
	}//if end
	
	//문자열의 갯수가 0인지?
	if(str.isEmpty()) {
		System.out.println("빈문자열 이다.");
	}else {
		System.out.println("빈문자열 아니다.");
	}//if end
	
	
	//특정 문자를 기준으로 문자열 분리하기
	str = new String("Gone With The Wind");
	System.out.println(str);

	String[] word = str.split(" ");
	for(int i=0; i<word.length; i++) {
		System.out.println("#"+ word[i]+"#");
	}//for end
	

	
	//문) 문자열에서 공백문자를 기준으로 분리하기
	//문제1 StringTokenizer 클래스를 이용할 것
	
	/*
    String str1="Gone With The Wind";
    StringTokenizer word1 = new StringTokenizer(str1);
    System.out.println(word1.nextToken());
    System.out.println(word1.nextToken());
    System.out.println(word1.nextToken());
    System.out.println(word1.nextToken());
    */
	
	StringTokenizer st = new StringTokenizer(str," ");
	while(st.hasMoreElements()) {//토큰할 문자가 있는지?
		System.out.println(st.nextToken()); //토큰한 문자열 가져오기
	}// while end
	////////////////////////////////////////////////////////
	
	//문자열 연산 속도
	//String < StringBuffer < StringBuilder
	
	String s1 = "";
	System.out.println(s1.length());

	s1 = s1 + "ONE";
	System.out.println(s1.length());
	
	s1= s1 + "TWO";
	System.out.println(s1.length());

	s1= s1 + "Three";
	System.out.println(s1.length());
	
	s1=""; // 모든 문자열 지우기(빈 문자열 대입)
	System.out.println(s1.length());
	System.out.println("#"+s1+"#");
	////////////////////////////////////////////////////
	
	//////////////////////////////////////////////////////////
	StringBuilder s2 = new StringBuilder();
	
	s2.append("SEOUL");
	System.out.println(s2.length() + s2.toString());
	
	s2.append("JEJU");
	System.out.println(s2.length() + s2.toString());
	
	s2.append("BUSAN");
	System.out.println(s2.length() + s2.toString());
	
	s2.delete(0,s2.length());
	System.out.println(s2.length() + s2.toString());
	
	StringBuffer s3 = null;
	//NullPointerException 발생
	//System.out.println(s3.length());
	
	
}//main() end

}//class end()

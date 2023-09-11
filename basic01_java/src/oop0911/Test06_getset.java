package oop0911;

public class Test06_getset {

	public static void main(String[] args) {
		// getter와 setter함수
		/*
		     ● 함수명 작성 규칙
			   - is함수명()         대부분 boolean형으로 변환
			   - to함수명()		  to뒤의 값을 반환
			   - get함수명()  	  대부분 리턴값이 존재
			   - set함수명()		  원하는 값으로 세팅할 때
		*/
		
		//getter함수명을 작성하는 규칙
		//->get 멤버변수의 첫글자 대문자 바꾼후 함수명()
		
		//setter함수명을 작성하는 규칙
		//->set 멤버변수의 첫글자 대문자 바꾼후 함수명()
		
		//BbsDTO클래스 생성후 실습합니다.
		
		BbsDTO dto = new BbsDTO();
		
		dto.setWriter("오필승");
		dto.setSubject("무궁화 꽃이 피었습니다.");
		
		System.out.println(dto.getBbsno());
		System.out.println(dto.getWriter());
		System.out.println(dto.getSubject());
		/////////////////////////////////////////////////////////
		
		//※ Tip
		//이클립스에서 getter와 setter함수를 자동코딩할 수 있다.
		//->메뉴 source -> Generage Getter and setters..
		
		//MemberDTO클래스를 만든후 실습합니다.
		
		
		
		
	}//main end

}//class end

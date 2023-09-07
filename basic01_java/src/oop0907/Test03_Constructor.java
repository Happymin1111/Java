package oop0907;

public class Test03_Constructor {

	public static void main(String[] args) {
		// 생성자 함수 연습
		//※ School클래스 생성후 연습합니다.
		
		// new School(); //객체(Object) 또는 Instance
		
		School one = 
				new School(); //#100번지
		System.out.println(one.hashCode());
		
		one.calc();
		one.disp();
		
		String a = "ITWILL";
		String b= new String();  //빈문자열
		String c= null;          //메모리 할당은 하지 않고 b라는 참조변수 선언만 해놓음.
		System.out.println(a.length()); //6
		System.out.println(b.length()); //0
		//System.out.println(c.length()); NullPointerException 발생
		
		System.out.println("null"); //문자열 상수
		
	}//main() end

}//class end

package oop0913;

public class Test02_abstract {

	public static void main(String[] args) {
		// 추상 클래스 Abstract Class
		/*
			● 추상 클래스
			  - 미완성 클래스
			  - 객체를 생성할 수 없다.
			  - new 연산자를 직접 사용할 수 없다.
			  - 추상메소드가 1개라도 있으면 추상클래스
			  - 추상메소드와 일반메소드와 같이 선언가능하다.
			  
			
			● 추상 메소드
			  - 미완성 메소드
			  - 형식) 리턴형 함수명(){}
			  - 메소드의 본체 {}가 없는 함수
			  - 메소드를 선언만 해놓음.
			● 인터페이스(interface) : 추상메소드만 선언가능하다.
		
		
		
		*/
		//Animal클래스에서 실습합니다.
		
		//추상클래스는 new연산자로 직접 객체 생성할 수 없다.
		//Animal ani = new Animal();
		
		Elephant jumbo=new Elephant();
		jumbo.disp();
		
		Tuna nemo=new Tuna();
		nemo.disp();
		
		//다형성
		Animal animal = new Elephant();
		animal.disp();
		
		animal = new Tuna();
		animal.disp();
		
		

	}//main end

}//class end

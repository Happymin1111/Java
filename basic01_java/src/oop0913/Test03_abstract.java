package oop0913;

public class Test03_abstract {

	public static void main(String[] args) {
		//추상클래스와 다형성
		
		//Travel 클래스 생성후 실습합니다.
		Travel tour = new TypeA();
		System.out.println(tour.travelWhere());
		
		tour = new TypeB();
		System.out.println(tour.travelWhere());
		
		tour = new TypeC();
		System.out.println(tour.travelWhere());
		
	}//main() end
	
}//class end

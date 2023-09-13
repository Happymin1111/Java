package oop0913;

public class Test04_interface {

	public static void main(String[] args) {
		// 인터페이스 interface
		/*
		 	- 추상메소드로만 구성되어 있다.
		  	- 추상클래스보다 더 추상화 되어 있다.
		  	- 상속 : extends 확장, implements 구현,
		  
		  
		*/
	
		// 인터페이스 Creature 생성후 실습합니다~~
		
		//에러. 인터페이스는 직접 객체 생성 불가능
		//Creature cr = new Creature();
		Creature creature = null;
		
		creature = new Tiger();
		creature.kind();
		creature.breathe();
		
		creature = new Salmon();
		creature.kind();
		creature.breathe();
		
		
	} // main() end
}//class end

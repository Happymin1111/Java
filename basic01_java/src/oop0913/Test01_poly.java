package oop0913;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test01_poly {

	public static void main(String[] args) {
		// 다형 Polymorphism
		
		// 객체 생성 (Object, Instance)
		//GregorianCalendar now = new GregorianCalendar();
		//Integer inte = new Integer(3);
		
		//다형성의 예
		//Calendar now = new GregorianCalendar();
		//Number inte = new Integer(3);
		
		//Father 클래스를 만든 후 실습합니다.
		
		//1) 일반적인 방식으로 객체 생성
		//-> new 연산자
		//-> POJO(Plain Old Java Object) 방식
		/*
		Father fa = new Father();
		fa.disp();
		
		Son son = new Son("손흥민","영국");
		son.disp();
		
		Daughter dau=new Daughter("김연아","한국");
		dau.disp();
		*/
		
		/////////////////////////////////////////////
		
		//2)다형성을 이용한 객체 생성
		//->자식클래스가 부모클래스에 대입 가능하다.
		
		//Father father = new Son("개나리","역삼동");
		//father.disp();
		
		//father = new Daughter("진달래","서초동");
		//father.disp();
		
		//ystem.out.println(father.name);
		//System.out.println(father.addr);
		//에러. 자식클래스에서 추가된 멤버는 다형성의 대상이 아니다.
		//System.out.println(father.friend);
		////////////////////////////////////////////
		
		//부모클래스도 자식 클래스에 대입가능하다
		//->단 자식클래스의 모양으로 형변환해야한다.
		
		//Father father = new Father();
		//Son son = new Son();
		
		//son=(Son)father; //강제변환
		
		//예)
		Object obj = new Integer(3);//다형성. 자식클래스가 부모클래스에 대입
		System.out.println(obj.toString());
		
		obj = new Father();
		System.out.println(obj.toString());
	}//main()

}//class end

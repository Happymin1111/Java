package oop0907;

import java.util.GregorianCalendar;

public class Test02_constuctor {

	public static void main(String[] args) {
		// 생성자 함수(constuctor)
		//-> 클래스명과 동일한 함수
		//-> new연산자와 함께 메모리 할당할 때 사용한다.
		//-> 오버로드가 가능하다.
		
		//소멸자 함수(Desttuctor) -> 자바에는 없음!!
		//가비지 콜렉팅 (Garbage Collecting)
		//->JVM이 자동으로 메모리 회수를 함.
		
		
		GregorianCalendar today = new GregorianCalendar();
		
		if(today.isLeapYear(2023)) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}//if end
		
		//문)서기 1년~ 서기2023년까지 윤년의 갯수를 구하시오.
		
		//1)GregorianCalender클래스 활용(추천)
		int cnt=0;
		for(int i=1; i<=2023;i++) {
			if(today.isLeapYear(i)){
				cnt++;
			}
		}
		System.out.println(cnt); // 502
		
		
		//2)윤년 구하는 공식
		int cnt2=0;
		for(int i=1; i<=2023; i++) {
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				cnt2++;
			}
		}
		System.out.println(cnt2); // 490


	}//main() end

}//class end

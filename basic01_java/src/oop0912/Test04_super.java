package oop0912;

public class Test04_super {

	public static void main(String[] args) {
		//super, super()와 this() 활용한 클래스 설계
		
		//Parent 클래스 생성후에 실습 합니다.

		Child child = new Child(10,20,30);
		
		System.out.println(child.three);
		System.out.println(child.two);
		System.out.println(child.one);
	}//main() end
}//class end

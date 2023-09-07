package oop0907;

class Score {
	//멤버변수 field
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//생성자함수 constructor
	public Score() {
		System.out.println("Score() 호출됨");
	}//end
	
	//생성자 함수도 오버로드(함수명 중복 정의)가 가능하다.
	public Score(String n) {
		name = n;
	}//end
	
	public Score(int k, int e, int m) {
		kor = k;
		eng = e;
		mat = m;
	}//end
	

	
	public Score(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}//end
	
	//멤버함수 method

	
	
	void calc() {//package 생략되어 있음
		//클래스 내부의 멤버들 간에는 Access Modifier와 상관없이 접근 가능하다.
		 aver=(kor+eng+mat)/3;
	}//calc() end
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	
	

	

	
}//class end

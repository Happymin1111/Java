package oop0908;

class Score {//package 생략되어 있다.
			 //oop0908패키지에서만 접근가능하다
	//https://docs.oracle.com/javase/8/docs/api/
	
	//멤버변수 field
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//생성자함수 constructor
	public Score() {}//기본생성자 default constructor
	
	public Score(String name,int kor, int eng, int mat) {
		this.name=name; //this.멤버변수 = 지역변수
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	} // end
	
	//멤버함수 method
	public void calc() {
		this.aver = (kor+eng+mat)/3;
		
	}//calc() end
	
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}//disp() end
	
	
}//class end

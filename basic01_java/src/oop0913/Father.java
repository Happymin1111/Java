package oop0913;

class Father {//package생략되어 있다.
			  //oop0913패키지 내에서만 사용가능하다.
	//멤버변수 field
	public String name="아버지";
	public String addr="주소";
	
	
	
	//생성자함수 constructor
	public Father() {}
	public Father(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}//end
	
	
	//멤버함수 method
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}//disp() end
	
}//class end

class Son extends Father {//class end
	public Son() {}
	public Son(String n, String a) {
		super.name=n;
		super.addr=a;
	}
} // class end

class Daughter extends Father {
	
	String friend ="절친";
	
	public Daughter() {}
	public Daughter(String n, String a) {
		super(n, a); //부모생성자 함수 호출
	}
	
} // class end

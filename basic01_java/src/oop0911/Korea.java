package oop0911;

class Korea {
	String name="대한민국";
	
	final void view() {
		System.out.println("Korea.view()...");
	} // view end
	void disp() {
		System.out.println("Korea.disp()..." + name);
	}//disp() end
}//class end

class Seoul extends Korea {}// class end

class Busan extends Korea {
	String name="부산광역시";
	
	@Override //<-annotation
	void disp() {
		System.out.println("Busan.disp()..."+name);
	}
	
	/*
	@Override
	void view() {} 에러. final메소드는 더이상 오버라이드할 수없다.
	*/
	
}//class end

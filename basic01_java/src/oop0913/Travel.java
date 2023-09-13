package oop0913;

abstract class Travel {		      	  //추상클래스
	void view() {}                    //일반메소드
	abstract String travelWhere();    //추상메소드
}//class end

class TypeA extends Travel {
	@Override
	String travelWhere() {
		// TODO Auto-generated method stub
		return "ㅋㅋㅋ";
	}
} //class end

class TypeB extends Travel {
	@Override
	String travelWhere() {
		// TODO Auto-generated method stub
		return "ㅇㅇㅇ";
	}
} //class end

class TypeC extends Travel {
	@Override
	String travelWhere() {
		// TODO Auto-generated method stub
		return "ㅋㄷㅋㄷ";
	}
} //class end
package oop0914;

public class Test04_buyer {

	public static void main(String[] args) {
		// 상품 구매 및 반품 프로그램
		
		//1)상품 만들기
		//-> Product 클래스
		
		//2)상품 진열하기
		SmartTV tv = new SmartTV();
		Notebook note = new Notebook();
		HandPhone phone = new HandPhone();

		//3)상품 구매하기
		Buyer kim = new Buyer();
		
		kim.buy(tv);  //100
		kim.buy(note); //200
		kim.buy(phone); //300
		
		kim.buy(note); //200
		kim.buy(note); //200
		kim.buy(note); //잔액부족
		
		kim.disp();
		System.out.println("--------------");
		
		//4)반품하기 
		//->Order 클래스
		//->(Buyer클래스 복사해서 수정)
		//->상품을 중복해서 구매하지 않았다는 전제하에 반품
		
		Order lee = new Order();
		lee.buy(tv);
		lee.buy(phone);
		lee.buy(note);
		
		lee.disp();
		
		System.out.println("<<<<< 반품");
		lee.refund(note);
		lee.refund(tv);
		lee.refund(phone);
		
		System.out.println("<<<<<< 결과");
		lee.disp();
		
		
	}//main() end

}//class end

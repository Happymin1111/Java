package oop0911;

public class Test07_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8+9+1+2+3+0+1+2+3+4+5+6+7 = 51;
		String jumin="8912301234567";
		
		// 1)Character클래스
		int sum = 0;
		for(int i=0; i<jumin.length(); i++) {
			sum = sum + (int) jumin.charAt(i) - 48;
		}
		System.out.println(sum);
		
		System.out.println(jumin.substring(12,13));
		
		// 2)Integer클래스
		int ssum = 0;
		for(int i=0; i<jumin.length(); i++) {
			ssum = ssum + Integer.parseInt(jumin.substring(i,i+1));
		}
		System.out.println(ssum);
		
	}

}

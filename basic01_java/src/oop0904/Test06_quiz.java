package oop0904;

public class Test06_quiz {

	public static void main(String[] args) {
		// 연습문제
		// 참조 : 지폐갯수 구하는 문제
		/*
		 	1년 : 365.2422일
		  	출력결과 : 365일 5시간 48분 46초
		*/
		
		double year = 365.2422;
		double sec = year*24*60*60;
		
		System.out.println((int)sec/60/60/24+"일 "+(int)sec/60/60%24+"시간 "+(int)sec/60%60+"분 "+(int)sec%60+"초");
		
		int total=(int)(year*86400); // 31,556,926
		System.out.println(total);
		
		int day=total/86400; // 31,556,926
		System.out.println(day+"일");  // 365
		
		total=total%86400;
		int hour=total/3600;
		System.out.println(hour+"시간"); // 5
		
		total=total%3600;
		int minute=total/60;
		System.out.println(minute+"분"); //48
		
		int second = total%60;
		System.out.println(second+"초"); //46
		


	}

}

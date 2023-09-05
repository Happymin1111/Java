package oop0905;

public class Test05_quiz {

	public static void main(String[] args) {
		// 제어문 연습 문제
		
		
		//문1)알파벳을 아래와 같이 한줄에 5개씩 출력하시오
        /*
            ABCDE
            FGHIJ
            KLMNO
            PQRST
            UVWXY
            Z
        */
		
		/*
		System.out.println("ABCDE");
		System.out.println("FGHIJ");
		System.out.println("KLMNO");
		System.out.println("PQRST");
		System.out.println("UVWXY");
		System.out.println("Z");
		
		System.out.println();
		*/
		
		//int count = 0;
		/*
		for(char ch='A'; ch<='Z'; ch++) {
			count++;
			System.out.print(ch);
			//System.out.println(count);
			if(count%5==0) {
				System.out.println();
			}
		}*/
		//////////////////////////////////////////////////
		
		
		//문2)아래와 같이 출력하시오
        /*
            ####
             ###
              ##
               #
        */
		
		/*
		String a = "";
		String b = "";
		String s = "";
		for(int i=1; i<=4; i++){
			for(int k=1; k<=i;k++){
				a = a + " ";
			}
			for(int j=1; j<=5-i; j++){
				b = b + "#";
			}
			s = a+b;
			System.out.println(s);
			a = "";
			b = "";
			s = "";
		}
		*/
		/*
		System.out.println();

		for (int a=1; a<=4; a++) {
			for(int b=1; b<=4;b++) {
				
				if(a<=b){
				System.out.print("#");
				}
				
				if(a>b){
				System.out.print(" ");
				}
			}// for end
			
			System.out.println();
		}*/
		
		
		
		
		//문3)다음식의 결과값을 구하시오
        /*
               1   2   3   4   5      99
               ─ - ─ + ─ - ─ + ─ ...  ──   = 0.688172
               2   3   4   5   6      100
        */
		
		/*double c=0;
		for(int i=1; i<=99; i++) {
			if(i%2==0) {
				c = c-((double)i/(i+1));
			}else {
			c = c+((double)i/(i+1));
			}
		}
		System.out.println(c);*/
		
	
		
		//문4)아래와 같이 계산해서 출력하시오
        /*    
             1+....+10=55
            11+....+20=155
            21+....+30=255

            81+....+90=855
            91+....+100=955   
        */
		/*
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1+10*(i-1); j<=10*i;j++) {
				sum = sum + j;
			}
			System.out.println(1+10*(i-1)+"+....+"+10*i+"="+sum);
			sum = 0;
		}
		*/
		/*int sum=0;
		for(int a=10; a<=100; a+=10) {
			for(int b=a-9; b<=a; b++) {
				sum += b;
			}// for end
			System.out.printf("%d +... + %d = %d\n", (a-9),a,sum);
			sum=0;
		}*/
		
		
		//문5)어느 달팽이는 낮에는 3cm올라가고, 밤에는 2.5cm 내려온다고 할때
        //   달팽이가 13cm의 나무 꼭대기에 올라가려면 며칠이 걸리는지 구하시오 (21일)
		
		//문5)
		/*
		double dal = 0;
		int count = 0;
		while(dal<13) {
			dal = dal + 3;
			if(dal>=13) {
				count = count + 1;
				break;
			};
			dal = dal - (2.5);
			count = count+1;
		}
		System.out.println(count);
		*/
		
		
		int day=0; // 결과 값
		double snail=0.0; // 달팽이
		
		while(true) {
			day++;
			snail=snail+3.0;
			if(snail>=13.0) {
				break;
			}else {
				snail=snail-2.5;
			}
		}
		
		System.out.println(day);
		
		
		
	}//main() end
	

}//class end

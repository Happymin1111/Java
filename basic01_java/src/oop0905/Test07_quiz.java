package oop0905;

public class Test07_quiz {

	public static void main(String[] args) {
		// 배열 연습 문제
		
		char[] ch = {'I','t','W','i','l','l'};
		int size=ch.length; // 6

		//문1)대,소문자의 갯수를 각각 구하시오
        //->대문자 : 2개
        //->소문자 : 4개
		int dco=0;
		int sco=0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A'&& ch[i]<='Z') {
				dco= dco+1;
			}else if(ch[i]>='a'&& ch[i]<='z') {
				sco= sco+1;
			};
		}
		System.out.printf("문제1) 대문자 : %d개, 소문자 : %d개 \n",dco,sco);
		
		
		//문2)대소문자를 서로 바꿔서 출력하시오
        //-> iTwILL
		/*
		char c;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=ch[i]+32;
			}else if(ch[i]>='a'&& ch[i]<='z') {
				ch[i]=ch[i]-32;
			};
			System.out.print(ch[i]);
		}*/

		
		
		//문3)모음의 갯수를 구하시오 AEIOUaeiou
        //-> 모음의 갯수 : 2개
		//////////////////////////////////////////////////////////
		
		//문4)각행의 모음의 갯수을 구하시오
        //->str[0]행 : 2개
        //->str[1]행 : 1개
        //->str[2]행 : 2개
		char[][] str= {
				{'Y','e','a','r'}
				,{'M','o','n','t','h'}
				,{'D','a','t','e'}
				};
		
		//문5)대각선 방향의 각 요소의 합을 구하시오
        //   대각선 ↘ 방향의 합 (4+9+7)  
        //   대각선 ↙ 방향의 합 (2+9+6)\
		int [][] num = {
				{4, 3, 2}
				,{5, 9, 1}
				,{6, 8, 7}
		        };
		
		
	}// main() end

	
	
}// class end()

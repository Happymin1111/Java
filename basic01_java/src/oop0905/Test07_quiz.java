package oop0905;

public class Test07_quiz {

	public static void main(String[] args) {
		// 배열 연습 문제
		
		char[] ch = {'I','t','W','i','l','l'};
		int size=ch.length; // 6

		//문1)대,소문자의 갯수를 각각 구하시오
        //->대문자 : 2개
        //->소문자 : 4개
		/*
		int dco=0;
		int sco=0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A'&& ch[i]<='Z') {
				dco= dco+1;
			}else if(ch[i]>='a'&& ch[i]<='z') {
				sco= sco+1;
			};
		}
		System.out.printf("대문자 : %d개, 소문자 : %d개 \n",dco,sco);
		System.out.println();
		*/
		
		int upper=0;// 대문자의 갯수
		int lower=0;// 소문자의 갯수
		for(int i=0; i<size; i++) {
			if(ch[i]>='A' && ch[i]<='Z'){
				upper++;
				}
			if(ch[i]>='a' && ch[i]<='z') {
				lower++;
				}
		}// for end
		System.out.printf("대문자 갯수 : %d\n",upper);
		System.out.printf("소문자 갯수 : %d\n",lower);
		
		//문2)대소문자를 서로 바꿔서 출력하시오
        //-> iTwILL
		/*for(int i=0; i<size; i++) {
			if(ch[i]>='A' && ch[i]<='Z'){
				upper++;
				}//if end
			if(ch[i]>='a' && ch[i]<='z') {
				lower++;
				}//if end
		}// for end
		
		*/
		
		/*
		char c;
		for(int i=0; i<size; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}else if(ch[i]>='a'&& ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			};
			System.out.print(ch[i]);
		}
		
		
		
		System.out.println();
		System.out.println();
		*/
		
		//문3)모음의 갯수를 구하시오 AEIOUaeiou
        //-> 모음의 갯수 : 2개
		//////////////////////////////////////////////////////////
		/*
		char[] mo = {'A','E','I','O','U','a','e','i','o','u'};
		int cnt=0;
		for(int i=0; i<mo.length; i++) {
			if(mo[i]>='a' && mo[i]<='z') {
				cnt = cnt + 1;
			}
		}
		
		System.out.printf("모음의 갯수 : %d\n",cnt);
		System.out.println();
		*/
		
		int mo=0; // 모음의 갯수
		for(int i=0; i<size; i++) {
			char c=ch[i];
			if(c>='A' && c<='Z') { // 대문자인지?
				c=(char)(c+32);// 소문자로 변경
			}//if end
			
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': mo ++;
			}// switch end
			
		}//for end
		System.out.printf("\n모음의 갯수: %d\n",mo);
		///////////////////////////////////////////////////////////////////
		
		
		//문4)각행의 모음의 갯수을 구하시오
        //->str[0]행 : 2개
        //->str[1]행 : 1개
        //->str[2]행 : 2개
		char[][] str= {
				{'Y','e','a','r'}
				,{'M','o','n','t','h'}
				,{'D','a','t','e'}
				};
		/*
		for(int i=0; i<str.length; i++) {
			int s = str[i].length;
			System.out.printf("str[%d]행 : %d개\n",i,s);
		}
		
		
		
		System.out.println();
		*/
		
		/*int cnt=0;
		int r=0;
		for(r=0; r<3; r++) {
			int col=str[r].length;
			for(int c=0; c<col; c++) {
				char w=str[r][c];
				if(w>='A' && w<='Z') {		
				  w=(char)(w+32);// 소문자로 변경
			}//if end
			
			switch(w) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': cnt++;
			}// switch end
			
		  }//for end
		}// for end
		System.out.printf("\nstr[%d]행 모음의 갯수 : %d개",r,cnt);
		cnt = 0;*/
		
		
		//문5)대각선 
		//방향의 각 요소의 합을 구하시오
        //   대각선 ↘ 방향의 합 (4+9+7)  
        //   대각선 ↙ 방향의 합 (2+9+6)\
		int [][] num = {
				{4, 3, 2}
				,{5, 9, 1}
				,{6, 8, 7}
		        };
		
		int rsum = 0; // 대각선 ↘ 방향의 합
		int lsum = 0; // 대각선  방향의 합
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				if(i==j) {
					rsum=rsum+num[i][j];
				};
				if(i+j==2) {
					lsum=lsum+num[i][j];
				};
			};
		};
		
		System.out.printf("대각선 ↘ 방향의 합: %d , 대각선 ↙ 방향의 합: %d \n",rsum,lsum);
		
		/*
		int hap1=0; // 대각선↘
		int hap2=0; // 대각선↙
		
		for(int i=0; i<=2; i++){
			hap1=hap1+num[i][i];
			hap2=hap2+num[i][2-i];
		} // for end
		
		
		
		
		 */
		
		
		
	}// main() end

	
	
}// class end()

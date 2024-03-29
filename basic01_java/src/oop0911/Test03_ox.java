package oop0911;

public class Test03_ox {

	public static void main(String[] args) {
		// 문제) 성적프로그램 OX 표시하기
		// Jumsu클래스 생성후 실습합니다.
		/*
		 
		 -------------------------------------------------
		 					** 시험결과 **
			====================================
			번호  이름   1  2  3  4  5  점수  등수      
			------------------------------------    
			1   홍길동  O  X  O  O  O   80   2    
			2   무궁화  O  O  O  O  O  100   1
			3   라일락  X  X  X  X  O   20   5
			4   진달래  X  O  X  O  O   60   3
			5   봉선화  O  O  X  X  X   40   4
			------------------------------------
			- 맞은문제 O, 틀린문제 X표시
			- 점수: O당 20점씩
			- 등수: 점수를 기준으로 높은사람이 1등
		
		
		
		*/
		
		/*Jumsu su = new Jumsu(1,"가나다",3,3,3,3,3);
		
		su.compute();*/
		
		//1) 1명을 대상으로 성적 구하기.
		//Jumsu student = new Jumsu(1,"홍길동",3,4,3,3,3);
		//student.compute();
		//student.disp();
		
		//2) 5명의 성적 구하기
		// * 참조 oop0908.Test01_array 클래스
		Jumsu[] student = {
				new Jumsu(1,"홍길동",3,4,3,3,3)
				,new Jumsu(2,"무궁화",3,3,3,3,3)
				,new Jumsu(3,"라일락",1,2,4,4,3)
				,new Jumsu(4,"진달래",2,3,1,3,3)
				,new Jumsu(5,"봉선화",3,3,4,1,1)
		};
		
		int size = student.length;
		
		// OX 표시하고 점수 계산하기
		for(int i=0; i<size; i++)
		{
			student[i].compute();
		}//for end
		
		
		// 문제) student배열의 score를 기준으로 등수 구하기.
		//d:\java202307\frontend\javascript\section0807\01_성적표.html
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(student[i].score<student[j].score) {
					student[i].rank=student[i].rank+1;
				}//if end
			}// for end
		} //for end
		
		
		// 출력하기
		for(int i=0; i<size; i++) {
			student[i].disp();
		}
		
		
	}//main end

}//class end

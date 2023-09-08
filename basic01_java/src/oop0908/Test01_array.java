package oop0908;

public class Test01_array {

	public static void main(String[] args) {
		//객체 배열
		
		Score kim = new Score("봉선화",10,20,30);//#100

		Score lee = new Score("라일락",40,50,60);//#200
		Score park = new Score("진달래",70,80,90);
		
		kim.calc();
		lee.calc();
		park.calc();
		
		kim.disp();
		park.disp();
		
		Score[] score = {
			new Score("봉선화",10,20,30)
		   ,new Score("코리아",40,50,60)
		   ,new Score("대한민국",77,88,99)
		};
		
		/*
        +---------+---------+--------+
        |  #100   |  #200   |  #300  |
        +---------+---------+--------+
         score[0]   score[1]  score[2]
        */
		
		score[0].calc();
		score[1].calc();
		score[2].calc();
		
		score[0].disp();
		score[1].disp();
		score[2].disp();
		
		int size=score.length; //3
		
		for(int i=0; i<size; i++) {
			score[i].calc();
			score[i].disp();
		}
		
	}//main() end

}//class end


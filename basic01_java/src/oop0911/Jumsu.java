package oop0911;

class Jumsu {
	//멤버변수 field
	private int no;                  //번호
	private String name;             //이름
	private char[] ox=new char[5];   //OX표시
	private int[] answer=new int[5]; //답안지 제출
	public int score;                //점수
	public int rank;                 //등수
	
	
	//생성자함수 coustructor
	public Jumsu() {}
	public Jumsu(int no, String name, int a0, int a1, int a2, int a3, int a4) {
		this.no = no;
		this.name = name;
		this.answer[0]=a0;
		this.answer[1]=a1;
		this.answer[2]=a2;
		this.answer[3]=a3;
		this.answer[4]=a4;
		this.rank = 1;
	}// end
	
	//멤버함수 method
	public void compute() {
		// 정답
		int[] dap = {3,3,3,3,3};
		
		// 문제)
		// 정답(dap)과 제출한 답안(answer)를 비교해서
		// ox를 구하고, 맞은 갯수에 따라 점수 (score)를 구하시오.
		
		//////////내가한거////////////////////
		/*for(int i=0; i<dap.length; i++) {
			if(this.answer[i]==dap[i]) {
				score = score + 20;
				ox[i] = 'O';
			} else {
				ox[i] = 'X';
			}
		}
		
		System.out.println(ox);
		System.out.println(score);*/
		////////////////////////////////
		
		/* 
		if(dap[0] == answer[0]
		if(dap[1] == answer[1])
		if(dap[2] == answer[2])
		if(dap[3] == answer[3])
		if(dap[4] == answer[4])
		*/
		
		for(int i=0; i<5; i++) {
			if(dap[i]== answer[i]) {
				ox[i]='O';//맞았을때
				score=score+20;
			}else {
				ox[i]='X';//틀렸을때
			}//if end
		}//for end
		
		
	}//compute() end


	
	public void disp() {
		System.out.print(no+" ");
		System.out.print(name+" ");
		for(int i=0; i<ox.length;i++) {
			System.out.print(ox[i]+" ");
		};
		System.out.print(score+" ");
		System.out.print(rank+" ");
		System.out.println();
	}//disp() end
	
}//class end

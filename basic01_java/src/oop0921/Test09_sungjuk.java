package oop0915;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Test09_sungjuk {

	public static void main(String[] args) {
		//문제) 성적 프로그램
		//-> 성적 입력 자료 (sungjuk.txt)를 가져와서, 성적 결과 파일 완성하기.(result.txt)
		/*
		 	1) 입력 데이터 파일 : sungjuk.txt
		 	
		 	2) 결과 파일 : result.txt
		 	성 / 적 / 결 /과
              -------------------------------------------------------
              이름     국어   영어  수학   평균  등수   결과
              -------------------------------------------------------                       
              라일락    100  100  100   100   1    합격 ********** 장학생
              진달래     50   55   60    55   4    불합격 *****
              개나리     95   95   35    75   3    재시험 *******
              무궁화     80   85   90    85   2    합격 *******
              홍길동     60   40   30    43   5    불합격 ****
              ------------------------------------------------------
		 	
		 	//※ 참조 oop0905.Test01_format 클래스
		 	//      out.printf()
		*/
		
		String inName = "D:/java202307/sungjuk.txt";
		String outName = "D:/java202307/result.txt";
		
		FileReader fr=null;
		BufferedReader br=null;
		
		FileWriter fw=null;
		PrintWriter out=null;
		
		try {
			/*fr = new FileReader(inName);
			
			br = new BufferedReader(fr);
			
				String[] s = new String[5];
				int i = 0;
				while(true) {
					
				String line = br.readLine();
				if(line == null) {//파일의 끝인지? (EOF)
					break;
				}
				//System.out.println(line);
				s[i] = line;
				i++;
			}
		    
		    String a= s[0];
		    String b= s[1];
		    String c= s[2];
		    String d= s[3];
		    String e= s[4];
		    
		    String[] aa = a.split(",");
		    String[] bb = b.split(",");
		    String[] cc = c.split(",");
		    String[] dd = d.split(",");
		    String[] ee = e.split(",");
		    
		    int a1 = Integer.parseInt(aa[1]);
		    int a2 = Integer.parseInt(aa[2]);
		    int a3 = Integer.parseInt(aa[3]);
		    
		    int b1 = Integer.parseInt(bb[1]);
		    int b2 = Integer.parseInt(bb[2]);
		    int b3 = Integer.parseInt(bb[3]);
		    
		    int c1 = Integer.parseInt(bb[1]);
		    int c2 = Integer.parseInt(bb[2]);
		    int c3 = Integer.parseInt(bb[3]);
		    
		    int d1 = Integer.parseInt(dd[1]);
		    int d2 = Integer.parseInt(dd[2]);
		    int d3 = Integer.parseInt(dd[3]);
		    
		    int e1 = Integer.parseInt(ee[1]);
		    int e2 = Integer.parseInt(ee[2]);
		    int e3 = Integer.parseInt(ee[3]);
		    
		    System.out.println(a2);
		    
		    
		    int kor = 0;
		    int mat = 0;
		    
		    int eng = 0;
		    int aver = (kor + eng + mat)/3;
		    int a1aver = (a1 + a2 + a3)/3;
		    int b1aver = (b1 + b2 + b3)/3;
		    int c1aver = (c1 + c2 + c3)/3;
		    int d1aver = (d1 + d2 + d3)/3;
		    int e1aver = (e1 + e2 + e3)/3;
		    
		    System.out.println("-------------------------------------");
		    System.out.println("이름  국어  영어  수학   평균    등수     결과");
		    System.out.println("-------------------------------------");
		    System.out.printf(" %s  %d   %d   %d   %d  ", aa[0], a1, a2 ,a3, a1aver);
		    System.out.println();
	 	    System.out.printf(" %s  %d   %d   %d   %d ", bb[0], b1, b2 ,b3,b1aver);
		    System.out.println();
		    System.out.printf(" %s  %d   %d   %d   %d ", cc[0], c1, c2 ,c3,c1aver);
		    System.out.println();
		    System.out.printf(" %s  %d   %d   %d %d  ", dd[0], d1, d2 ,d3,d1aver);
		    System.out.println();
		    System.out.printf(" %s  %d   %d   %d  %d ", ee[0], e1, e2 ,e3,e1aver);
		    */
			
			//1)단계 : 데이터 저장 변수 선언
			String[] name = new String[5];
			int[] kor = new int[5];
			int[] mat = new int[5];
			int[] eng = new int[5];
			
			int[] aver = new int[5];
			int[] rank = {1,1,1,1,1};
			
			int size = name.length; //5
			int i = 0;
			
			//2)단계 : 데이터 입력 파일 (sungjuk.txt) 가져와서 내용을 읽기.
			fr = new FileReader(inName); //sungjuk.txt 가져오기
			br = new BufferedReader(fr); //엔터를 기준으로 끊어서 읽어 오기 위해 BufferedReader에 옮겨담기
			String line = null;
			
			while(true) {
				line=br.readLine(); // "무궁화,95,90,100"
				if(line == null) {
					break;
				}// if end
				System.out.println(line);
				
				// ,를 기준으로 문자열을 분리한 후 1)단계에서 선언한 변수에 저장하기.
				String[] word= line.split(",");
				name[i] = word[0].trim();
				kor[i] = Integer.parseInt(word[1].trim());
				eng[i] = Integer.parseInt(word[2].trim());
				mat[i] = Integer.parseInt(word[3].trim());
				i++; // 다음사람
			}//while end
			
			//3)단계 구하기.
			for(i=0; i<size; i++) {
				aver[i]=(kor[i]+eng[i]+mat[i])/3;
			}// for end
			
			//4)단계 : 등수 구하기 (평균을 기준으로)
			for(int a=0; a<size; a++) {
				for(int b=0; b<size; b++){
					if(aver[a]<aver[b]) 
						rank[a]=rank[a]+1; //rank[a]++
				}//for end
			}//for end
			
			
			//5)단계 : result.txt 결과 출력하기.
			fw = new FileWriter(outName, false);
			out = new PrintWriter(fw,true);
			
			out.println("성/적/결/과");
			out.println("-----------------------------------------------");
			out.println("이름       국어   영어  수학   평균   등수   결과 ");
			out.println("-----------------------------------------------");
			
			
			
			//참조 oop0905.Test01_format 클래스
			// out.printf()
			
			//6)단계 : 5명의 데이터 출력하기.
			for(i=0;i<size;i++) {
				out.printf("%-6s %5d %5d %5d %5d %5d ",name[i], kor[i],eng[i],mat[i],aver[i],rank[i]);
			
				if(aver[i]>=70) {
					if(kor[i]<40 || eng[i]<40 || mat[i]<40) {
						out.printf("%-5s","재시험");
					}else {
						out.printf("%-5s","합격");
					}// if end
				}else {
					out.printf("%-5s","불합격");
				}// if end
				
				for(int star=0; star<aver[i]/10; star++) {
					out.print("*");
				}// for end
			
				if(aver[i]>=95) out.printf("%-12s","장학생"); // 10칸 내에서 오른쪽 정렬
				
				out.println(); //줄바꿈
			}// for end
			
			

			System.out.println("result.txt 성적프로그램이 완성되었습니다.");
			

			
			}catch (Exception e) {
			System.out.println("성적 프로그램 읽고, 쓰기 실패: "+ e);
		    }finally {
			//자원 반납
			try {
				if(br!=null) { br.close(); }
			}catch(Exception e) {}
			try {
				if(fr!=null) { fr.close(); }
			}catch (Exception e) {}
			try {
				if(out!=null) { out.close(); }
			}catch (Exception e) {}
			try {
				if(fw!=null) {fw.close();}
			}catch (Exception e) {}
		}//end
		

	}//main()end

}//class end

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
			fr = new FileReader(inName);
			
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
		    
		    
		    int kor = 0;
		    int mat = 0;
		    
		    int eng = 0;
		    int aver = (kor + eng + mat)/3;
		    
		    System.out.println("-------------------------------------");
		    System.out.println("이름  국어  영어  수학   평균    등수     결과");
		    System.out.println("-------------------------------------");
		    System.out.printf("%s    %s   %s   %s",aa[0],aa[1],aa[2],aa[3]);
		    
			

			
			

			
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

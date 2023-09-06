package oop0906;

import java.util.Arrays;

public class Test01_sort {

	public static void main(String[] args) {
		// 정렬 Sort
		/*
		   - 정렬 유형 : 오름차순, 내림차순
		   
		   - 정렬 방식
		     삽입 정렬 insertion sort
		     선택 정렬 selection sort
		     버블 정렬 bubble sort
		     
		   
		   - 선택 정렬 selection sort 알고리즘
		      9 8 7 6 5 - 56789
		     
		      8 9 7 6 5
		      
		      7 9 8 6 5
		      
		      6 9 8 7 5
		      
		      5 9 8 7 6
		      
		      ---------------- step 1 (1회전 정렬)
		      
		      5 8 9 7 6
		      
		      5 7 9 8 6
		      
		      5 6 9 8 7
		      
		      ---------------- step 2 (2회전 정렬)
		      
		      5 6 8 9 7
		       
		      5 6 7 9 8
		       
	          ---------------- step 3 (3회전 정렬)
		       
		      5 6 7 8 9
		       
		      ---------------- step 4  (4회전 정렬 끝)
		     
		     - 버블 정렬 bubble sort 알고리즘
		     
		     9 8 7 6 5
		     8 9 7 6 5
		     8 7 9 6 5
		     8 7 6 9 5
		     8 7 6 5 9
		     ----------
		     7 8 6 5 9
		     7 6 8 5 9
		     7 6 5 8 9
		     7 6 5 9 8
		     ----------
		     6 7 5 9 8
		     6 5 7 9 8
		     6 5 7 9 8
		     6 5 7 8 9
		     ----------
		     5 6 7 8 9
		  
		  
		  
		 */
		
		int[] su = {9,8,7,6,5};
		
		// 숫자형 데이터를 오름차순 정렬
		Arrays.sort(su);
		
		for(int i=0; i<su.length; i++) {
			System.out.println(su[i]);
		}// for end 
		
		// select sort
		for(int a=0; a<su.length-1; a++) {
			for(int b=a+1; b<su.length; b++) {
				if(su[a]>su[b]) { // 오름차순
					int tmp=su[a];
					su[a]=su[b];
					su[b]=tmp;
				}// if end
			}// for end
		}//for end
		
		for(int i=0; i<su.length; i++) {
			System.out.println(su[i]);
		}//for end
		
		
		// bubble sort
		for(int a=3; a>=0; a--) {
			for(int b=0; b<=a; b++) {
				if(su[b]<su[b+1]) {
					int tmp=su[b+1];
					su[b+1]=su[b];
					su[b]=tmp;
				}//if end
			}// for end
		}// for end
		
		for(int idx=0; idx<su.length; idx++) {
			System.out.println(su[idx]);
		}// for end
		


	}//main() end

}// class end

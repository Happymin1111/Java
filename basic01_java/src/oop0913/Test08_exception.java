package oop0913;

public class Test08_exception {

	public static void main(String[] args) {
		// 예외처리 Exception
		/*
			- 자바 클래스 실행(Run)시 발생하는 에러
			- try ~ catch
			- finally
			- throws
		*/
		
		//1) 예외처리 하지 않은 경우
		/*
		System.out.println(1);
		//Exception이 발생되면 프로그램은 정상적으로 종료되지 않음.
		System.out.println(3/0);//ArithmeticException
		System.out.println(5);
		System.out.println("END");
        */
		////////////////////////////////////////////////////////////////////////
		
		//2) 예외처리를 한 경우
		//->Exception이 발생하더라도 정상적으로 프로그램은 종료시킬 수 있다.
		/*try {
			//예외 발생이 예상되는 코드 작성
			System.out.println(1);
			System.out.println(3/0);
			System.out.println(5);
			
		} catch(ArithmeticException e) {
			//예외가 발생되었을 때 처리할 코드 작성
			System.out.println(e);
		}//end
		*/
		//3)
		/*
				try {
					System.out.println(1);
					int[] num= new int[3];
					num[5] = 7;
					System.out.println(9);
					
				} catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
				}//end
		
		System.out.println("END");
		*/
		
		//4)
		/*
		try {
			System.out.println(1);
			int num = Integer.parseInt("KOREA");
			System.out.println(num);
			System.out.println(3);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}//end
		
		System.out.println("END");
		*/
		//////////////////////////////////////////////////////////
		
		//5)
		/*
		try {
			System.out.println(1);
			Integer inte = null;
			System.out.println(5/inte);
		} catch(NullPointerException e) {
			e.printStackTrace();
		}//end
		
		System.out.println("END");
		*/
		//////////////////////////////////////////////////
		
		//6)다중 catch문
		/*try {
			int a= 2/0;
			int b=Integer.parseInt("KOREA");
			int[] num = new int[3];
			num[5]=7;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}//end
		
		System.out.println("END");*/
		////////////////////////////////////////////////////
		
		//7)
		/*try {
			int a= 2/0;
			int b=Integer.parseInt("KOREA");
			int[] num = new int[3];
			num[5]=7;
		} catch(Exception e) {//다형성
		//Exception 클래스 : 모든 예외 발생의 조상클래스
			e.printStackTrace();
		}// end
		
		System.out.println("END");*/
		
		////////////////////////////////////////////////////////
	
		//8) finally문
		//->예외가 발생하거나, 발생하지 않더라도 무조건 실행!
		
		try {
			System.out.println("OPEN");
			System.out.println(1/0);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("CLOSE");
		}//end
		
		System.out.println("END");
		
		
		
		
	}//main() end

}//class end

package jdbc0918;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test02_insert {

	public static void main(String[] args) {
		// sungjuk 테이블 행추가 연습
		
		try {
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password ="1234";
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("오라클DB 서버 연결 성공!!");
			
			//4)SQL 작성
			// -> 주의사항 ) SQL 종결문자 ;를 쓰면 오류남
			StringBuilder sql = new StringBuilder();
			sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate) ");
			sql.append(" VALUES (sungjuk_seq.nextval,'김현아',88,88,88,'Seoul',sysdate) ");
			
			//5)SQL형식으로 변환
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			//6)SQL문 실행
			//실행한 SQL문의 행의 갯수 반환
			int cnt = pstmt.executeUpdate(); //INSERT, UPDATE, DELETE문 실행
			
			System.out.println("실행결과 : " + cnt);
			
			//자원 반납 (순서주의)
	
			pstmt.close();
			con.close(); 
			
			
			
		}catch (Exception e) {
			System.out.println("오라클 JDBC 실패 :" + e);
		}
	}//main() end

}//class end

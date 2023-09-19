package jdbc0919;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test05_selectJoin {

	public static void main(String[] args) {
		// 문제
        /*     
        g1001      d001     HTML
        g1001      p001     JAVA
        g1001      p002     Oracle
        g1001      p003     JSP
        g1001      p004     Python
        g1001      p005     AJAX      
    */
		
		String hakno="g1001";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password ="1234";
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("오라클DB 서버 연결 성공!!");
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(" select hakno,GW.gcode, gname ");
			sql.append(" from tb_sugang SU inner join tb_gwamok GW ");
			sql.append(" on SU.gcode = GW.gcode ");
			sql.append(" where hakno=? ");
			sql.append(" order by SU.gcode ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, hakno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) { //cursor가 있는지?
				System.out.println("자료 있음~~");
				
				do {
					System.out.print(rs.getString("hakno")+ " ");
					System.out.print(rs.getString("gcode")+" ");
					System.out.print(rs.getString("gname") + " ");
					System.out.println();
				}while(rs.next());
				
			}else {
				System.out.println("자료 없음!!");
			}// if end
			
			
		}catch (Exception e) {
			System.out.println("오라클 JDBC 실패 :" + e);
		}finally {//자원반납(순서주의)
			try {
				if(rs!=null) {rs.close();}
			}catch(Exception e) {}
			
			try {
				if(pstmt!=null) {pstmt.close();}
			}catch(Exception e) {}
			
			try {
				if(con!=null) {con.close();}
			}catch (Exception e) {}
		}
		

	}//main() end

}//class end

package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url =  "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE";
		
		//jdbc 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//연결 /인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//실행
		Statement st = con.createStatement();
		
		//결과 가져오기
		ResultSet rs = st.executeQuery(sql);
		
		//결과 실행하기
//		rs.next();
//		System.out.println(rs.getString("title"));
		
/*		while(rs.next()) {
			String str = rs.getString("title");
			if(str.indexOf("A")>=0)	//A가 없으면 -1 반환
				System.out.println(rs.getString("title"));
			
//			if(str.contains("A"))
//				System.out.println(rs.getString("title"));
			
		}*/
		
		while(rs.next())
			System.out.println(rs.getString("title"));
		
		
		rs.close();
		st.close();
		con.close();
		
	}

}

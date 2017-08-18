package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("제목을 입력해주세요: ");
		String keyword;
		keyword = scan.nextLine();
		String url =  "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE WHERE TITLE LIKE '%"+keyword+"%'";
		
		//jdbc 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//연결 /인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//실행
		Statement st = con.createStatement();
		
		//결과 가져오기
		ResultSet rs = st.executeQuery(sql);
		
		//결과 실행하기
		
		while(rs.next())
			System.out.printf("ID: %s TITLE: %s\n", rs.getString("id"), rs.getString("title"));
		
		rs.close();
		st.close();
		con.close();
		
	}

}

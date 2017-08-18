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
		
		//jdbc ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//���� /����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//����
		Statement st = con.createStatement();
		
		//��� ��������
		ResultSet rs = st.executeQuery(sql);
		
		//��� �����ϱ�
//		rs.next();
//		System.out.println(rs.getString("title"));
		
/*		while(rs.next()) {
			String str = rs.getString("title");
			if(str.indexOf("A")>=0)	//A�� ������ -1 ��ȯ
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

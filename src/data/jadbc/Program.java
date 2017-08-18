package data.jadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	private NoticeService service;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		EXIT:
		while(true) {
			System.out.println("����������������������������������������������������");
			System.out.println("��          ���� �޴�                  ��");
			System.out.println("����������������������������������������������������");
			
			System.out.printf("\t1. �Խù� �Է�\n");
			System.out.printf("\t2. �Խù� ��ȸ\n");
			System.out.printf("\t3. ����\n");
			System.out.print("����>> ");
			
			switch(inputMenu()) {
				case 1:
					inputNotice();
					break;
				case 2:
					listNotice();
					break;
				case 3:
					System.out.println("���α׷��� �����մϴ�.");
					break EXIT;
				default:
					System.out.println("1~3������ ���ڸ� �Է��ϼ���.");
			}
			
		}

	}

	private static void listNotice() throws ClassNotFoundException, SQLException {
/*		String url =  "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE";
		
		//jdbc ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//���� /����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//����
		Statement st = con.createStatement();
		
		//��� ��������
		ResultSet rs = st.executeQuery(sql);
		
		
		// Model--------------------------------------------------------------------------------------
		List<Notice> list = new ArrayList<Notice>();
		
		while(rs.next()) {
			Notice n = new Notice();
			n.setId(rs.getString("ID"));
			n.setTitle(rs.getString("TITLE"));
			n.setContent(rs.getString("CONTENT"));
			n.setHit(rs.getInt("HIT"));
			list.add(n);
		}
		
		rs.close();
		st.close();
		con.close();*/
		
		List<Notice> list = service.getList();
		
		// View--------------------------------------------------------------------------------------
		for(Notice n: list)		//Notice ������ �迭 list�� ���
			System.out.printf("%s \t%s \t%s \t%s\n", 
					n.getId(), n.getTitle(), n.getContent(), n.getHit());
		
	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		return num;
	}

	private static void inputNotice() throws ClassNotFoundException, SQLException {
		
		//����ڿ��� NOTICE�� ���� �����͸� �Է¹���
		Scanner scan = new Scanner(System.in);
		String id, title, content;
		
		System.out.print("ID�� �Է����ּ���: ");
		id = scan.nextLine();
		
		System.out.print("������ �Է����ּ���: ");
		title = scan.nextLine();
		
		System.out.print("������ �Է����ּ���: ");
		content = scan.nextLine();
		
		// --------------------------------------------------------------------------------------------
		service.insert(id, title, content);
		
/*		String url =  "jdbc:oracle:thin:@211.238.142.251:1521:orcl";

		String sql = "INSERT INTO NOTICE VALUES('"+id+"','"+title+"','"+content+"','"+id+"', SYSTIMESTAMP, 0)";
		
		//jdbc ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//���� /����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//����
		Statement st = con.createStatement();
		
		st.executeUpdate(sql);		//select �Ҷ��� executeQuery()�� ����
		
		st.close();
		con.close();*/
		
	}

}

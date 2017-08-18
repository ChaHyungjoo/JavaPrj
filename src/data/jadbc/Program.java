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
			System.out.println("┌────────────────────────┐");
			System.out.println("│          메인 메뉴                  │");
			System.out.println("└────────────────────────┘");
			
			System.out.printf("\t1. 게시물 입력\n");
			System.out.printf("\t2. 게시물 조회\n");
			System.out.printf("\t3. 종료\n");
			System.out.print("선택>> ");
			
			switch(inputMenu()) {
				case 1:
					inputNotice();
					break;
				case 2:
					listNotice();
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					break EXIT;
				default:
					System.out.println("1~3까지의 숫자를 입력하세요.");
			}
			
		}

	}

	private static void listNotice() throws ClassNotFoundException, SQLException {
/*		String url =  "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM NOTICE";
		
		//jdbc 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//연결 /인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//실행
		Statement st = con.createStatement();
		
		//결과 가져오기
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
		for(Notice n: list)		//Notice 형식의 배열 list를 출력
			System.out.printf("%s \t%s \t%s \t%s\n", 
					n.getId(), n.getTitle(), n.getContent(), n.getHit());
		
	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		return num;
	}

	private static void inputNotice() throws ClassNotFoundException, SQLException {
		
		//사용자에게 NOTICE에 넣을 데이터를 입력받음
		Scanner scan = new Scanner(System.in);
		String id, title, content;
		
		System.out.print("ID를 입력해주세요: ");
		id = scan.nextLine();
		
		System.out.print("제목을 입력해주세요: ");
		title = scan.nextLine();
		
		System.out.print("내용을 입력해주세요: ");
		content = scan.nextLine();
		
		// --------------------------------------------------------------------------------------------
		service.insert(id, title, content);
		
/*		String url =  "jdbc:oracle:thin:@211.238.142.251:1521:orcl";

		String sql = "INSERT INTO NOTICE VALUES('"+id+"','"+title+"','"+content+"','"+id+"', SYSTIMESTAMP, 0)";
		
		//jdbc 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//연결 /인증
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//실행
		Statement st = con.createStatement();
		
		st.executeUpdate(sql);		//select 할때만 executeQuery()를 쓴다
		
		st.close();
		con.close();*/
		
	}

}

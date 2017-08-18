package oop.collec;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		ExamConsole console = new ExamConsole();
		
		EXIT:
		while(true) {
			System.out.println("┌────────────────────────┐");
			System.out.println("│                          메인 메뉴                          │");
			System.out.println("└────────────────────────┘");
			
			System.out.printf("\t\t1. 성적 입력\n");
			System.out.printf("\t\t2. 성적 출력\n");
			System.out.printf("\t\t3. 종료\n");
			System.out.print("선택>> ");
			
			int menu = inputMenu();
			
			switch(menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.print();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break EXIT;
				
				default:
					System.out.println("ERROR: 1~3까지의 숫자를 입력해주세요.");
			}
		}
		
	}

	public static int inputMenu() {
		int menu;
		Scanner scan = new Scanner(System.in);
		menu = scan.nextInt();
		
		return menu;
	}
}

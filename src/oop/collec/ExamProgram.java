package oop.collec;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		ExamConsole console = new ExamConsole();
		
		EXIT:
		while(true) {
			System.out.println("����������������������������������������������������");
			System.out.println("��                          ���� �޴�                          ��");
			System.out.println("����������������������������������������������������");
			
			System.out.printf("\t\t1. ���� �Է�\n");
			System.out.printf("\t\t2. ���� ���\n");
			System.out.printf("\t\t3. ����\n");
			System.out.print("����>> ");
			
			int menu = inputMenu();
			
			switch(menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.print();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				break EXIT;
				
				default:
					System.out.println("ERROR: 1~3������ ���ڸ� �Է����ּ���.");
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

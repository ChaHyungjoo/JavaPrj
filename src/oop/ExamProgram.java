package oop;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		Exam exam = new Exam();
		
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
				exam.input();
				break;
			case 2:
				exam.print();
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

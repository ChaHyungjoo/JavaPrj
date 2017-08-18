package oop.is_a;

import java.util.Scanner;

public class ExamConsole {
	
	private Exam exam = new Exam();
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public void input() {
		int kor, eng, math, total;
		double avg;
		
		System.out.println("����������������������������������������������������");
		System.out.println("��                          ���� �Է�                          ��");
		System.out.println("����������������������������������������������������");
		
		Scanner scan = new Scanner(System.in);
		
		do{
			 System.out.print("\t\t����: ");
			 kor = scan.nextInt();
			 if(kor<0||kor>100) System.out.println("0~100������ ������ �Է��ϼ���.");
		 }while(kor<0||kor>100);
		
		do{
			 System.out.print("\t\t����: ");
			 eng = scan.nextInt();
			 if(eng<0||eng>100) System.out.println("0~100������ ������ �Է��ϼ���.");
		 }while(eng<0||eng>100);
		
		do{
			 System.out.print("\t\t����: ");
			 math = scan.nextInt();
			 if(math<0||math>100) System.out.println("0~100������ ������ �Է��ϼ���.");
		 }while(math<0||math>100);
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);

		System.out.println("������ �ԷµǾ����ϴ�.");
		
	}

	public void print() {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total = exam.total();
		double avg = exam.avg();
		
		System.out.println("����������������������������������������������������");
		System.out.println("��                          ���� ���                          ��");
		System.out.println("����������������������������������������������������");
		
		System.out.printf("\t\t����: %d\n", kor);
		System.out.printf("\t\t����: %d\n", eng);
		System.out.printf("\t\t����: %d\n", math);
		System.out.printf("\t\t����: %d\n", total);
		System.out.printf("\t\t���: %.2f\n\n", avg);
	}
	
}

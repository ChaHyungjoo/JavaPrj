package oop;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public Exam() {
		this(1,1,1);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void input() {
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
		
		total = kor + eng + math;
		avg = (total/3.0);
		System.out.println("������ �ԷµǾ����ϴ�.");
		
	}

	public void print() {
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

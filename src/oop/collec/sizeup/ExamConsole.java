package oop.collec.sizeup;
/*
Has A
-Composition Has A
-Association Has A
-Aggregation Has A
*/
import java.util.Scanner;

public class ExamConsole {
	
	private Exam[] exams;
	private int index;
	private int capacity;
	
	public ExamConsole() {
		exams = new Exam[3];
		index = 0;
		capacity = 3;
	}
	
	public void setExam(Exam[] exams) {
		this.exams = exams;
	}
	
	public void input() {
		int kor, eng, math;
		
		Scanner scan = new Scanner(System.in);
		System.out.println(exams.length);
		System.out.println("����������������������������������������������������");
		System.out.println("��                          ���� �Է�                          ��");
		System.out.println("����������������������������������������������������");
		
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
		
		Exam exam = new Exam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		exams[index++] = exam;

		System.out.println("������ �ԷµǾ����ϴ�.");
		
		if(index>=capacity) {
			Exam[] temp = new Exam[capacity+2];
			for(int j=0; j<exams.length; j++) {
				temp[j] = exams[j];
			}
			exams = temp;
			
			capacity+=2;
		}
		System.out.println(exams.length);
	}

	public void print() {
		
		System.out.println("����������������������������������������������������");
		System.out.println("��                          ���� ���                          ��");
		System.out.println("����������������������������������������������������");
		
		for(int i=0; i<index; i++) {
			Exam exam = exams[i];
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			int total = exam.total();
			double avg = exam.avg();
			
			System.out.printf("\t\t����: %d\n", kor);
			System.out.printf("\t\t����: %d\n", eng);
			System.out.printf("\t\t����: %d\n", math);
			System.out.printf("\t\t����: %d\n", total);
			System.out.printf("\t\t���: %.2f\n\n", avg);
		}

	}
	
}
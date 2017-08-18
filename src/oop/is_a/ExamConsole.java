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
		
		System.out.println("┌────────────────────────┐");
		System.out.println("│                          성적 입력                          │");
		System.out.println("└────────────────────────┘");
		
		Scanner scan = new Scanner(System.in);
		
		do{
			 System.out.print("\t\t국어: ");
			 kor = scan.nextInt();
			 if(kor<0||kor>100) System.out.println("0~100까지의 점수를 입력하세요.");
		 }while(kor<0||kor>100);
		
		do{
			 System.out.print("\t\t영어: ");
			 eng = scan.nextInt();
			 if(eng<0||eng>100) System.out.println("0~100까지의 점수를 입력하세요.");
		 }while(eng<0||eng>100);
		
		do{
			 System.out.print("\t\t수학: ");
			 math = scan.nextInt();
			 if(math<0||math>100) System.out.println("0~100까지의 점수를 입력하세요.");
		 }while(math<0||math>100);
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);

		System.out.println("성적이 입력되었습니다.");
		
	}

	public void print() {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total = exam.total();
		double avg = exam.avg();
		
		System.out.println("┌────────────────────────┐");
		System.out.println("│                          성적 출력                          │");
		System.out.println("└────────────────────────┘");
		
		System.out.printf("\t\t국어: %d\n", kor);
		System.out.printf("\t\t영어: %d\n", eng);
		System.out.printf("\t\t수학: %d\n", math);
		System.out.printf("\t\t총점: %d\n", total);
		System.out.printf("\t\t평균: %.2f\n\n", avg);
	}
	
}

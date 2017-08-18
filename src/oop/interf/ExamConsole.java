package oop.interf;

import java.util.Scanner;

import oop.interf.Exam;

public abstract class ExamConsole {
	
	private Exam exam = newExam();
	public abstract Exam newExam();
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public void input() {
		int kor=0, eng=0, math=0;
		
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
		
		// 새로 추가된 과목을 입력
		//onInput(exam);

		//System.out.println("성적이 입력되었습니다.");
		
	}

//	protected abstract void onInput(Exam exam);
	protected abstract void onPrint(Exam exam);

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
		onPrint(exam);
		System.out.printf("\t\t총점: %d\n", total);
		System.out.printf("\t\t평균: %.2f\n\n", avg);
	}
	
}

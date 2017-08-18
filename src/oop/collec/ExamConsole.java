package oop.collec;
/*
Has A
-Composition Has A
-Association Has A
-Aggregation Has A
*/
import java.util.Scanner;

public class ExamConsole {
	
	private Exam[] exams;
	
	public ExamConsole() {
		for(int i=0; i<3; i++) 
			exams[i] = new Exam();
	}
	
	public void setExam(Exam[] exams) {
		this.exams = exams;
	}
	
	public void input() {
		int kor, eng, math;
		int index = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌────────────────────────┐");
		System.out.println("│                          성적 입력                          │");
		System.out.println("└────────────────────────┘");
		
		for(int i=0; i<index; i++) {
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
			
			Exam exam = new Exam();
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
			
			exams[index++] = exam;

			System.out.println("성적이 입력되었습니다.");
		}
	}

	public void print() {
		
		System.out.println("┌────────────────────────┐");
		System.out.println("│                          성적 출력                          │");
		System.out.println("└────────────────────────┘");
		
		for(int i=0; i<3; i++) {
			Exam exam = exams[i];
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			int total = exam.total();
			double avg = exam.avg();
			
			System.out.printf("\t\t국어: %d\n", kor);
			System.out.printf("\t\t영어: %d\n", eng);
			System.out.printf("\t\t수학: %d\n", math);
			System.out.printf("\t\t총점: %d\n", total);
			System.out.printf("\t\t평균: %.2f\n\n", avg);
		}

	}
	
}

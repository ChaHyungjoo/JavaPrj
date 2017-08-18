package capsule;

import java.util.Scanner;

public class Exam {
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public static void input(Exam[] exams) {
		System.out.println("┌────────────────────────┐");
		System.out.println("│                          성적 입력                          │");
		System.out.println("└────────────────────────┘");
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int kor, eng, math;
			do{
				 System.out.print("\t\t국어: ");
				 kor = scan.nextInt();
				 if(kor<0||kor>100) System.out.println("0~100까지의 점수를 입력하세요.");
			 }while(kor<0||kor>100);
			exams[i].kor = kor;
			
			do{
				 System.out.print("\t\t영어: ");
				 eng = scan.nextInt();
				 if(eng<0||eng>100) System.out.println("0~100까지의 점수를 입력하세요.");
			 }while(eng<0||eng>100);
			exams[i].eng = eng;
			
			do{
				 System.out.print("\t\t수학: ");
				 math = scan.nextInt();
				 if(math<0||math>100) System.out.println("0~100까지의 점수를 입력하세요.");
			 }while(math<0||math>100);
			exams[i].math = math;
			
			exams[i].total = exams[i].kor+exams[i].eng+exams[i].math;
			exams[i].avg = (exams[i].total/3.0);
			System.out.println("성적이 입력되었습니다.");
		}
	}
	
	public static void print(Exam[] exams) {
		System.out.println("┌────────────────────────┐");
		System.out.println("│                          성적 출력                          │");
		System.out.println("└────────────────────────┘");
		
		for(int i=0; i<3; i++) {
			System.out.printf("\t\t국어: %d\n",exams[i].kor);
			System.out.printf("\t\t영어: %d\n",exams[i].eng);
			System.out.printf("\t\t수학: %d\n",exams[i].math);
			System.out.printf("\t\t총점: %d\n",exams[i].total);
			System.out.printf("\t\t평균: %.2f\n\n", exams[i].avg);
		}
	}
	
}

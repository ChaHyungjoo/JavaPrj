package capsule;

import java.util.Scanner;

public class Exam {
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public static void input(Exam[] exams) {
		System.out.println("����������������������������������������������������");
		System.out.println("��                          ���� �Է�                          ��");
		System.out.println("����������������������������������������������������");
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int kor, eng, math;
			do{
				 System.out.print("\t\t����: ");
				 kor = scan.nextInt();
				 if(kor<0||kor>100) System.out.println("0~100������ ������ �Է��ϼ���.");
			 }while(kor<0||kor>100);
			exams[i].kor = kor;
			
			do{
				 System.out.print("\t\t����: ");
				 eng = scan.nextInt();
				 if(eng<0||eng>100) System.out.println("0~100������ ������ �Է��ϼ���.");
			 }while(eng<0||eng>100);
			exams[i].eng = eng;
			
			do{
				 System.out.print("\t\t����: ");
				 math = scan.nextInt();
				 if(math<0||math>100) System.out.println("0~100������ ������ �Է��ϼ���.");
			 }while(math<0||math>100);
			exams[i].math = math;
			
			exams[i].total = exams[i].kor+exams[i].eng+exams[i].math;
			exams[i].avg = (exams[i].total/3.0);
			System.out.println("������ �ԷµǾ����ϴ�.");
		}
	}
	
	public static void print(Exam[] exams) {
		System.out.println("����������������������������������������������������");
		System.out.println("��                          ���� ���                          ��");
		System.out.println("����������������������������������������������������");
		
		for(int i=0; i<3; i++) {
			System.out.printf("\t\t����: %d\n",exams[i].kor);
			System.out.printf("\t\t����: %d\n",exams[i].eng);
			System.out.printf("\t\t����: %d\n",exams[i].math);
			System.out.printf("\t\t����: %d\n",exams[i].total);
			System.out.printf("\t\t���: %.2f\n\n", exams[i].avg);
		}
	}
	
}

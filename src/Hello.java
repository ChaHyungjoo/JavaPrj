import java.io.IOException;
import java.util.Scanner;


class Hello{
	
	public static void main(String[] args) throws IOException{
		
		double kor=-1, eng=-1, math=-1, total=-1, avg=-1;
		int c;
		
		Scanner sc = new Scanner(System.in);
		
		비상구:
		while(true) {
			System.out.println("┌────────────────────────┐");
			System.out.println("│          메인 메뉴             │");
			System.out.println("└────────────────────────┘");
			
			System.out.printf("\t1. 성적 입력\n");
			System.out.printf("\t2. 성적 출력\n");
			System.out.printf("\t3. 종료\n");
			System.out.print("선택>> ");
			c = sc.nextInt();
			
			switch(c) {
			case 1:
				System.out.println("┌────────────────────────┐");
				System.out.println("│         성적 입력               │");
				System.out.println("└────────────────────────┘");
				
				do{
					 System.out.print("\t국어: ");
					 kor = sc.nextDouble();
					 if(kor<0||kor>100) System.out.println("0~100까지의 점수를 입력하세요.");
				 }while(kor<0||kor>100);
				
				do{
					 System.out.print("\t영어: ");
					 eng = sc.nextDouble();
					 if(eng<0||eng>100) System.out.println("0~100까지의 점수를 입력하세요.");
				 }while(eng<0||eng>100);
				
				do{
					 System.out.print("\t수학: ");
					 math = sc.nextDouble();
					 if(math<0||math>100) System.out.println("0~100까지의 점수를 입력하세요.");
				 }while(math<0||math>100);
				
				total = kor + eng + math;
				avg = total / 3;
				System.out.println("성적이 입력되었습니다.");
				break;
				
			case 2:
				if(total>=0&&avg>=0) {
					System.out.println("┌────────────────────────┐");
					System.out.println("│         성적 출력               │");
					System.out.println("└────────────────────────┘");
					
					for(int i=0;i<3;i++){
						System.out.printf("국어: %6.2f\n",kor);
						System.out.printf("영어: %6.2f\n",eng);
						System.out.printf("수학: %6.2f\n",math);
						System.out.printf("\n총점: %6.2f\n",total);
						System.out.printf("평균: %6.2f\n", avg);
						System.out.println("──────────────────────────");
						
					}
					
				}
				else System.out.println("입력된 성적이 없습니다.");
				break;
				
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break 비상구;
				
				default:
					System.out.println("1~3까지의 숫자를 입력하세요.");
					break;
			}
			
		}
		
	}
}
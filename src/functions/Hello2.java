package functions;
import java.io.IOException;
import java.util.Scanner;


class Hello2{
	
	public static void main(String[] args) throws IOException{
		
		double kor=-1, eng=-1, math=-1, total=-1, avg=-1;
		int c;
		
		double kors[] = new double[3];
		double engs[] = new double[3];
		double maths[] = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		���:
		while(true) {
			System.out.println("����������������������������������������������������");
			System.out.println("��          ���� �޴�             ��");
			System.out.println("����������������������������������������������������");
			
			System.out.printf("\t1. ���� �Է�\n");
			System.out.printf("\t2. ���� ���\n");
			System.out.printf("\t3. ����\n");
			System.out.print("����>> ");
			c = sc.nextInt();
			
			switch(c) {
			case 1:
				System.out.println("����������������������������������������������������");
				System.out.println("��         ���� �Է�               ��");
				System.out.println("����������������������������������������������������");
/*				
				do{
					 System.out.print("\t����: ");
					 kor = sc.nextDouble();
					 if(kor<0||kor>100) System.out.println("0~100������ ������ �Է��ϼ���.");
				 }while(kor<0||kor>100);
				*/
				
				for(int i=0;i<3;i++) {
					do{
						 System.out.print("\t����: ");
						 kor = sc.nextDouble();
						 if(kor<0||kor>100) System.out.println("0~100������ ������ �Է��ϼ���.");
					 }while(kor<0||kor>100);
					kors[i] = kor;
					
					do{
						 System.out.print("\t����: ");
						 eng = sc.nextDouble();
						 if(eng<0||eng>100) System.out.println("0~100������ ������ �Է��ϼ���.");
					 }while(eng<0||eng>100);
					engs[i] = eng;
					
					do{
						 System.out.print("\t����: ");
						 math = sc.nextDouble();
						 if(math<0||math>100) System.out.println("0~100������ ������ �Է��ϼ���.");
					 }while(math<0||math>100);
					maths[i] = math;
					
					System.out.println("������ �ԷµǾ����ϴ�.");
					
				}
				
				break;
				
			case 2:
				System.out.println("����������������������������������������������������");
				System.out.println("��         ���� ���               ��");
				System.out.println("����������������������������������������������������");
				
				for(int i=0;i<3;i++){
					total = kors[i]+engs[i]+maths[i];
					avg = total/3;
					System.out.printf("����: %6.2f\n",kors[i]);
					System.out.printf("����: %6.2f\n",engs[i]);
					System.out.printf("����: %6.2f\n",maths[i]);
					System.out.printf("\n����: %6.2f\n",total);
					System.out.printf("���: %6.2f\n", avg);
					System.out.println("����������������������������������������������������");
					
				}
				break;
				
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				break ���;
				
				default:
					System.out.println("1~3������ ���ڸ� �Է��ϼ���.");
					break;
			}
			
		}
		System.out.println("aa");
		
	}
}
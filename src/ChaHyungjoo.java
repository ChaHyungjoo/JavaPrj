import java.util.*;


public class ChaHyungjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1, n;
		double grade=0, sum=0;
		
		exit:
		while(true) {
			do {
				System.out.print("������ �Է��ϼ���(0~100����): ");
				grade = sc.nextInt();
				if(grade<0||grade>100) System.out.println("ERROR: 0~100���� ���ڸ� �Է����ּ���.");
			}while(grade<0||grade>100);
			
			System.out.println(grade+"���� �Է��Ͽ����ϴ�.");
			sum+=grade;
			
			do {
				System.out.print("���� �Է��� ��� �Ͻðڽ��ϱ�? 1.��     2.�ƴϿ� >> ");
				n = sc.nextInt();
				switch(n) {
				case 1:
					i++;
					break;
					
				case 2:
					System.out.println("======================================");
					System.out.println("����: "+ sum);
					System.out.println("���: "+ sum/i);
					break exit;
					
					default: 
						System.out.println("ERROR: 1���� 2�� �߿� �����ϼ���.");
						break;
				}
			}while(n<1||n>2);
		}
		
	}

}

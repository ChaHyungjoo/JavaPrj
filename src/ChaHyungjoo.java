import java.util.*;


public class ChaHyungjoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1, n;
		double grade=0, sum=0;
		
		exit:
		while(true) {
			do {
				System.out.print("성적을 입력하세요(0~100까지): ");
				grade = sc.nextInt();
				if(grade<0||grade>100) System.out.println("ERROR: 0~100까지 숫자를 입력해주세요.");
			}while(grade<0||grade>100);
			
			System.out.println(grade+"점을 입력하였습니다.");
			sum+=grade;
			
			do {
				System.out.print("성적 입력을 계속 하시겠습니까? 1.예     2.아니오 >> ");
				n = sc.nextInt();
				switch(n) {
				case 1:
					i++;
					break;
					
				case 2:
					System.out.println("======================================");
					System.out.println("총점: "+ sum);
					System.out.println("평균: "+ sum/i);
					break exit;
					
					default: 
						System.out.println("ERROR: 1번과 2번 중에 선택하세요.");
						break;
				}
			}while(n<1||n>2);
		}
		
	}

}

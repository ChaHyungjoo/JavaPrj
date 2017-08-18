package functions;

public class Hello4 {

	public static void main(String[] args) {
		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];
		int menu;
		
		EXIT:
		while(true) {
			//1. 메인메뉴 입력
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				inputExam(kors, engs, maths);
				break;
			case 2:
				inputExam(kors, engs, maths);
				break;
			case 3:
				break EXIT;
			}
		}
		

	}

	private static void inputExam(int[] kors, int[] engs, int[] maths) {
		
		
	}

	private static int inputMenu() {
		
		return 0;
	}
	
	static void print(int a, float b, char c) {
		
	}

}

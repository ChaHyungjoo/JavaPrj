package functions;
import java.util.*;

public class Omok {

	public static void main(String[] args) {
		
		Omok();
		
	}
	
	private static void Omok() {
		Scanner sc = new Scanner(System.in);
		boolean[][] xy = new boolean[20][15];
		int n;
		
		EXIT:
		while(true) {
			System.out.print("1. �ٵϵ� �Է�   2. ����: ");
			n = sc.nextInt();
			switch(n) {
			case 1:
				inputOmok(xy);
				break;
			case 2:
				break EXIT;
			
				default:
					System.out.println("ERROR: 1�̳� 2�� �Է��ϼ���.");
			}
		}
	}

	private static boolean[][] inputOmok(boolean[][] xy) {
		Scanner sc = new Scanner(System.in);
		int ox, oy;
		
		System.out.print("(x, y) ��ǥ�� �Է����ּ���(��: 1 2): ");
		ox = sc.nextInt();
		oy = sc.nextInt();
		
		printOmok(ox, oy, xy);
		
		return xy;
	}

	private static void printOmok(int ox, int oy, boolean[][] xy) {
		xy[oy][ox] = true;
		for(int y=0; y<15; y++) {
			for(int x=0; x<20; x++) {
				if(xy[x][y]== true)
					System.out.print("��");
				else 
					System.out.print("��");
			}
			System.out.println();
		}
	}

}

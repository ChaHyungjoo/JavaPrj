package structured.data;

import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Omok형의 주소배열 10개를 생성
		Omok[] omoks = new Omok[10];
		//omoks[0] = new Omok();
		//omoks[1] = new Omok();
		//omoks[2] = new Omok();	....각각 new 생성해줘야됨
		
		Omok omok = new Omok();
		
		printBoard();
		input(omoks);
		printBoard(omok);

	}

	private static void printBoard(Omok omok) {
		int ox = omok.x;
		int oy = omok.y;
		
		for(int y=0; y<15; y++) {
			for(int x=0; x<20; x++) {
				if(x==ox&&y==oy)
					System.out.print("●");
				else 
					System.out.print("┼");
			}
			System.out.println();
		}
	}

	private static void input(Omok[] omoks) {
		Scanner sc = new Scanner(System.in);
		Omok  omok = new Omok();
		
		omok.x = sc.nextInt();
		omok.y = sc.nextInt();
		
		omoks[0] = omok;
	}

	private static void printBoard() {
		for(int y=0; y<15; y++) {
			for(int x=0; x<20; x++) 
				System.out.print("┼");
			System.out.println("");
		}
	}

}

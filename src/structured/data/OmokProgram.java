package structured.data;

import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Omok omok = new Omok();
		
		printBoard();
		input(omok);
		printBoard(omok);

	}

	private static void printBoard(Omok omok) {
		int ox = omok.x;
		int oy = omok.y;
		
		for(int y=0; y<15; y++) {
			for(int x=0; x<20; x++) {
				if(x==ox&&y==oy)
					System.out.print("¡Ü");
				else 
					System.out.print("¦«");
			}
			System.out.println();
		}
	}

	private static void input(Omok omok) {
		Scanner sc = new Scanner(System.in);
		
		omok.x = sc.nextInt();
		omok.y = sc.nextInt();
		
	}

	private static void printBoard() {
		for(int y=0; y<15; y++) {
			for(int x=0; x<20; x++) 
				System.out.print("¦«");
			System.out.println("");
		}
	}

}

package homework;

import java.util.Scanner;

public class OmokConsole2 extends OmokConsole {
	
	private Omok omok;
	
	@Override
	public Omok newOmok() {
		omok = new Omok();
		return omok;
	}
	
	@Override
	public void printBoard() {
		for(int j=0; j<15; j++) {
			for(int i=0; i<20; i++) 
				System.out.print("¦«");
			System.out.println();
		}
		System.out.println();
		
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		omok.setX(x);
		omok.setY(y);
		
	}
	
	@Override
	public void print() {
		int x = omok.getX();
		int y = omok.getY();
		for(int j=0; j<15; j++) {
			for(int i=0; i<20; i++) {
				if(x==i&&y==j)
					System.out.print("¡Ü");
				else 
					System.out.print("¦«");
			}
			System.out.println();
		}
	}
	

}

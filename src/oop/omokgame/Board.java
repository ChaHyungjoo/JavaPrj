package oop.omokgame;

public class Board {
	
	private Omok  omok = new Omok();
	
	public void create() {
		System.out.println("보드를 생성합니다.");
	}

	public void print() {
		for(int j=0; j<15; j++) {
			for(int i=0; i<20; i++) 
				System.out.print("┼");
			System.out.println();
		}
		System.out.println();
		
	}

	public void put(Omok omok) {
		int x, y;
		x = omok.getX();
		y = omok.getY();
		
		this.omok = omok;
		
	}
	
	
	 
}

package oop.omokgame;

public class OmokProgram {

	public static void main(String[] args) {
		Board board = new Board();
		OmokInputForm form = new OmokInputForm();
		Omok omok = new Omok();
		
		board.create();
		board.print();
		
//		form.print();
//		omok.input();
//		board.put(omok);
//		board.print();
		
		
	}

}

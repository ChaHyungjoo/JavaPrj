package homework;

import java.util.Scanner;

public abstract class OmokConsole {
	
	private Omok omok = newOmok();
	public abstract Omok newOmok();
	
	public abstract void printBoard();
	public abstract void input();
	public abstract void print();
	
	
}

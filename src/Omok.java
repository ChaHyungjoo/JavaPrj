
public class Omok {

	public static void main(String[] args) {
		
		for(int i=0; i<15; i++) {
			
			for(int j=0; j<20; j++)
				if(i>=j&&i+j<15) 
					System.out.print("¡Ü");			
				else 
					System.out.print("¦¶");
			
			System.out.println();
		}
		
		
		
	}

}

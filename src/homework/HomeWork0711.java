package homework;

public class HomeWork0711 {

	public static void main(String[] args) {
		
		int size = 'Z'-'A'+1;
		
		for(int i=0; i<size; i++)
			System.out.printf("%c ", 'Z'-i);
		
		System.out.println("\n"+"===================================================");
		
		for(int i=0; i<50; i++){
			System.out.printf("%c ", 'A'+(i%26));
		}

	}

}

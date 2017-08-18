public class ChaHyungjoo3 {

	public static void main(String[] args) {
		int n = 0;
		
		for(int j=0; j<2; j++)
			for(int i=0; i<26; i++) {
				System.out.print((char)(65+i)+" ");
				n++;
				if(n==50) break;
			}
		
	}
}

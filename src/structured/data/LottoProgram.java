package structured.data;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class LottoProgram {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Lotto lotto = new Lotto();
		
		gen(lotto);
		print(lotto);
		sort(lotto);
		print(lotto);
		
	}

	private static void sort(Lotto lotto) {
		int n = lotto.nums.length;
		
		for (int i = 0; i < (n - 1); i++)
			for (int j = 0; j < (n - 1) - i; j++) {
				int temp;
				if (lotto.nums[j] > lotto.nums[j + 1]) {
					temp = lotto.nums[j];
					lotto.nums[j] = lotto.nums[j + 1];
					lotto.nums[j + 1] = temp;
				}
			}
	}
	
	private static void print(Lotto lotto) {
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lotto.nums[i]);
		}
		System.out.println("");
	}
	
	private static void gen(Lotto lotto) {
		Random rand = new Random();
		
  		lotto.nums[0] = rand.nextInt(45)+1;
  		for(int i=1; i<6; i++) {
			lotto.nums[i] = rand.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				if(lotto.nums[i]==lotto.nums[j]) {
					i--;
					break;
				}
			}
		}

	}

}

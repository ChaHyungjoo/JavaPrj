import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("res/lotto.txt");
		PrintStream ps = new PrintStream(fos);
		
		int[] nums = new int[6];
		
		Random rand = new Random();
		//rand.nextInt();
		
/*		for(int i=0; i<6; i++)
			nums[i] = rand.nextInt(45)+1;*/
			
/*		//초기 상태의 로또
		for(int i=0; i<6; i++)
			System.out.printf("%d ", nums[i]);
		
		System.out.println("");*/
		
		
  		nums[0] = rand.nextInt(45)+1;
  		for(int i=1; i<6; i++) {
			nums[i] = rand.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		
/*		int k=1;
		nums[0] = rand.nextInt(45)+1;
		while(k<6) {
			int c=0;
			int num = rand.nextInt(45)+1;
			
			for(; c<k; c++) {
				if(nums[c]==num) break;
				//중복값 확인 num;
			}
			if(c==k)
			{
				nums[k] = num;
				k++;
				//배열에 변수를 저장하고, k++
			}
		}*/
		
		
		
		//버블정렬
		for(int i=0; i<(nums.length-1); i++)
			for(int j=0; j<(nums.length-1)-i; j++) {
				int temp;
				if(nums[j]>nums[j+1]) {
					 temp = nums[j];
					 nums[j] = nums[j+1];
					 nums[j+1] = temp;
				}
			}
		
		//최종 상태의 로또
		for(int i=0; i<6; i++) {
			System.out.printf("%d ", nums[i]);
			ps.printf("%d ", nums[i]);
		}
		
		
	}

}

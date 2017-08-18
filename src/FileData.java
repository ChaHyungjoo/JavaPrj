import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileData {

	public static void main(String[] args) throws IOException {
		//int[] nums = new int[] {23, 34,65, 23,2,34,4};
		
//		FileOutputStream fos = new FileOutputStream("res/data.txt");
//		PrintStream ps = new PrintStream(fos);
		
		FileInputStream fis = new FileInputStream("res/lotto.txt");
		Scanner sc = new Scanner(fis);
		
/*		int num;
		
		for(int i=0; i<nums.length; i++) {
			num =  fis.read();
			System.out.println(num);
		}
		*/
		
/*		int num;
		while((num=fis.read())!=-1) {
			System.out.print((char)num);
		}*/
		
		
/*		int num;
		while(sc.hasNext()) {
			num = sc.nextInt();
			System.out.println(num);
		}
		
		sc.close();
		fis.close();*/
		
/*		for(int i=0; i<nums.length; i++) {
			//fos.write(nums[i]);
			ps.printf("%d ", nums[i]);
		}
		ps.close();
		fos.close();*/
		
		
		//System.out.println("프로그램 종료");
		
		
		
	}
	
}

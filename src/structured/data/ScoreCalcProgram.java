package structured.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreCalcProgram {

	public static void main(String[] args) throws IOException {
		Score score = new Score();
		
		read(score);
		calc(score);
		print(score);
		
	}

	private static void print(Score sc) {
		System.out.printf("ÃÑÁ¡: %.3f\n", sc.sum);
		System.out.printf("Æò±Õ: %.3f\n", sc.avg);
		
	}

	private static void calc(Score sc) {
		int n = sc.len;
		for(int i=0; i<n; i++)
			sc.sum += sc.score[i];
		
		sc.avg = (sc.sum/n);
		
	}

	private static void read(Score sc) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\workspace\\data.txt");
		Scanner scan = new Scanner(fis);
		int i=0;
		double d;
		
		while(scan.hasNext()) {
			d = scan.nextDouble();
			sc.score[i] = d;
			i++;
		}
		
		scan.close();
		fis.close();
		
	}

}

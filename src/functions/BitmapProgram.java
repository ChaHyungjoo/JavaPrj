package functions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitmapProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/TestImage.bmp");
		FileOutputStream fos = new FileOutputStream("res/TestImageCopy.bmp");
		
		byte[] buf = new byte[1024];
		int len;
		
		while((len=fis.read(buf))!=-1) {
			//System.out.println(len);
			fos.write(buf, 0, len);
		}
		
		fos.close();
		fis.close();
		
/*		byte[] fileHeader = new byte[14];
		byte[] bmpHeader = new byte[12];
		
		fis.read(fileHeader);
		fis.read(bmpHeader);
		
		//0b00000000000000000000000011111111
		int width = ((int)bmpHeader[4])&0x000000ff|
						((int)bmpHeader[5]<<8)|
						((int)bmpHeader[6]<<16)|
						((int)bmpHeader[7]<<24);
		
		System.out.printf("width: %d\n", width);
								
		fis.close();*/
		

	}

}

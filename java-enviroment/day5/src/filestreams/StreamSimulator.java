package filestreams;

/* 
 * most streams come from the java.io package
 * 
 * Streams are entities which take input from a source
 * locations and can produce some new output to a target locations
 * (usually after performing some intermediary actions/operations 
 * on the data). Note that when performing operations on a
 * stream we do not change the original source material.
 */
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamSimulator {
	public static FileOutputStream fos = null;
	public static FileInputStream fis = null;
	
	public static void main(String[] args) {
		System.out.println("::: START :::");
		try {
			//fosExample();
			fisExample();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("::: END :::");
	}
	
	public static void fosExample() throws IOException{
		fos = new FileOutputStream("files/myFile.txt");
		for (int i = 0; i < 5; i++) {
			
		for (char letter = 'A'; letter <= 'Z'; letter++) {
			fos.write(letter);
		}
		fos.write('\n');
		}
		if(fos != null)
		fos.close();
	}
	
	public static void fisExample() throws IOException {
		fis = new FileInputStream("files/myFile.txt");
		byte input;
		while ((input = (byte)fis.read()) != -1) {
			System.out.print((char)input);
		}
		
		if (fis != null)
			fis.close();
	}
}

package iostreams;
import java.io.*;

public class ByterSteamExpample {
	public static void main(String[] args) {
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		try {
		inStream = new FileInputStream("C:\\Mohit\\koi bhi ni banvave.png");
		outStream = new FileOutputStream("C:\\Mohit\\test1.png");
		
		int x;
		while( (x = inStream.read()) != -1) {
			outStream.write((byte)x);
		}
		inStream.close();
		outStream.close();
		}
		catch( Exception e) {
			
		}

	}
}

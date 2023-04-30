package writeOutputStream;
import java.io.*;

public class Write {
	public static void main(String[] args) throws IOException{
		FileOutputStream fso = new FileOutputStream("D:/JavaProgam/myFile.txt",true);
		String s = "I am going to add something.";
		for(char c : s.toCharArray())
			fso.write(c);
		fso.close();
	}
}

package fileAttributeMethod;
import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/JavaProgram/myFile.txt");
		System.out.println("File exists: " + file.exists());
		file.createNewFile();
		System.out.println("File exists: " + file.exists());
		System.out.println("File name: " + file.getName());
		System.out.println("File length: " + file.length());
		file.delete();
	}
}

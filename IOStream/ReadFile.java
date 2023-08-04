package IOStream;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\Users\\Public\\Documents\\mk.txt");
		int ch=file.read();
		while (ch!=-1) {
			System.out.println((char)ch);
			ch=file.read();
		}
		file.close();
	}
}

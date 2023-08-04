package IOStream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileByScannerClass {

	public static void main(String[] args) throws IOException {
		
		FileReader file=new FileReader("C:\\Users\\Public\\Documents\\mk.txt");
		
		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNext()) {
				System.out.println(sc.hasNext());
			}
		}
		
		file.close();
	}
}
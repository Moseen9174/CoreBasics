package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
	FileWriter w1=new FileWriter("C:\\Users\\Public\\Documents\\mk.txt");
		
		w1.write("My");
		
		w1.write("Name");
		
		w1.write("Is");
		
		w1.write("Rahul");
		
		System.out.println("C:\\Users\\Public\\Documents\\mk.txt");
		
		w1.close();
	}
}

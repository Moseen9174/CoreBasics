package IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileLineByLine {

public static void main(String[] args) throws IOException {
	
	FileWriter w1=new FileWriter("C:\\Users\\Public\\Documents\\mk.txt");
	
	PrintWriter p1=new PrintWriter(w1);
	
	for (int i = 0; i < 5; i++) {
		p1.println(i + " : line");
	}
	p1.close();
	w1.close();
}
}

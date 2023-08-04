package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class TestSerial  {
	
   public static void main(String[] args) throws Exception {
	
	 FileOutputStream file=new FileOutputStream("E:\\Applications//mkcity");  
	 ObjectOutputStream out=new ObjectOutputStream(file);
	 
	 Markshet m=new Markshet();
	 
	 m.roll=101;
	 m.name="moseen";
	 m.marks=223;
	 
	out.writeObject(m);
	 out.close();
	 file.close();
}
}

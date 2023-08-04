package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class TestDeSerial {
  public static void main(String[] args) throws Exception {
	FileInputStream file=new FileInputStream("E:\\Applications//mkcity");
    ObjectInputStream in=new ObjectInputStream(file);
    
    Markshet m= (Markshet) in.readObject();
	 
	 System.out.println(m.marks);
	 System.out.println(m.name);
	 System.out.println(m.roll);
	  
	 in.read();
	 in.close();
	 file.close();
	
}
}

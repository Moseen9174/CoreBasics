package CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCurser {
public static void main(String[] args) {
	Vector<String> c1=new Vector<String>();
	
	c1.add("bura mt dekho");
	c1.add("bura mt bolo");
	c1.add("bura mt suno");
	
	Enumeration<String> e1= c1.elements();
	while(e1.hasMoreElements()) {
		Object o=e1.nextElement();
		System.out.println(o);
		
	}
}
}

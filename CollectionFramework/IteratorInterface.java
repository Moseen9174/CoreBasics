package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) {
		Collection<String> c1=new ArrayList<String>();
		
		c1.add("bura mt dekho");
		c1.add("bura mt bolo");
		c1.add("bura mt suno");
		
		Iterator<String> it = c1.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}
		
		// Iterator one more method remove()
		
	//	Iterator<String> it = c1.iterator();
	//	if(it.hasNext()) {
	//		it.remove();
	
	}
}

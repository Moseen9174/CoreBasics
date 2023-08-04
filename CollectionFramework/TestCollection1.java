package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection1 {

	public static void main(String[] args) {
		Collection<String> c1=new ArrayList<String>();
		
		c1.add("bura mt dekho");
		c1.add("bura mt bolo");
		c1.add("bura mt suno");
		
		System.out.println("size of collection" + c1.size());
		
		for (Object ele : c1) {
			System.out.println(ele);
		}
		
		// convert collection to array
		
		Object[] OArray = c1.toArray();
		
		for (Object object : OArray) {
			System.out.println(object);
			
		}
	}
}
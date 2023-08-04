package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIPrintUseIteratore {
	 public static void main(String[] args) {
			ArrayList<String> a1=new ArrayList<>();
			a1.add("zero");
			a1.add("two");                                   
			a1.add("three");                                 
			a1.add("five");                                  
			a1.add(3,"four");                                //3.Using Iterator historical class
			
			Iterator<String> iterator=a1.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
}

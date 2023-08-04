package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetieve {
	  public static void main(String[] args) {
	        // ArrayList Example
	        List<Integer> arrayList = new ArrayList<>();
	        arrayList.add(1);
	        arrayList.add(2);
	        arrayList.add(3);
	        
	        int i=arrayList.get(0);
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println(i);
}
}

package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArraylistResizeORgrowable {                         
	  public static void main(String[] args) {
	        // ArrayList Example
	        List<Integer> arrayList = new ArrayList<>();
	        arrayList.add(1);
	        arrayList.add(2);
	        arrayList.add(3);
	        
	        System.out.println(arrayList.size());
	        
	        arrayList.add(4);
	        arrayList.add(5);
	        arrayList.add(6);
	        
	        System.out.println("Update size" +" " + arrayList.size());
	     
}
}


package CollectionFramework;

import java.util.ArrayList;

public class ToStringMethod {
	 public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Hello");
	        arrayList.add("World");
	        arrayList.add("!");

	        // Convert ArrayList to String
	        String str = arrayList.toString();

	        // Print the converted string
	        System.out.println(str);
	    }
}

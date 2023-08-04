package CollectionFramework;

import java.util.LinkedList;

public class LinkedListObj {
	  public static void main(String[] args) {
	       
	        LinkedList<String> names = new LinkedList<>();

	        // Insertion: Add elements to the LinkedList
	        names.add("Alice"); // Insert at the end
	        names.addFirst("Bob"); // Insert at the beginning
	        names.addLast("Charlie"); // Insert at the end
	        names.add(1, "David"); // Insert at a specific index

	     
	        System.out.println("LinkedList after insertion: " + names);

	        // Deletion: Remove elements from the LinkedList
	        names.removeFirst(); // Remove the first element
	        names.removeLast(); // Remove the last element
	        names.remove("David"); // Remove a specific element

	     
	        System.out.println("LinkedList after deletion: " + names);
	    }
}

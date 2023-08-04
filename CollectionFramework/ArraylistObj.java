package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;                              //Array list is non primitive DS we can the size of Array
public class ArraylistObj {                             //Using Array list.  
 public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<>();
	a1.add("zero");
	a1.add("two");                                   //There are three ways to print Object
	a1.add("three");                                 //1.using forEach loop
	a1.add("five");                                  //2.Using for loop
	a1.add(3,"four");                                //3.Using Iterator historical class
/*	for(Object elements : a1) {
		String str1 = (String) elements;
		System.out.println(str1);
	} */
/*	for (int i = 0; i < a1.size(); i++) {
		System.out.println(a1.get(i));
	}*/
	
	Iterator<String> iterator=a1.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	
	
}

 }}

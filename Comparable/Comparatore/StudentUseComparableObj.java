package Comparable.Comparatore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentUseComparableObj {

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		
		List<StudentUseComparable> l1=new ArrayList<StudentUseComparable>();
		
		l1.add(new StudentUseComparable("Moseen", 2, "DAVV"));
		l1.add(new StudentUseComparable("Rahul", 4, "RKDF"));
		l1.add(new StudentUseComparable("Ajay", 2, "RGVP"));
		
		Collections.sort((List<T>) l1);
		
		System.out.println(l1);
		
	}
}

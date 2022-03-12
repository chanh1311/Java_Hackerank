package javacoban;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Java_Substring_Comparisons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		int k=sc.nextInt();
		SortedSet<String> sets = new TreeSet<String>();// SortedSet la mot interface, TreeSet la 1 class cu the //
		for(int i=0;i<=str.length()-k;i++){
		        sets.add(str.substring(i,i+k));
		}
		System.out.println(sets.first());
		System.out.println(sets.last());
		sc.close();
		
		
		
		
		// Java program to demonstrate the
		// Sorted Set
		 
//		import java.util.*;
//		 
//		class Main {
//		 
//		    public static void main(String[] args)
//		    {
//		 
//		        // create an instance of sortedset
//		        SortedSet<String> ts = new TreeSet<String>();
//		 
//		        // Adding elements into the TreeSet
//		        // using add()
//		        ts.add("Sravan");
//		        ts.add("Ojaswi");
//		        ts.add("Bobby");
//		        ts.add("Rohith");
//		        ts.add("Gnanesh");
//		        ts.add("Devi2");
//		 
//		        // Adding the duplicate
//		        // element
//		        ts.add("Sravan");
//		 
//		        // Displaying the TreeSet
//		        System.out.println(ts);
//		 
//		        // Removing items from TreeSet
//		        // using remove()
//		        ts.remove("Ojaswi");
//		 
//		        // Iterating over Tree set items
//		        System.out.println("Iterating over set:");
//		        Iterator<String> i = ts.iterator();
//		        while (i.hasNext())
//		            System.out.println(i.next());
//		    }
//		}

	}

}

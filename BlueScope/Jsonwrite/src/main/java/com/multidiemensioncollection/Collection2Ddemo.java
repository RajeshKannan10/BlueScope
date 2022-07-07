package com.multidiemensioncollection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection2Ddemo {
	
	 static Set create2DLinkedHashSet()
	    {
	        // Creating an empty 2D LinkedHashSet
	        LinkedHashSet<LinkedHashSet<String> > x
	            = new LinkedHashSet<LinkedHashSet<String> >();
	 
	        // Creating R0
	        x.add(new LinkedHashSet<String>(
	            Arrays.asList("Apple", "Orange")));
	 
	        // Creating R1, here "Coffee" will be considered as
	        // only one object to maintain uniqueness
	        x.add(new LinkedHashSet<String>(Arrays.asList(
	            "Tea", "Coffee", "Milk", "Coffee", "Water")));
	 
	        // Creating R2
	        x.add(new LinkedHashSet<String>(
	            Arrays.asList("Tomato", "Potato", "Onion")));
	 
	        // Creating R3 but it will not be added as it
	        // contains the same items as R2
	 
	        // Note: LinkedHashSet inserts only unique items
	 
	        x.add(new LinkedHashSet<String>(
	            Arrays.asList("Tomato", "Potato", "Onion")));
	 
	        // Returning multidimensional LinkedHashSet
	        return x;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Display message for better readability
        System.out.println("2D LinkedHashSet :");
 
        // Printing 2D LinkedHashSet by
        // calling method 1
        System.out.println(create2DLinkedHashSet());
    }

	

}

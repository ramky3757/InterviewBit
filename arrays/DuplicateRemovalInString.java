package com.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemovalInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geeksforgeeks";
		String[] strArray = str.split("");
		
		
		
		System.out.println(Arrays.toString(strArray));
		
		Set<String> strList = new LinkedHashSet<String>();
		
			for(String s: strArray) {	
				
				if(!strList.contains(s))
					strList.add(s);							
				}
			
			StringBuilder sb = new StringBuilder();
			Iterator<String> it = strList.iterator();
			
			while(it.hasNext()) {
				sb.append(it.next());
			}
			
			System.out.println(sb.toString());
		
		
		
	}

}

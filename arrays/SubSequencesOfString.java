package com.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubSequencesOfString {
	static List<String> al = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "abcd";
		
     findsubsequences(s, ""); // Calling a function
     System.out.println(al.toString());
        

	}

	private static void findsubsequences(String s, String string) {
		// TODO Auto-generated method stub
		
		if(s.length()==0) {
			al.add(string);
			return;
		}
		
		findsubsequences(s.substring(1), string+s.charAt(0));
		
		findsubsequences(s.substring(1), string);
		
	}

}

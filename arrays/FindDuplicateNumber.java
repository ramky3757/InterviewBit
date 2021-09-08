package com.java.arrays;


import java.util.HashSet;
import java.util.Set;


public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = new int[] {1,2,3,4,4,5,6,7};
			int duplicate = 0;
			
			if(arr.length <1) {
				System.out.println("Array empty");
			}
			
			Set numList = new HashSet();
			
			for(int i: arr) {				
				if(numList.contains(i)) {
					duplicate = i;					
				} else {
					numList.add(i);
				}				
			}
			
			if(duplicate <1) {
				System.out.println("No duplicate found");
			}
			
			System.out.println(duplicate);
			
			
			
	}

}

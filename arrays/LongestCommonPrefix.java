package com.java.arrays;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = new String[] {"Sai", "Sahi", "Sat", "Saj"};
		int[] nums = new int[] {1,1,2};
		
		removeDuplicates(nums);
		longCommPrefix(strArr);
		
		String firstElement = strArr[0];
		
		int j, counter = 0;
		for(int i=0; i<firstElement.length(); i++) {
			
			j = i;
			
			
			while(j < strArr.length-1) {
				
					if(!(strArr[0].charAt(i) == (strArr[j+1].charAt(i)))) {
						counter = i-1;
						break;
					} else {
						 counter++; j++;
					}								
			}
			
			
		}
		
		//System.out.println(counter);
		
		if(counter >0) {
			System.out.println(strArr[0].substring(0, counter));
		}
	}
	
	
	public static void longCommPrefix(String[] strArr) {
		
		int size = strArr.length;
		StringBuffer sb = new StringBuffer();
		Arrays.sort(strArr);
		
		
		for(int i=0; i<strArr[0].length();i++) {
			
			if(strArr[i].charAt(i) == strArr[size-1].charAt(i)) {
				sb.append(strArr[0].charAt(i));
			} else {
				break;
			}
		}
		
		System.out.println(sb.toString());
		
		
	}
	
	
	
	 public static void removeDuplicates(int[] nums) {	        
	       
		 
		 int i =0;
		 for(int j=1; j<nums.length; j++) {
			 
			 if(nums[j]!= nums[i]) {
				 	i++;
				 	nums[i] = nums[j];				 
			 }
		 }
		 
		 System.out.println(i+1);
		 
		 
	        
	    }

}

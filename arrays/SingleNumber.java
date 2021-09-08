package com.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[]{4,1,2,1,2};
		System.out.println(singleNumber(nums));

	}

	//find the non-duplicate number
	public static int singleNumber(int[] nums) {
        
	       if(nums.length<2){
	           return nums[0];
	       }
	        //1,1,2,2,4
	       if(nums.length<2){
	           return nums[0];
	       }
	       List<Integer> no_duplicate_list = new ArrayList<>();

	    for (int i : nums) {
	      if (!no_duplicate_list.contains(i)) {
	        no_duplicate_list.add(i);
	      } else {
	        no_duplicate_list.remove(new Integer(i));
	      }
	    }
	    return no_duplicate_list.get(0);
	        
	    }
	
}

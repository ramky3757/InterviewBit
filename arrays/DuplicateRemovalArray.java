package com.java.arrays;

import java.util.Arrays;

public class DuplicateRemovalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,1,2};
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));

	}
	
public static int removeDuplicates(int[] nums) {
        
	int k=0;
    for(int i=1; i<nums.length; i++){
        
        if(nums[i]!=nums[k]){            
            k++;
            nums[k] = nums[i];
           
        }
    }
           return k+1;
        
    }

}

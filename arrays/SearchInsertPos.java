package com.java.arrays;

public class SearchInsertPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {1,3,5,6};
		int target = 7;
		
		System.out.println(searchInsert(nums, target));
		
	}
	
	 public static int searchInsert(int[] nums, int target) {
		 
		 int length = nums.length;
		 
		 int left = 0;
		 int right = length-1;
		 
		 while (left<=right) {
			 
			 int mid = left+(right-left)/2;
			 
			 if(target >nums[mid]) {
				 left = mid+1;
			 } else if(target < nums[mid]) {
				 right = mid-1;
			 } else {
				 return mid;
			 }
			 
		 }
		 return left;
	 }

}

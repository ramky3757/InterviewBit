package com.java.arrays;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {

	
	
	public static boolean twosum(int[] arr, int target) {
		
		int i =0;
		int j =1;
		int sum = 0;
		while (i<arr.length) {
			
			if(j>=arr.length) {
				i++;
				j= i+1;
			}
			
			sum = arr[i]+arr[j];
			
			if(sum == target){				
				return true;				
			}
				j++;
			
		}
		
		return false;
		
		
	}
	
	public static int[] twoSum(int[] nums, int target) throws FileNotFoundException, IOException {
		
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    //1,3,7,9,2
	    //4,2,
	    for (int i = 0; i < nums.length; i++) {
	    	
	        int complement = target - nums[i];
	        
	        	if (map.containsKey(complement)) {
	        		return new int[] { map.get(complement), i };
	        	}
	        		
	        	map.put(nums[i], i);
	        	//
	    }
	    	    
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = new int[] {1,3,7,9,2};
	
		//System.out.println(twosum(arr,  5));
		System.out.println(twoSum1(arr,5));
		
		 
		
			
	}
	
	public static boolean twoSum1(int[] arr, int target){

		boolean isFound = false;

		Arrays.sort(arr);
		//1,2,3,7,9

		int left =0, right = arr.length-1;
		while(left<right){
			
			int temp = arr[left]+arr[right];
			if(temp == target){
				isFound = true;
				break;
			} else if( temp > target){
				right --;
			} else{
				left++;
			}
		}
	return isFound;

	}

}

class CPU{
	
	class Processor{
		
		double getCache(){
            return 4.3;
        }
	}
	
}

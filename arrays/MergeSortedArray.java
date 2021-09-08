package com.java.arrays;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,2,3,0,0,0}; 
				int m = 3; 
				int[] nums2 = new int[] {2,5,6}; 
				int n = 3;
		
				merge(nums1, m, nums2, n);
				System.out.println(Arrays.toString(nums1));

	}
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		 if(n == 0){
	            System.out.println(Arrays.toString(nums1));
	        }
	        
	        int k =0;
	        
	        for(int i=0; i<m+n; i++){
	            
	          
	            //[2,5,7,0,0,0]            
	            //[1,3,4] == [1,2,3,5,4,7]
	            
	            if(nums1[i]==0){              
	                nums1[i] = nums2[k];
	                k++;
	            } else{
	            
	            if(nums1[i]>nums2[k]){  
	                int temp = nums1[i];
	                nums1[i] =  nums2[k];
	                nums1[i+1] = temp; 
	                k++;
	            }
	        }
	        
	        
	    }
		 
	 }

}

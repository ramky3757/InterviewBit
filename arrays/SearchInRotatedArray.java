package com.java.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= new int []{4, 5, 6, 7, 0, 1, 2};
		//System.out.println(searchNumber(4, A, 1) );
		
		
		
		//Arrays.sort(A);
		System.out.println(searchNumber(A, 0) );
	}
	
	static int searchNumber(int size, int[] A, int find){
	    
	    int index =0;
	    if(A.length<1){
	        return Integer.MIN_VALUE;
	    }	    
	   
	    boolean found = false;
	   
	    for(int i=0; i<A.length; i++) {
	    	if(A[i] == find) {
	    		found = true;
	    		index = i;
	    	}
	    }
	    
	    if(!found){
	        return -1;
	    }
	    
	    return index;
	}

	public static int searchNumber(int[] arr, int target){
	
		 int left = 0, right = arr.length-1;
	        while(left<=right){
	            int mid = left+(right-left)/2;
	            //4,5,6,7,0,1,2
	            if(arr[mid]==target) return mid;
	            
	            if(arr[left]<=arr[mid]){
	                if(target>=arr[left] && target<arr[mid]) right = mid-1;
	                else left = mid+1;
	            }else{
	                if(target>arr[mid] && target<=arr[right]) left = mid+1;
	                else right = mid-1;
	            }
	        }
	        
	        return -1;
	}

}

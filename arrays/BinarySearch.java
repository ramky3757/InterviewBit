package com.java.arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {25,32,1,5,87,54,95,4,57};
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		System.out.println(binaySearch(arr, 0, arr.length-1, 25));
	}

	private static int binaySearch(int[] A, int start, int end, int find) {
		// TODO Auto-generated method stub
		
		//1,5,4,25,32,54,57,87,95
		int left =0; int right= A.length-1;
		
		//1,2,3,5
		while(left<=right) {
			
			int mid = left+(right-left)/2;
			
			if( A[mid] == find) {
				return mid;
			} else if(A[mid] < find ) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		
	return -1;
		
		
		
	}

}

package com.java.second.set;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		  mergeSort(intArray, intArray.length);
		  System.out.println(Arrays.toString(intArray));

	}

	private static void mergeSort(int[] intArray, int length) {
		// TODO Auto-generated method stub
		
		if(length<2) {			
			return;
		}
		
		int mid = length /2;
		
		int[] left = new int[mid];
		int[] right = new int[length - mid];
		
		int k =0;
				
		for(int i=0; i<length; i++) {
			
			if(i<mid) {				
				left[i] = intArray[i];
			} else {
				right[k] = intArray[i];
				k = k+1;
			}
		}		
		
		mergeSort(left, mid);
		mergeSort(right, length-mid);
		merge(intArray, left, right, mid, length-mid);	
		
		
	}

	private static void merge(int[] intArray, int[] left, int[] right, int mid, int right_end) {
		// TODO Auto-generated method stub
		
		int l =0; int r =0; int pointer =0;
		
		while(l<mid && r<right_end) {
			
			if(left[l] <right[r]) {
				intArray[pointer++] = left[l++]; 
			} else {
				intArray[pointer++] = right[r++];
			}
		}
		
		while(l<mid) {
			intArray[pointer++] = left[l++]; 
		}
		
		while(r<right_end) {
			intArray[pointer++] = right[r++];
		}
	}

}

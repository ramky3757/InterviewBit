package com.java.arrays;

import java.util.Arrays;

public class LowestDiffPairTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {1,3,15,11,2};
		int[] B = new int[] {23,127,235,19,8};
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		//1,2,3,11,15
		//8,19,23,127,235
		
		int a_length = A.length;
		int b_length = B.length;
		
		System.out.println(Arrays.toString(findLowestdiff(A, B, a_length, b_length)));
		System.out.println(findLowestdiff(A, B, a_length, b_length, "hi"));
		
	}

	private static int findLowestdiff(int[] a, int[] b, int a_length, int b_length, String string) {
		// TODO Auto-generated method stub
		
		//A - 1,2,3,11,15
		//B - 8,19,23,127,235
		int i =0;
		int j =0;
		int min = Integer.MAX_VALUE;
		while(i <a_length && j < b_length) {
			
			int diff = Math.abs(a[i] - b[j]);
			
			if(min>diff) {
				min = diff;
			}
			
			if(a[i] <b[j]) {
				i++;
			} else {
				j++;
			}
			
		}
		
		
		return min;
	}

	private static int[] findLowestdiff(int[] a, int[] b, int a_length, int b_length) {
		// TODO Auto-generated method stub		
		
		//A - 1,2,3,11,15
		//B - 8,19,23,127,235
		
		int min = Integer.MAX_VALUE;
		int k = 0; int m=0;
		for(int i=0; i<a_length; i++) {
			
			
			for(int j =0; j<b_length; j++) {
				
				int temp = Math.abs(a[i] - b[j]);	
				
					if(min> temp ) {
						min = temp;						
						k=a[i]; m =b[j]; 
				}
				
					
			}
			
		}
		return new int[] {k,m};
		
		
	}

}

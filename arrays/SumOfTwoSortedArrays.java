package com.java.arrays;

public class SumOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] A = new int[] {10,20,50,90};
			int[] B = new int[] {3,4,8,11,13,20,50};
			int[] C = new int[A.length + B.length];
			
			//3,
			
			//i=0,1,2
			//j=0,1,2,3,4,5
			//3,4,8,10,11,13,20
			int i = 0, j = 0;
			int start = 0;
			
			while(start < C.length) {
				
				if(j >= B.length -1) {
					if(i>=A.length) {
						start = C.length +100;
					}else {
						C[start] = A[i];
						i++;
					}
				}
				
				else if(A[i] == B[j]) {
					C[start] = A[i];
					i++; j++;
				}
				
				/*if(i > A.length-1) {
					C[start] = B[j];
					j++;
				}*/
				
				
				else if(A[i] > B [j]) {
										
					C[start] = B[j];
					j++;
				} else {
					C[start] = A[i];
					i++;
				}
				
				start++;
			}
			
			
			
			for(int in: C) {
				System.out.print(in+" ,");	
			}
			

	}

}

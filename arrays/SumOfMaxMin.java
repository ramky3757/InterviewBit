package com.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumOfMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int [] {1,3,-2,1,4};
		
		int max = A[0];
        int min = A[0];
    
    for(int i=1; i<A.length; i++){
        
	    if( A[i] > max){
	        max = A[i];
	        
	    }  if( A[i] < min){
	        min = A[i];
	    }
	}
    
    int sum = max+min;
    System.out.println(sum);
		
		

	}

}



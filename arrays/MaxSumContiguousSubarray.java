package com.java.arrays;

public class MaxSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int max = 0;
        int final_max=0;
        int negative_chk = Integer.MIN_VALUE;     
       
        
        if(A.length <=1){
            //return A[0];
        }
        
        for(int i=0; i<A.length; i++){
            
        	//System.out.println("max out ->"+max);
        	
            max+= A[i];
            if(A[i] > max){
            	System.out.println("max ->"+max);
                max = A[i];
            }
            
            if(final_max < max){
                final_max = max;
            }
            
            if(A[i] < 0 && A[i] > negative_chk){
                negative_chk = A[i];
            }
            
        }
        
        if(final_max<=0 && A.length > 1){
            
            final_max = negative_chk;
            
        }
        
        //return final_max;
        
        System.out.println(final_max); 


	}

}

package com.java.arrays;

import java.util.Arrays;

public class AddOnetoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[] {2,1,9};
		System.out.println(Arrays.toString(plus_One_digit(A)));
		chk();
		
		
		
		int i = 0;
        //remove zeroes at the front
        while (i < A.length - 1 && A[i] == 0) {
            A[i] = 1;
        }

        int carry = 1;
        int sum;
        for (i = A.length - 1; i >= 0; i--) {
            sum = A[i] + carry;
            A[i] = sum % 10;
            carry = sum / 10;
            // no need of further processing if carry is zero
            if (carry == 0) {
                break;
            }
        }
        // if carry is still left
        if (carry != 0) {
            A[0] = carry;
        }
    
	
	}
	
	public static int[] plus_One_digit(int[] digits_nums) {
		
		  for (int i = digits_nums.length - 1; i > -1; --i) {
			  
		   if (digits_nums[i] != 9) {
			   
		    digits_nums[i] += 1;
		    
		    	for (int j = i + 1; j < digits_nums.length; ++j) {
		    		digits_nums[j] = 0;
		    	}		    
		    	return digits_nums; 
		   }
		   
		  }
		  int[] result = new int[digits_nums.length + 1];
		  result[0] = 1;
		  return result;
		 }
	
	public static void chk() {
		int number = 123;
		number+=1;
		System.out.println(number);
	}

	}



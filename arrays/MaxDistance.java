package com.java.arrays;

import java.util.Arrays;

public class MaxDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {9};
		int[] arr = {3,5,4,2};
		Solution s = new Solution();
		System.out.println(s.maximumGap(arr));
		
		System.out.println(maximumGap(arr));
		 System.out.println("Array of digits: " + Arrays.toString(plus_One_digit(nums)));

	}
	
public static int maximumGap(final int[] nums) {
        
	Arrays.sort(nums);
    
    int i=0;
    int j=1;
    int maxGap = 0;
    
    
    if(nums.length < 2){
            return 0;
    } else {
    
            while(j<nums.length){
        
                    if(nums[i] == nums[j]){
                        i++; j++;    
                    } else{
                
                    int gap  = Math.abs(nums[j] - nums[i]);
                        
                        if(gap> maxGap){
                                maxGap = gap;
                            }
                    i++; j++;
                }
            }
        
        }
    
    return maxGap;
    }



public static int[] plus_One_digit(int[] digits_nums) {
	
	int y=123;
	try {
	int x = y	/0;
	} catch(ArithmeticException  | ArrayIndexOutOfBoundsException ai) {
		
	}
	
	  for (int i = digits_nums.length - 1; i > -1; --i) {
		  
	   if (digits_nums[i] != 9) {
		   
	    digits_nums[i] += 1;
	    
	    	for (int j = i + 1; j < digits_nums.length; ++j) {
	    		digits_nums[j] = 0;
	    	}
	    
	    
	   }
	   return digits_nums;
	   
	  }
	  int[] result = new int[digits_nums.length + 1];
	  result[0] = 1;
	  return result;
	 }

}


class Pair implements Comparable<Pair> {
    int val, idx;
    Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
    public int compareTo(Pair p) {
        return this.val - p.val;
    }
}

 class Solution {
    public int maximumGap(int[] A) {
        Pair P[] = new Pair[A.length];
        for(int i = 0; i < A.length; i++) {
            P[i] = new Pair(A[i], i);
        }
        Arrays.sort(P);
        int currMin = P[0].idx, res = 0;
        for(int i = 1; i < P.length; i++) {
            res = Math.max(res, P[i].idx - currMin);
            currMin = Math.min(currMin, P[i].idx);
        }
        return res;
    }
 }

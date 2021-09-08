package com.java.arrays;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr_nums = new int[] {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		// sample output : [11, 16, 12, 17, 13, 18, 14, 19, 15, 20]



		int[] new_arr = new int[arr_nums.length];
		int mid = arr_nums.length/2;
		
		int pointer=0;
		int index =0;		
		
		
		while(mid<new_arr.length) {
			
			new_arr[index++] = arr_nums[pointer++];
			
			new_arr[index++] = arr_nums[mid++];
			
			
		}

	
		System.out.println(Arrays.toString(new_arr));


	}

}

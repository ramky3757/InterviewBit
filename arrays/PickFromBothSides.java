package com.java.arrays;

public class PickFromBothSides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {5,-2,3,1,2};
		int B = 3;
		int sum = 0;

		for(int i=0; i<B; i++){
			sum = sum + arr[i];
		}

		int tempMax = sum;
		
		for(int j=arr.length-1; j> (j-B); j--){
			
		sum = sum+ arr[j]-arr[B-1];
		B--;

		if (sum >tempMax){
			tempMax = sum;
		}		

		}
		
		System.out.println("MaxSum is "+tempMax);
		
	}

}

package com.java.arrays;

public class SqrtOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number = 129;
			
			System.out.println(sqrt(number));;
			
	}

	private static double sqrt(int number) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		while(true) {			
				// for perfect squares -- 5*5 = 25
				if(i*i == number) {
					return i;
					
					// Not a perfect square -- 129
				} else if(i*i > number) {					
					return doubleSqrt(number, i-1, i);
				}
								
				i++;
		}
	}

	private static double doubleSqrt(double number, double min, double max) {
		// TODO Auto-generated method stub
		
		double mid = (min+max)/2;
		double squareOfMid = mid*mid;
		
		if(squareOfMid == number || Math.abs(number-squareOfMid)<0.01){			
			return mid;
		}		
		
		else if(squareOfMid > number) {			
			return doubleSqrt(number, min, mid);
		}
		
		else 
			return doubleSqrt(number, mid, max);
	}

	
	
	
}

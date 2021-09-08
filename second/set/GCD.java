package com.java.second.set;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray  = new int[] {16, 8, 24, 4};
		
		findGCD(numArray);

	}

	private static void findGCD(int[] numArray) {
		// TODO Auto-generated method stub
		
		int result = numArray[0];
		
		for(int i=1; i<numArray.length;i++) {
			result = gcd(numArray[i], result);
		}
		
		System.out.println("GCD is "+result);
		
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b==0) {
			return a;
		}
		
		return gcd(b, a%b);
	}
	
	
	
	
	

}

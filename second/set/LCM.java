package com.java.second.set;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray= {8, 4, 2, 16};		
		findLCM(numArray);
	}

	private static void findLCM(int[] numArray) {
		// TODO Auto-generated method stub
		
		int lcm = numArray[0];
		int gcd = numArray[0];
		
		for(int i=1; i<numArray.length; i++) {
			
			gcd = gcd(numArray[i], lcm);
			lcm = (lcm*numArray[i])/gcd;
		}
		
		System.out.println("LCM is "+lcm);
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b ==0) {
			return a;
		}
		
		return gcd(b, a%b);
	}

}

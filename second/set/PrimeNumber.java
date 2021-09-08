package com.java.second.set;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(""+isPrime(7));
		
		
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		
		if(n ==1 || n == 2) {
			isPrime = true;
		}
			
		
		for(int counter =2; counter< (n/2); counter++) {			
			if(n%counter==0) {
				isPrime = false;
			}		
		}		
		return isPrime;
	}

}

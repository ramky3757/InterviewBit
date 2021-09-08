package com.java.arrays;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 =72, n2 =120; 
		findLCM(n1, n2);
		
		System.out.println(findGCD(72,120));
		
	}

	private static void findLCM(int n1, int n2) {
		// TODO Auto-generated method stub
		int lcm = 1;
		
		while(true) {
			
			if(lcm%n1 ==0 && lcm%n2 ==0) {
				
				System.out.println(lcm);
				break;
			}
			
			lcm++;
			
		}
	}
	
	public static int findGCD(int n1, int n2) {
		
		if(n2==0) {
			return n1;
		}
		
		return findGCD(n2, n1%n2);
		
		
	}

}



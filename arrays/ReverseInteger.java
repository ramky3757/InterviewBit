package com.java.arrays;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = -121;		
		//System.out.println(reverInt(input));
		System.out.println(isPalindrome(input));

	}

	private static int reverInt(int input) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		if(input == 0) {
			return 0;
		}
		
		
		String reversedinput = new StringBuilder().append(Math.abs(input)).reverse().toString();
		
		return (input < 0) ? Integer.parseInt(reversedinput) * -1 : Integer.parseInt(reversedinput);
		
	}
	
public static boolean isPalindrome(int x) {
        
        String str = Integer.toString(x);
        
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(sb.reverse().toString());
        System.out.println(sb.toString());
        if(sb.toString().equalsIgnoreCase(sb.reverse().toString()) ){
            return true;
        }
        
        return false;
        
    }

}

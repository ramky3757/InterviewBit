package com.java.arrays;

public class ConvertNumToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 567;
		Integer k = String.valueOf(i).length();
		
		System.out.println(" dddd "+k);
		String[] digits = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
			
		
		String str = Integer.toString(i);
		
		String[] strArray = str.split("");
		int len = str.length();
		
		if(len > 4) {
			System.out.println("Length should not exceed 4");
		} else if(len == 4) {
			thousands(strArray, digits);
		} if(len == 3) {			
			hundreds(strArray, digits);
		}
		
	}
	
	private static void hundreds(String[] strArray, String[] digits) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		int counter =0;
		
		for(String s:strArray) {
			counter++;
			String temp = null;
			if(Integer.parseInt(s)!=0) {
				temp = digits[Integer.parseInt(s)-1];
				 sb = sb.append(temp);
			}
							
			 if(counter ==1) {
				 sb = sb.append(" Hundred ");
			 } else if(counter == 2 && Integer.parseInt(s)!=0) {
				 sb = sb.append("ty ");
			 } 
		}
		
		System.out.println(sb.toString());
		
	}

	static void thousands(String[] strArray, String[] digits) {
		
		StringBuilder sb = new StringBuilder();
		int counter =0;
		
		for(String s:strArray) {
			counter++;
			 String temp = digits[Integer.parseInt(s)-1];			 
			 sb = sb.append(temp);				
			 if(counter ==1) {
				 sb = sb.append(" Thousand ");
			 } else if(counter == 2) {
				 sb = sb.append(" Hundred ");
			 } else if(counter ==3) {
				 sb = sb.append("ty ");
			 }
		}
		
		System.out.println(sb.toString());
		
	}

}

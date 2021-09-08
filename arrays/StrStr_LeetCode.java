package com.java.arrays;

public class StrStr_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input: haystack = "hello", needle = "ll"
		//Output: 2
		
		String haystack = "ramakrishna";
		String needle = "kr";
		
		int pos =findstrStr(haystack, needle);
		System.out.println(pos);

	}

	private static int findstrStr(String haystack, String needle) {
		// TODO Auto-generated method stub		
			
		int m = haystack.length();
		int n = needle.length();
		
		if(n==0) {
			return 0;
		}
		
		if(n>m) {
			return -1;
		}
		
		for(int i=0; i<m-n+1; i++) {
			
			if(haystack.substring(i, i+n).equals(needle)) {
				return i;
			}
			
		}
		
		return -1;
		
	}

}

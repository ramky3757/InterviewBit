package com.java.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[] {3, 30, 34, 5, 9};
		
		String s = null;
		
		String stringarr[]=new String[A.length];
        for(int i=0;i<A.length;i++)
        {
            stringarr[i]=Integer.toString(A[i]);
           
        }
     
        Comparator<String> comp = (String str1, String str2) -> {
        	
        	String s1=str1+str2;
            String s2=str2+str1;
            return s2.compareTo(s1);
        };
        
        Arrays.sort(stringarr,comp);
        
        
        StringBuilder sb=new StringBuilder();
        for(String ele:stringarr)
        {
            sb.append(ele);
        }
        
        for(int i=0; i < sb.toString().length(); i++){
            
            if(sb.toString().charAt(i) != '0'){
            	s = sb.toString().substring(i);
                break;
            }
        }
        
       System.out.println(s);
     
       
       
	}

}

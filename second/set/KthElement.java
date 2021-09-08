package com.java.second.set;

public class KthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {2, 3, 6, 7, 9};
		int arr2[] = {1, 4, 8, 10};
		int k = 5;
		//System.out.println(kthElement(arr1, arr2, arr1.length, arr2.length, k));;
		System.out.println(finKthElement(arr1, arr2, arr1.length, arr2.length, 0));
	}
	
public static long kthElement( int arr1[], int arr2[], int m, int n, int k) {
        
        int index =0;
        int left =0, right =0;
        long result=0;
        
        while(index<m+n){
            
            if(k < index || k == index){
                if(left>right){
                    result= arr1[left];
                    break;
                } else{
                    result= arr2[right];
                    break;
                }
            }
            
            if(arr1[left] < arr2[right]){
                left++;
            } else{
                right++;
            }
            
            index+=2;
        }
        
        return result;
    }

/*
 * 	arr1[] = {2, 3, 6, 7, 9}
 *	arr2[] = {1, 4, 8, 10}
 *	k = 5
 * 
 */	

	public static int finKthElement(int arr1[], int arr2[], int m, int n, int k) {

			int left =0, right =0, pos=0;
			
			while(left<m && right<n) {
				
				if(arr1[left] <arr2[right]) {
					pos++;				
					if(pos == k) {
						return arr1[left];
					}
					
					left++;
				} else {					
					pos++;
										
					if(pos == k) {
						return arr2[right];
					}	
					right++;
				}
			}
			
			while(left<m) {
				pos++;
				
				if(pos == k) {
					return arr1[left];
				}	
				left++;
			}
			
			while(right <n) {
				pos++;
								
				if(pos == k) {
					return arr2[right];
				}	
				right++;	
			}			
			return -1;			
	}
}
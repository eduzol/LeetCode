package com.github.eduzol.leetcode;

public class Solution28 {

	public static void main(String[] args) {
		
		
	}
	
	/**
	 * Implement strStr(). 
	 * Returns the index of the first occurrence of needle in haystack, 
	 * or -1 if needle is not part of haystack.
	 */
	public int strStr(String haystach, String needle) {
		
		if (haystach.isEmpty() && needle.isEmpty()){
			return 0;
		}
		
		if ( needle.isEmpty() ){
			return 0;
		}
		
		if (haystach.isEmpty()){
			return -1;
		}
		
		if ( haystach.length() < needle.length() ){
			return -1;
		}
		
		
		for( int  i = 0 ; i + needle.length() <= haystach.length() ; i++){
			
			if( haystach.charAt(i) == needle.charAt(0)  ){
				boolean foundAll =  findAll(i, haystach, needle);
				if ( foundAll){
					return i;
				}
			}
		}
		return -1;
    }
	
	private boolean findAll(int start , String haystach, String needle ){
		
		
		for( int i = start, j = 0; i < haystach.length() && j < needle.length() ; i++ , j++){
			
			if ( haystach.charAt(i) != needle.charAt(j) ){
				return false;
			}else{
				if( j == (needle.length()-1)){
					return true;
				}
			}
		}
		return false;
	}
	
	
	
}


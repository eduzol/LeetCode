package com.github.eduzol.leetcode;

import java.util.HashMap;

public class Solution242 {

	/**
	 * Given two strings s and t, write a function to determine if t is an anagram of s.
	 * @param args
	 */
	public boolean isAnagram(String s, String t) {
		
		HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
		
		if ( s.length() != t.length()){
			return false;
		}
		
		for( int i = 0 ; i < s.length() ; i++){
			
			Character sKey = s.charAt(i);
			Integer sVal =  map.get(sKey);
			
			if ( sVal == null){
				map.put(sKey, 1);
			}else{
				++sVal;
				if ( sVal == 0 ){
					map.remove(sKey);
				}else{
					map.put(sKey, sVal);	
				}
				
			}
			
			Character tKey = t.charAt(i);
			Integer tVal = map.get(tKey);
			
			if ( tVal == null){
				map.put(tKey, -1);
			}else{
				--tVal;
				if ( tVal == 0){
					map.remove(tKey);
				}else{
					map.put(tKey, tVal);
				}
			}
			
		}
		
		if ( map.keySet().isEmpty()){
			return true;
		}else{
			return false;
		}
		
    }
}

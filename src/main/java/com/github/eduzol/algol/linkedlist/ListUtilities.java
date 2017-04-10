package com.github.eduzol.algol.linkedlist;

import java.util.List;

public class ListUtilities {

	public Integer binarySearch ( List<Integer> list, Integer target ){
		
		if (list.isEmpty()){
			return -1;
		}
		
		int i = 0;
		int j = list.size()-1;
		
		
		while ( i <= j ){

			Integer m = ( i +j) / 2;
			Integer val  = list.get(m);
			
			if (  val == target){
				return m;
			}
			
			if ( val  < target ){
				i = m+1;
			}else{
				j = m-1;
			}
		}

		return -1;
		
	}
	
}

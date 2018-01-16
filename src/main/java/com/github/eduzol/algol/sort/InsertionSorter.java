package com.github.eduzol.algol.sort;

public class InsertionSorter {

	
	public void sort( int[] arr ) {
		
		int size = arr.length;
		
		for (int  i = 0 ; i < size-1; i++ ){
			
			int j  = i+1;
			while ( j > 0) {
				if ( arr[j] < arr[j-1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					j--;
				}else {
					break;
				}
			}
		}
		
	}
}

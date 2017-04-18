package com.github.eduzol.algol.sort;

public class MergeSorter {

	/**
	 * conquer: create two sub arrays and compare each element 
	 * finally write in the array
	 */
	protected void merge( int[] array , int l, int m , int r){
		
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for ( int i = 0 ; i < n1 ; i++){
			left[i] = array[l+i];
		}
		
		for (int i = 0 ; i < n2 ; i++) {
			right[i] = array[m+i+1];
		}
		
		/* merge the temp arrays */
		int i =0 , j = 0;
		
		//initial index of merged subarray
		int k = l;
		
		while ( i < n1 && j < n2){
			
			if ( left[i] <= right[j]){
				array[k] = left[i];
				i++;
			}else{
				array[k] = right[j];
				j++;
			}
			k++;
		}
		
		while( i < n1 ){
			array[k] = left[i];
			i++;
			k++;
			
		}
		
		while (j < n2 ){
			array[k] = right[j];
			j++;
			k++;
		}
		
	}
	
	/**
	 * Divide, recursively half and a half 
	 */
	protected void sort( int[] array , int l , int r){
		
		if ( l < r ){
			
			int m =  (l + r ) / 2 ;
			sort(array, l, m);
			sort(array, m+1, r);
			merge(array, l ,m ,r);
			
		}
	}
	
	public void sort( int[] array ){
		
		sort( array, 0, array.length-1 );
		
	}
}

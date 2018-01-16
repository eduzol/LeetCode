package com.github.eduzol.algol.search;

public class BinarySearcher {
	
	
	
	public static int search( int[] arr , int element) {
		
		insertSort(arr);
		printArray(arr);
		
		int i = 0 ;
		int j = arr.length;
		
		while ( i <= j) {
			
			int m = (i+j)/2;
			int middleValue = arr[m];
			System.out.println("middle value " + middleValue + " , m " + m + " , i " + i  + " , j " + j);
			if ( middleValue  == element ) {
				return m;
			}
			
			if ( middleValue > element ) {
				j = m-1; 
			}else {
				i = m+1;
			}
			
		}
		
		return -1;
	}
	
	public static void insertSort(int[] arr) {
		
		int size = arr.length;
		
		for ( int i = 0 ; i < size-1 ; i++) {
			
			int j = i+1;
			while ( j > 0 ) {
				if ( arr[j] < arr[j-1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
					j--;
				}else {
					break;
				}
			}
		}
	}
	
	public static void printArray(  int[] arr) {
		int i = 0;
		
		while ( i < arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.print("\n");
	}

}

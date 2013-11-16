package com.ocjp.arrays;

import com.ocjp.mydate.*;

public class Array {
	// Primitive array declaration
	int arreglo[];

	// Reference array implementation
	Object a[] = { 1, 2, 3, 4, 'a' };

	// MyDate array
	MyDate myDateTest[] = new MyDate[4];

	// Primitive Multi-dimensional array
	int array[][];
	int[] array2[] = new int[4][5];
	int[][] array3 = new int[4][];
	MyDate myDateArrayTest[][] = new MyDate[3][2];

	// Illegal!
	// int array[][4];

	// Create, implement and fill array
	public void fillArray() {

		for (int i = 0; i < 4; i++) {
			myDateTest[i] = new MyDate(i + 7, i + 4, 1988 + i);
		}
	}

	public void fillArrayPribi() {
		for (int i = 0; i < array2.length; i++) {
			
			for (int j = 0; j < array2[0].length-4; j++) {
				int value = j+i;
				System.out.println("Posicion: " + i + " " + j + 
						" value = " + value);
				array2[i][j] = i+j;
				
			}
			
		}
	}
	
	public void copyArray(int[] array, int[] arrayCopy) {

		System.out.println("array = " + array.length);
		System.out.println("array = " + arrayCopy.length);
		
		// If where I'm going to copy is smaller
		if (array.length > arrayCopy.length) {
			arrayCopy = new int[array.length];
		}
		
		System.out.println("after array = " + array.length);
		System.out.println("after array = " + arrayCopy.length);
		
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
			System.out.println("arrayCopy[" + i + "] = " + arrayCopy[i] );
		}
		
	}

	public static void main(String[] args) {
		Array array = new Array();
		array.fillArray();
		array.fillArrayPribi();
		
		// Lets copy an array
		int arrayToCopy[] = {7,2,4,5,5,6};
		int duplicateArray[] = new int[4];
		
		//array.copyArray(arrayToCopy, duplicateArray);
	}

}

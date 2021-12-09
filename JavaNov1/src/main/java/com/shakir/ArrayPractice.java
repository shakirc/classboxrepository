package com.shakir;

import java.util.Arrays;
import java.util.List;

public class ArrayPractice {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//arrays are a collection of homogeneous data and the size is fixed
		//there are 2 ways to create arrays
		
		//method 1
	/*	int arr1[]=new int[10];  //this is how to create the array object
		arr1[0]=20;   // in the first solution, 20 was stored(assigning values)
		arr1[1]=5;    // in the second solution, 5 was stored
		arr1[2]=30;   // in the third solution, 30 was stored
		arr1[3]=65;
		arr1[4]=70;
		System.out.println(arr1.length);    //how to see the length of the data
		for (int i : arr1) {
			System.out.println(i);
			}
		
		//method 2
		int arr2[]= {30,70,86,34,25,65,236,946};
		for (int i :arr2) {
			System.out.print(i+"\t");
		}
		
		//2-Dimensional
		int arr3[][]= { {12,47,9} , {34,99,143} , {342,956,90} } ;   //multiple arrays/multidimensional array
		for (int[] is : arr3) {       //outer array/rows
			for (int is2 : is) {      //inner arrays/columns
				System.out.print(is2+"\t");
				
			}
			System.out.println("\n");       //how to make the columns appear
		} */
		
		int arr4[]= {46,890,34,657,8,65,7};
		Arrays.sort(arr4);
		for(int i:arr4) {
			System.out.println(i + "\t");
		}
		//Arrays.sort
		System.out.println("\n");
		System.out.println("binary search:" + Arrays.binarySearch(arr4, 657) );
	
	}

	
}

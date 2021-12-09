package com.shakir;

public class MultiplyingArrays {
	
	public static void main(String[] args) {
		
		int arr1[][]= {{1,2,3} , {4,5,6} , {7,8,9}}; //array1
				
		int arr2[][]= {{1,2,3} , {4,5,6} , {7,8,100}};  //array2
		
		int arr3[][]=new int[3][3];  //to hold the multiplication 
		
		for(int i=0;i<3;i++) {
			
		for(int j=0;j<3;j++) {
			arr3[i][j]=0;
			
		for(int k=0;k<3;k++) {
			arr3[i][j] += arr1[i][k] * arr2[k][j];
		} //this is the end of the k loop
		
		System.out.println(arr3[i][j]+" "); //this prints the array value
		} //this is the end of the j loop
		
		System.out.println(); //this prints out the line/separation space 
		} //this is the end of the i loop
		
		}
	{
		
		
		
	}

}

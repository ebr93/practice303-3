package org.perscholas;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//questionOne();
		//questionTwo();
		//questionThree();
		
		questionFour();
	}
	
	/*
	 Write a program that creates an array of integers with a length of 3. 
	 Assign the values 1, 2, and 3 to the indexes. Print out each array element.
	 */
	public static void questionOne() {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);
	}
	
	/*
	Write a program that returns the middle element in an array. Give the following 
	values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
	 */
	public static void questionTwo() {
		int[] arr = {13, 5, 7, 68, 2};
		int middle = arr.length / 2 + 1;
		System.out.println(arr[middle - 1]);
	}

	/*
	 * Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” 
	 * and “yellow”. Print out the array length. Make a copy using the clone( ) method. 
	 * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
	 */
	public static void questionThree() {
		String[] strings = {"red", "green", "blue"};
		System.out.println(strings.length);
		String[] copy = strings.clone();
		System.out.println(Arrays.toString(copy));
	}
	
	/*
	 * Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  
	 * Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value 
	 * at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. Now try to 
	 * assign a value to the array index 5. You should get the same type of exception.
	 */
	
	public static void questionFour() {
		int[] arr = {14, 21, 77, 83, 100};
		System.out.println(arr[0] + " " + arr[arr.length-1]);
		// int index = arr[arr.length]; // ArrayIndexOutOfBoundsException
		// System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		//arr[5] = 57; // ArrayIndexOutOfBoundsException
	}
	
	/*
	 * Write a program where you create an integer array with a length of 5. Loop through the array and 
	 * assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
	 */
	
	public static void questionFive() {
		
	}
}

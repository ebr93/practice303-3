package org.perscholas;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();
		question11(sc);
	}
	
	/*
	 Write a program that creates an array of integers with a length of 3. 
	 Assign the values 1, 2, and 3 to the indexes. Print out each array element.
	 */
	public static void question1() {
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
	public static void question2() {
		int[] arr = {13, 5, 7, 68, 2};
		int middle = arr.length / 2 + 1;
		System.out.println(arr[middle - 1]);
	}

	/*
	 * Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” 
	 * and “yellow”. Print out the array length. Make a copy using the clone( ) method. 
	 * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
	 */
	public static void question3() {
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
	
	public static void question4() {
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
	
	public static void question5() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}
	
	/* Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of 
	 * the loop control variable multiplied by 2 to the corresponding index in the array.
	 */
	public static void question6() {
		int[] arr = {5, 3 , 99, 64, 100};
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
		}
	}
	
	/*
	 * Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, 
	 * except for the middle (index 2) element.
	 */
	public static void question7() {
		int[] arr = {5, 3 , 99, 64, 100};
		for (int i = 0; i < arr.length; i++) {
			if (i == 2) continue;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/*
	 * Write a program that creates a String array of 5 elements and swaps the first element with the 
	 * middle element without creating a new array.
	 */
	public static void question8() {
		int[] arr = {5, 3 , 99, 64, 100};
		final int temp = arr[2];
		arr[2] = arr[0];
		arr[0] = temp;
		System.out.println(arr[0]);
		System.out.println(arr[2]);
	}
	/*
	 * Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in 
	 * ascending order, and print the smallest and the largest element of the array. The output will look like the following:
			Array in ascending order: 0, 1, 2, 4, 9, 13
			The smallest number is 0
			The biggest number is 13
	 */
	
	public static void question9() {
		int[] arr = {4, 2, 9, 13, 1, 0, 99};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i +1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Array in ascending order: ");
		for (int num : arr) {
			System.out.print(num + ", ");
		}
		System.out.println("\nThe smallest number is " + arr[0]);
		System.out.println("The biggest number is " + arr[arr.length - 1]);

	}
	
	/*
	 * Create an array that includes an integer, 3 strings, and 1 double. Print the array.
	 */
	
	public static void question10() {
		Object[] list = {11, "hello", "world", "programming", 3.14D}; 
		System.out.println(Arrays.toString(list));
		
	}
	
	/*
	 * Write some Java code that asks the user how many favorite things they have. Based on their answer, 
	 * you should create a String array of the correct size. Then ask the user to enter the things and store them in 
	 * the array you created. Finally, print out the contents of the array.
		Example
		
		How many favorite things do you have?
		7
		
		Enter your thing: phone
		Enter your thing: tv
		Enter your thing: xbox
		Enter your thing: wine
		Enter your thing: beer
		Enter your thing: sofa
		Enter your thing: book
		Your favorite  things are:
		phone tv xbox wine beer sofa book
	 */
	public static void question11(Scanner sc) {
		int number = 0;
		while (true) {
			if (number > 0) break;
			System.out.println("How many favorite things do you have?");
			number = Integer.valueOf(sc.nextLine());
		}
		
		String[] list = new String[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Enter your thing: ");
			list[i] = sc.nextLine();
		}
		
		System.out.println("Your favorite  things are:");
		for (String string : list) {
			System.out.print(string + " ");
		}
	}
	
}

package org.perscholas;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//multiplicationTable();
		greatestCommonDivisor(sc);
	}
	
	// Question 1 Write a program that uses nested for loops to print a multiplication table.
	public static void multiplicationTable() {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print((i+1) * (j+1) + " ");
			}
			System.out.println("");
		}
	}
	
	// Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
	public static void greatestCommonDivisor(Scanner sc) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int low = x < y ? x : y;
		for (int i = low; i > 0; i--) {
			if(x % i == 0 && y % i == 0) {
				System.out.println("Greatest Common Divisor: " + i);
				break;
			}
		}
	}
	
}

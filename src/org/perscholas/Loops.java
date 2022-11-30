package org.perscholas;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		question1();
		question2(sc);
		question3();
		sc.close();
	}
	
	// Question 1 Write a program that uses nested for loops to print a multiplication table.
	public static void question1() {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print((i+1) * (j+1) + " ");
			}
			System.out.println("");
		}
	}
	
	// Question 2 Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
	public static void question2(Scanner sc) {
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
	
	/* Question 3
	 Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year. 
	 In how many years will the tuition be doubled?
	*/
	public static void question3() {
		double tuition = 10000;
		int years = 0;
		while (true) {
			if (tuition >= 20000) break;
			tuition = tuition * 1.07D;
			years++;
		}
		System.out.println(years);
	}
	
}

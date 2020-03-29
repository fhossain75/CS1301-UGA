/*
 * StarGraph.java
 * Author:  Faisal Hossain
 * Submission Date:  March 6, 2020
 *
 * Purpose: Provides  a graphical representation of the function,
 * using a sequence of ‘*’s to indicate the magnitude of y. Values
 * of x and y are computed based on input from the user.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

//package StarGraph.java; Remove package declaration at the top

package StarGraph.java;

import java.util.Scanner; // Import Scanner class

public class StarGraphOriginal {
	
	public static int N; // size N of the array
	public static double xMin; // minimum value for x
	public static double xIncr; // increment for x

	public static void main(String[] args) {

		// Scanner Init
		Scanner keyboard = new Scanner(System.in);
		
		// User Input: N - size of array
		System.out.println("Please enter the number of x values to process:");
		N = keyboard.nextInt();
		// Error Handling
		if (N <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(0);
		}
		
		// User Input: xMin
		System.out.println("Enter a minimum value for x:");
		xMin = keyboard.nextDouble();	
		
		// User Input: xIncr
		System.out.println("Enter the amount to increment x:");
		xIncr = keyboard.nextDouble();	
		// Error Handling
		if (xIncr <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(0);
		}
		
		double[] xValues = new double[N];
		double[] yValues = new double[N];

		// Populate xValues array values
		xValues[0] = xMin;
		for (int i = 1; i < N; i++) {
			xValues[i] = xValues[i-1] + xIncr;
		}
		
		// Populate yValues array values
		for (int i = 0; i < N; i++) {
			yValues[i] = 20.0 * Math.abs(Math.sin(xValues[i]));
		}
		
		// Print x and y paired values
		for (int i = 0; i < N; i++) {
			System.out.printf("x: %.3f, y: %.3f\n",xValues[i], yValues[i]);
		}

		// Print simple graph of the function
		System.out.println("\nGraph");
		for (int i = 0; i < N; i++) {
			System.out.println(":" + "*".repeat((int) yValues[i]));
		}
		
		keyboard.close();
	}
}

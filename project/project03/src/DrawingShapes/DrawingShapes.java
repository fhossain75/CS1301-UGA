/*
 * DrawingShapes.java
 * Author:  Faisal Hossain
 * Submission Date:  February 28, 2020
 *
 * Purpose: Draws either a rectangle, triangle, hexagon, octagon,
 * or pentagon based on user's input of shape and dimension.
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

//package DrawingShapes; Remove package declaration at the top

package DrawingShapes;

import java.util.Scanner; // Import Scanner class

public class DrawingShapes {
	
	public static char shape;
	public static int length;
	public static int height;
	public static int astriskCount = 0;
	public static int spaceCount = 0;
	public static String astriskString = "";

	public static void main(String[] args) {
		
		// Scanner Init
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a shape: r t h o p");
		shape = keyboard.next().charAt(0);

		// Rectangle
		if (shape == 'r') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			if (length <= 1) {
				System.out.println("Length must be greater than 1\nGoodbye!");
			}
			else {
				System.out.println("Enter a height");
				height = keyboard.nextInt();
				if (height <= 1) {
					System.out.println("Height must be greater than 1\nGoodbye!");
				}
				else {
					System.out.println("Below is a " + length + " by " + height + " rectangle of *");
					astriskCount = length;
					for (int i = 0; i < astriskCount; i++) {
						astriskString += "*";
					}
					for (int i = 0; i < height; i++) {
						System.out.println(astriskString);
					}
				}
			}
		}
		
		// Triangle
		else if (shape == 't') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			if (length > 1) {
				System.out.println("Below is a triangle with two side lengths of " + length + " *");
				for (int i = 0; i < length;i++) {
					astriskString = "";
					spaceCount = length-1-i;
					astriskCount = 1+(i*2);
					for (int j = 0; j < spaceCount; j++) {
						astriskString += " ";
					}
					for (int k = 0; k < astriskCount; k++) {
						astriskString += "*";
					}
					System.out.println(astriskString);
				}
			}
			else {
				System.out.println("Length must be greater than 1\nGoodbye!");
			}
		}
		
		// Hexagon
		else if (shape == 'h') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			if (length > 1) {
				System.out.println("Below is a hexagon with side lengths of " + length + " *");
				// For-loop for upper hexagon
				for (int i = 0; i < length;i++) {
					astriskString = "";
					spaceCount = (length-1)-i;
					astriskCount = length+(i*2);
					for (int j = 0; j < spaceCount; j++) {
						astriskString += " ";
					}
					for (int k = 0; k < astriskCount; k++) {
						astriskString += "*";
					}
					System.out.println(astriskString);
				}
				// For-loop for lower hexagon
				for (int i = length-1; i > 0;i--) {
					astriskString = "";
					spaceCount = length-i;
					astriskCount = length-2+(i*2);
					for (int j = 0; j < spaceCount; j++) {
						astriskString += " ";
					}
					for (int k = 0; k < astriskCount; k++) {
						astriskString += "*";
					}
					System.out.println(astriskString);
				}
			}
			else {
				System.out.println("Length must be greater than 1\nGoodbye!");
			}
		}
		
		// Octagon
		else if (shape == 'o') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			if (length > 1) {
				System.out.println("Below is a octagon with side lengths of " + length + " *");
				// For-loop for upper Octagon
				for (int i = 0; i < length;i++) {
					astriskString = "";
					spaceCount = (length-1)-i;
					astriskCount = length+(i*2);
					for (int j = 0; j < spaceCount; j++) {
						astriskString += " ";
					}
					for (int k = 0; k < astriskCount; k++) {
						astriskString += "*";
					}
					System.out.println(astriskString);
				}
				// For-loop for middle hexagon
				for (int i = 0; i < length-2;i++) {
					astriskString = "";
					astriskCount = length-2+(length*2);
					for (int k = 0; k < astriskCount; k++) {
						astriskString += "*";
					}
					System.out.println(astriskString);
				}
				// For-loop for lower hexagon
				for (int i = length; i > 0;i--) {
					astriskString = "";
					spaceCount = length-i;
					astriskCount = length-2+(i*2);
					for (int j = 0; j < spaceCount; j++) {
						astriskString += " ";
					}
					for (int k = 0; k < astriskCount; k++) {
						astriskString += "*";
					}
					System.out.println(astriskString);
				}
			}
			else {
				System.out.println("Length must be greater than 1\nGoodbye!");
			}
		}	
		
		// Pentagon
		else if (shape == 'p') {
			System.out.println("Enter a length");
			length = keyboard.nextInt();
			if (length > 1) {
				System.out.println("Below is a pentagon with 4 side lengths of " + length + " *");
				// For-loop for upper pentagon - triangle
				for (int i = 0; i < length-1;i++) {
					astriskString = "";
					spaceCount = (length-1)-i;
					astriskCount = 1+(i*2);
					for (int j = 0; j < spaceCount; j++) {
						astriskString += " ";
					}
					for (int k = 0; k < astriskCount; k++) {
						astriskString += "*";
					}	
					System.out.println(astriskString);
				}
				// For-loop for lower pentagon - rectangle
				for (int i = 0; i < length;i++) {
					astriskString = "";
					astriskCount = (length*2)-1;
					for (int k = 0; k < astriskCount; k++) {
						astriskString += "*";
					}	
					System.out.println(astriskString);
				}
			}
			else {
				System.out.println("Length must be greater than 1\nGoodbye!");
			}
		}
		
		// Error Handling
		else if (!(shape == 'r' || shape == 't' || shape == 'h' ||
				shape == 'o' || shape == 'p')) {
				System.out.println("Invalid shape\nGoodbye!");
				System.exit(0);			
		}
		
		// Close Scanner Keyboard
		keyboard.close();
	}
}

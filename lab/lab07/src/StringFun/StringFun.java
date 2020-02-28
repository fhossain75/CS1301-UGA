/*
 * StringFun.java
 * Author:  Faisal Hossain
 * Submission Date:  February 28, 2020
 *
 * Purpose: Provides an an environment where the user can enter a 
 * sentence (as a string) and then the ability to reverse, replace
 * a character, remove a character, and remove all instances of a
 * character.
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

//package StringFun; Remove package declaration at the top

package StringFun;

import java.util.Scanner; // Import Scanner class

public class StringFun {

	public static String inputString;
	public static String userCommand;
	
	public static void main(String[] args) {
		
		// Scanner Init
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		inputString = keyboard.nextLine();
		
		// Do-while Loop
		do {
			
			// User Input: Command
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			userCommand = keyboard.nextLine();
			
			// Reverse Command
			if (userCommand.equalsIgnoreCase("REVERSE")) {
				String inputStringReverse = "";
				for (int i = inputString.length(); i > 0; i--) {
					inputStringReverse += inputString.charAt(i-1);
				}
				inputString = inputStringReverse;
				System.out.println("The new sentence is: " + inputString);
			}
			
			// Replace First Command
			else if (userCommand.equalsIgnoreCase("REPLACE FIRST")) {
				char charReplace; // Character user wishes to replace
				int charReplaceIndex = 0;
				char charNew;     // New character to replace old character 
				System.out.println("Enter the character to replace");
				charReplace = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				charNew = keyboard.next().charAt(0);
				
				// For-loop obtains first charReplacecIndex
				boolean firstFound = false;
				for(int i = 0; i < inputString.length(); i++) {
					if (firstFound != true) {
						if (inputString.charAt(i) == charReplace) {
							charReplaceIndex = i;
							firstFound = true;
						}
					}
				}
				
				// Error Handling
				if (firstFound == true) {
					inputString = inputString.substring(0,charReplaceIndex) + charNew + inputString.substring(charReplaceIndex+1);	
					System.out.println("The new sentence is: " + inputString);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
			}
			
			// Replace Last Command
			else if (userCommand.equalsIgnoreCase("REPLACE LAST")) {
				char charReplace; // Character user wishes to replace
				int charReplaceIndex = 0; // Index of charReplace
				char charNew;     // New character to replace old character 
				System.out.println("Enter the character to replace");
				charReplace = keyboard.next().charAt(0);
				System.out.println("Enter the new character");
				charNew = keyboard.next().charAt(0);
				
				// For-loop obtains last charReplacecIndex
				boolean lastFound = false;
				for(int i = inputString.length()-1; i > 0; i--) {
					if (lastFound != true) {
						if (inputString.charAt(i) == charReplace) {
							charReplaceIndex = i;
							lastFound = true;
						}
					}
				}
				
				// Error Handling
				if (lastFound == true) {
					inputString = inputString.substring(0,charReplaceIndex) + charNew + inputString.substring(charReplaceIndex+1);	
					System.out.println("The new sentence is: " + inputString);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
			}
			
			// Remove Command
			else if(userCommand.equalsIgnoreCase("REMOVE")) {
				char charRemove; // Character user wishes to remove
				int charRemoveIndex = 0; // Index of charRemove
				int charRemoveInstance; // Instance of the character the user wishes to remove
				System.out.println("Enter the character to remove");
				charRemove = keyboard.next().charAt(0);
				System.out.println("Enter the "+ charRemove +" you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				charRemoveInstance = keyboard.nextInt();
				
				// For-loop obtains charRemoveIndex
				int instanceCounter = 0;
				for(int i = 0; i < inputString.length(); i++) {
					if (inputString.charAt(i) == charRemove) {
						instanceCounter ++;
						if (instanceCounter == charRemoveInstance) {
							charRemoveIndex = i;
						}
					}	
				}
				
				// Error Handling
				if (instanceCounter == charRemoveInstance) {
					inputString = inputString.substring(0,charRemoveIndex) + inputString.substring(charRemoveIndex+1);		
					System.out.println("The new sentence is: " + inputString);
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
			}
			
			// Remove All Command
			else if(userCommand.equalsIgnoreCase("REMOVE ALL")) {
				char charRemove; // Character user wishes to remove
				System.out.println("Enter the character to remove");
				charRemove = keyboard.next().charAt(0);
				
				String inputStringRemoveAll = ""; //
				for(int i = 0; i < inputString.length(); i++) {
					if (inputString.charAt(i) != charRemove) {
						inputStringRemoveAll += inputString.charAt(i);
					}
				}
				inputString = inputStringRemoveAll;
				System.out.println("The new sentence is: " + inputString);
			}

			// Quit Command - Redundant
			else if(userCommand.equalsIgnoreCase("QUIT")) {
				System.exit(0);
			}
			
		} while(!userCommand.equalsIgnoreCase("QUIT"));	// End while loop
		keyboard.close();
	}
}

/*
 * ClassifyMessage.java
 * Author:  Faisal Hossain 
 * Submission Date:  February 5, 2020
 *
 * Purpose: Identifies and parse important, informational components (category,
 * latitude, longitude, & payload) of a formatted message, and prints in a 
 * more readable manner. 
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

//package ClassifyMessage; Remove package declaration at the top

package ClassifyMessage;

import java.util.Scanner;

public class ClassifyMessage {
	
	enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN};
	
	public static String catString;  // The raw text of the message’s category
	public static String payload;    // The primary content of the message
	public static double latitude;   // The latitude indicated in the message
	public static double longitude;  // The longitude indicated in the message
	public static boolean isInRange; // A “flag” indicating whether the latitude and
					                 // longitude values are within bounds
	public static MessageCategory category; // The message’s category
	
	public static final double south =  39.882343;  // southernmost latitude
	public static final double north = 40.231315;   // northernmost latitude
	public static final double west  = -105.743511; // westernmost longitude
	public static final double east  = -104.907864; // easternmost longitude

	public static void main(String[] args) {

		// Scanner Init
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next();
		catString = catString.trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine();
		payload = payload.trim();
		
		//Match value of catString to elements of enum MessageCategory
		if (catString.equalsIgnoreCase("fire") || 
				catString.equalsIgnoreCase("smoke")) {
			category = MessageCategory.ALERT;
		}
		else if (catString.equalsIgnoreCase("need")) {
			category = MessageCategory.NEED;
		}
		else if (catString.equalsIgnoreCase("offer")) {
			category = MessageCategory.OFFER;
		}
		else if (catString.equalsIgnoreCase("structure") || 
				catString.equalsIgnoreCase("road")  ||
				catString.equalsIgnoreCase("photo") ||
				catString.equalsIgnoreCase("evac")) {
			category = MessageCategory.INFO;
		}
		else {
			category = MessageCategory.UNKNOWN;
		}

		//Determine geographic boundaries of lat & long
		if (latitude >= south && latitude <= north ||
		    latitude >= south && latitude <= north) {
			isInRange = true;
		}
		else {
			isInRange = false;
		}

		//Print Statements
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);		
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);

		keyboard.close();
	}
}

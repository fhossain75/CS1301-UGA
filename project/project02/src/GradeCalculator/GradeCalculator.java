/*
 * GradeCalculator.java
 * Author:  Faisal Hossain
 * Submission Date:  February 14, 2020
 *
 * Purpose: Aid a student in calculating his/her current grade in the course as well as
 * finding the average score (s)he will need to achieve a certain letter grade.
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

//package GradeCalculator; Remove package declaration at the top

package GradeCalculator;

import java.util.Scanner; //Import Scanner class
import java.lang.Math; //Import Math class

public class GradeCalculator {
	
	public static char desiredGrade;
	// Grading Items
	public static double exam1Score;
	public static double exam1Weight;
	public static double exam1SW;			 // Exam 1 Score times Weight
	public static double exam2Score;
	public static double exam2Weight;
	public static double exam2SW;			 // Exam 1 Score times Weight
	public static double finalExamScore;
	public static double finalExamWeight;
	public static double finalExamSW;		 // Final Exam Score times Weight
	public static double labsScore;
	public static double labsWeight;
	public static double labsSW;			 // Labs Score times Weight
	public static double projectsScore;
	public static double projectsWeight;
	public static double projectsSW;		 // Projects Score times Weight
	public static double participationScore;
	public static double participationWeight;
	public static double participationSW;	 // Participation Score times Weight
	public static double quizzesScore;
	public static double quizzesWeight;
	public static double quizzesSW;			 // Quizzes Score times Weight
	// Calculations
	public static double totalKnownGradeSW;  // Total Known Grade Score times Weight
	public static double totalKnownGradeWeight;
	public static double currentScore;
	public static double avgToFinalLetterGrade;
	public static double finalOverallScore;
	public static char currentLetterGrade;

	public static void main(String[] args) {
		
		// Grading Scale
		System.out.println("Grading Scale:");
		System.out.println("A\t90 - 100");
		System.out.println("B\t80 - 89");
		System.out.println("C\t70 - 79");
		System.out.println("D\t60 - 69");
		System.out.println("F\tbelow 60");

		// Scanner Init
		Scanner keyboard = new Scanner(System.in);
		
		// User Input: Final Grade Wanted
		System.out.println("What letter grade do you want to achieve for the course?");
		char desiredGrade = keyboard.next().charAt(0);
		// Desired Final Grade Error Message
		desiredGrade = Character.toUpperCase(desiredGrade);
		if (!(desiredGrade == 'A' || desiredGrade == 'B' || desiredGrade == 'C' ||
			desiredGrade == 'D' || desiredGrade == 'F')) {
			System.out.println("The desired final letter grade entered by the user should be either A, B, C, D or F.");
			System.exit(0);			
		}
		
		// User Input: Percentage Weights
		System.out.println("Enter Percentage Weights:");
		System.out.println("Exam 1:");
		double exam1Weight = keyboard.nextDouble();
		System.out.println("Exam 2:");
		double exam2Weight = keyboard.nextDouble();
		System.out.println("Final Exam:");
		double finalExamWeight = keyboard.nextDouble();
		System.out.println("Labs:");
		double labsWeight = keyboard.nextDouble();
		System.out.println("Projects:");
		double projectsWeight = keyboard.nextDouble();
		System.out.println("Participation:");
		double participationWeight = keyboard.nextDouble();
		System.out.println("Quizzes:");
		double quizzesWeight = keyboard.nextDouble();
		// Percentage Weight Error Message
		double totalWeight = exam1Weight + exam2Weight + finalExamWeight + labsWeight +
							 projectsWeight + participationWeight + quizzesWeight;
		if (totalWeight > 100) {
			System.out.println("Weights don’t add up to 100, program exiting…");
			System.exit(0);
		}
		
		//User Input: Scores
		String userAnswer; // User Input: Y or N
		System.out.println("Enter your scores out of a 100:");
		// Exam 1 Score
		System.out.println("Do you know your Exam 1 score?");
		userAnswer = keyboard.next();
		if (userAnswer.equalsIgnoreCase("YES") || userAnswer.equalsIgnoreCase("Y")) {
			System.out.println("Score received on exam 1:");
			exam1Score = keyboard.nextDouble();
			exam1SW = exam1Score * exam1Weight;
			totalKnownGradeSW += exam1SW;
			totalKnownGradeWeight += exam1Weight;
			// Exam 2 Score
			System.out.println("Do you know your Exam 2 score?");
			userAnswer = keyboard.next();
				if (userAnswer.equalsIgnoreCase("YES") || userAnswer.equalsIgnoreCase("Y")) {
					System.out.println("Score received on exam 2:");
					exam2Score = keyboard.nextDouble();
					exam2SW = exam2Score * exam2Weight;
					totalKnownGradeSW += exam2SW;
					totalKnownGradeWeight += exam2Weight;
					// Final Exam Score
					System.out.println("Do you know your Final Exam score?");
					userAnswer = keyboard.next();
						if (userAnswer.equalsIgnoreCase("YES") || userAnswer.equalsIgnoreCase("Y")) {
							System.out.println("Score received on final exam:");
							finalExamScore = keyboard.nextDouble();	
							finalExamSW = finalExamScore * finalExamWeight;
							totalKnownGradeSW += finalExamSW;
							totalKnownGradeWeight += finalExamWeight;
						}
				}
		}
		// Labs Score
		System.out.println("Do you know your lab average?");
		userAnswer = keyboard.next();
			if (userAnswer.equalsIgnoreCase("YES") || userAnswer.equalsIgnoreCase("Y")) {
				System.out.println("Average Lab Grade:");
				labsScore = keyboard.nextDouble();
				labsSW = labsScore * labsWeight;
				totalKnownGradeSW += labsSW;
				totalKnownGradeWeight += labsWeight;
			}
		// Projects Score
		System.out.println("Do you know your project average?");
		userAnswer = keyboard.next();
			if (userAnswer.equalsIgnoreCase("YES") || userAnswer.equalsIgnoreCase("Y")) {
				System.out.println("Average Project Grade:");
				projectsScore = keyboard.nextDouble();
				projectsSW = projectsScore * projectsWeight;
				totalKnownGradeSW += projectsSW;
				totalKnownGradeWeight += projectsWeight;
			}
		// Participation Score
		System.out.println("Do you know your participation average?");
		userAnswer = keyboard.next();
			if (userAnswer.equalsIgnoreCase("YES") || userAnswer.equalsIgnoreCase("Y")) {
				System.out.println("Average Participation Grade:");
				participationScore = keyboard.nextDouble();
				participationSW = participationScore * participationWeight;
				totalKnownGradeSW += participationSW;
				totalKnownGradeWeight += participationWeight;
			}
		// Quizzes Score
		System.out.println("Do you know your quiz average?");
		userAnswer = keyboard.next();
			if (userAnswer.equalsIgnoreCase("YES") || userAnswer.equalsIgnoreCase("Y")) {
				System.out.println("Average Quiz Grade:");
				quizzesScore = keyboard.nextDouble();
				quizzesSW = quizzesScore * quizzesWeight;
				totalKnownGradeSW += quizzesSW;
				totalKnownGradeWeight += quizzesWeight;
			}

		// currentScore Calculation
		currentScore = totalKnownGradeSW/totalKnownGradeWeight;
		
		// finalOverallScore Calculation
		if (desiredGrade == 'A') {
			finalOverallScore = 90;
		}
		else if (desiredGrade == 'B') {
			finalOverallScore = 80;
		}
		else if (desiredGrade == 'C') {
			finalOverallScore = 70;
		}
		else if (desiredGrade == 'D') {
			finalOverallScore = 60;
		}
		else {
			finalOverallScore = 0;
		}

		// avgToFinalLetterGrade Calculation
		if (totalKnownGradeWeight == 100) {
			avgToFinalLetterGrade = (100 * finalOverallScore - totalKnownGradeSW);	
		}
		else {
			avgToFinalLetterGrade = (100 * finalOverallScore - totalKnownGradeSW)/(100 - totalKnownGradeWeight);	
		}
		avgToFinalLetterGrade = Math.round(avgToFinalLetterGrade * 100.0) / 100.0;

		// Current Letter Grade Calculation
		if (currentScore >= 90) {
			currentLetterGrade = 'A';
		}
		else if (currentScore >= 80) {
			currentLetterGrade = 'B';
		}
		else if (currentScore >= 70) {
			currentLetterGrade = 'C';
		}
		else if (currentScore >= 60) {
			currentLetterGrade = 'D';
		}
		else {
			currentLetterGrade = 'F';
		}
		
		// Print Statements
		System.out.printf("Current Grade Score: %.2f\n",currentScore);
		System.out.println("Your current letter grade is a " + currentLetterGrade);

		if (avgToFinalLetterGrade < 0) {
			System.out.println("Congratulations! You received the " + desiredGrade + "that you wanted!");
		}
		else if (avgToFinalLetterGrade > 100) {
			System.out.println("Sorry, you cannot receive an A in the course");
		}
		else {
			System.out.println("You have to score an average greater than or equal to " + avgToFinalLetterGrade
					+ " in the remaining grade items to receive an " + desiredGrade + "in the course");
		}
		keyboard.close();
	}
}
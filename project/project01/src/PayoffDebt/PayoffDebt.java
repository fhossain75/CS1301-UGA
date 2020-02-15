/*
 * PayoffDebt.java
 * Author:  Faisal Hossain
 * Submission Date:  January 31, 2020
 *
 * Purpose: Computes the number of months required to pay off credit card debt
 * using the user input of principal, annual interest rate, and
 * monthly payment. Also provides total amount paid, total interest paid,
 * and over-payment.
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

//package PayoffDebt; Remove package declaration at the top

package PayoffDebt;

import java.util.Scanner; // Import Scanner class
import java.lang.Math; // Import Math class

public class PayoffDebt {

	public static double principal;
	public static double annualInterestRate;
	public static double monthlyPayment;
	public static double numberOfMonthsRaw;
	public static int numberOfMonths;
	public static double totalAmountPaid; // Total amount paid to the credit card company
	public static double totalInterestPaid;
	public static double overPayment; // Amount overpaid to the credit card company
	
	public static void main(String[] args) {

		// Scanner Init
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		principal = keyboard.nextDouble();
		System.out.println("Enter the annual interest rate:");
		annualInterestRate = keyboard.nextDouble();
		System.out.println("Enter your monthly payment:");
		monthlyPayment = keyboard.nextDouble();

		numberOfMonthsRaw = (Math.log(monthlyPayment)-Math.log(monthlyPayment-(annualInterestRate/1200.0)*principal))/(Math.log((annualInterestRate/1200)+1.0));
		numberOfMonths = (int) Math.ceil(numberOfMonthsRaw); //rounded int of numbersofMonthsRaw
		totalAmountPaid = numberOfMonths*monthlyPayment;
		totalInterestPaid = totalAmountPaid - principal;
		
		// Difference of the totalAmountPaid with the raw value of 
		// number of months multiplied by monthlyPayment
		overPayment = totalAmountPaid-(numberOfMonthsRaw*monthlyPayment);
		
		//Print Statements
		System.out.printf("Principal:\t\t\t%.2f\n",principal);
		System.out.println("Annual Interest Rate (%):\t" + annualInterestRate);
		System.out.printf("Monthly Payment:\t\t%.2f\n",monthlyPayment);
		System.out.println();
		System.out.println("Months Needed to Pay Off:\t" + numberOfMonths);
		System.out.printf("Total Amount Paid:\t\t$%.2f\n", totalAmountPaid);
		System.out.printf("Total Interest Paid:\t\t$%.2f\n", totalInterestPaid);
	    System.out.printf("Overpayment:\t\t\t$%.2f\n", overPayment);
	    
		keyboard.close();
	}
}

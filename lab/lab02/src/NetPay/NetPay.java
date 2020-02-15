/*
 * NetPay.java
 * Author:  Faisal Hossain
 * Submission Date:  January 22, 2020
 *
 * Purpose: Computes a person's gross and net pay based on their
 * hourly wage, hours worked, and several withholdings. 
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

//package NetPay; Remove package declaration at the top

package NetPay;

import java.util.Scanner; //Import Scanner class

public class NetPay {
	
	public static final double federal_tax_percent = 10.00;
	public static final double state_tax_percent = 4.5;
	public static final double ss_percent = 6.2;
	public static final double medicare_percent = 1.45;
	public static final double pay_per_hour = 7.25;
	
	
	public static void main(String[] args) {
		
		// Scanner Init
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of hours per week:");
		double hoursPerWeek = keyboard.nextDouble();
		double grossPay = pay_per_hour * hoursPerWeek;
		
		//Deductions
		double federal = grossPay*(federal_tax_percent/100);
		double state = grossPay*(state_tax_percent/100);
		double socialSecurity = grossPay*(ss_percent/100);
		double medicare = grossPay*(medicare_percent/100);
		double netPay = grossPay - federal - state - socialSecurity - medicare;
		
		//Print Statements
		System.out.println("Hours per Week:\t\t" + hoursPerWeek);
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		
		System.out.println("\nDeductions");
		System.out.println("Federal:\t\t" + federal);
		System.out.println("State:\t\t\t" + state);
		System.out.println("Social Secuirty:\t" + socialSecurity);
		System.out.println("Medicare:\t\t" + medicare);
		keyboard.close();
	}
}

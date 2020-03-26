/*
 * CircleTester.java
 * Author:  Faisal Hossain 
 * Submission Date:  March 25, 2020
 *
 * Purpose: Includes various tests of methods defined in Circle.java.
 * Also includes three pass/fail test cases. Calculations precision 
 * is evaluated by a set threshold.
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

//package Circle; Remove package declaration at the top

package Circle;

public class CircleTester{
	public static final double THRESHOLD = 0.000000001;
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1="+circle1);
		System.out.println("circle2="+circle2);
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println("name: " + circle1.getName());
		System.out.println("center: (" + circle1.getX() + ", " + circle1.getY() + ")");
		System.out.println("radius: " + circle1.getRadius());
		
		// set the circle2 radius to 5.3
		circle2.setRadius(-2.0);

		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("name: " + circle2.getName());
		System.out.println("center: (" + circle2.getX() + ", " + circle2.getY() + ")");
		System.out.println("radius: " + circle2.getRadius());
		
		// print circle1 diameter, area and perimeter
		System.out.println("Diameter: " + circle1.diameter());
		System.out.println("Area: " + circle1.area());
		System.out.println("Perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("Diameter: " + circle2.diameter());
		System.out.println("Area: " + circle2.area());
		System.out.println("Perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("Unit Circle: "+ circle1.isUnitCircle());
		
		// display whether circle2 is a unit circle
		System.out.println("Unit Circle: "+ circle2.isUnitCircle());
		
		// your additional tests should be placed below here.  Make sure to include at least 2-3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		// Test Case 1
		System.out.println("\nTest Case 1:");
		Circle circle3 = new Circle();
		circle3.setName("Circle 3");
		circle3.setX(0.0);
		circle3.setY(0.0);
		circle3.setRadius(1);
		Circle circle4 = new Circle();
		circle4.setName("Circle 4");
		circle4.setX(-5.0);
		circle4.setY(10.0);
		circle4.setRadius(5);
		// Unit Circle - 1 Test
		if(circle3.isUnitCircle() == true) { 
			System.out.println("PASSED: Unit Circle - 1");
		}
		else {
			System.out.println("FAILED: Unit Circle - 1");
		}
		// Unit Circle - 2 Test
		if(circle4.isUnitCircle() == false) { 
			System.out.println("PASSED: Unit Circle - 2");
		}
		else {
			System.out.println("FAILED: Unit Circle - 2");
		}
		// Equals Method Test
		if(circle3.equals(circle4) == false) { 
			System.out.println("PASSED: Equals");
		}
		else {
			System.out.println("FAILED: Equals");
		}
		// Distance Method Test
		if(Math.abs(circle3.distance(circle4) - 11.1803398875) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		// Smaller Method Test
		if(circle3.isSmaller(circle4) == true) {
			System.out.println("PASSED: Smaller");
		}
		else {
			System.out.println("FAILED: Smaller");
		}
		// Comparison Method Test
		if(Math.abs(circle3.compareTo(circle4) - -1) < THRESHOLD) {
			System.out.println("PASSED: Comparison");
		}
		else {
			System.out.println("FAILED: Comparison");
		}
		// Intersection Method Test
		if(circle3.intersects(circle4) == false) {
			System.out.println("PASSED: Intersection");
		}
		else {
			System.out.println("FAILED: Intersection");
		}
		
		// Test Case 2
		System.out.println("\nTest Case 2:");
		Circle circle5 = new Circle();
		circle5.setName("Circle 3");
		circle5.setX(-5.0);
		circle5.setY(10.0);
		circle5.setRadius(5);
		Circle circle6 = new Circle();
		circle6.setName("Circle 4");
		circle6.setX(-5.0);
		circle6.setY(10.0);
		circle6.setRadius(5);
		// Unit Circle - 1 Test
		if(circle5.isUnitCircle() == false) { 
			System.out.println("PASSED: Unit Circle - 1");
		}
		else {
			System.out.println("FAILED: Unit Circle - 1");
		}
		// Unit Circle - 2 Test
		if(circle6.isUnitCircle() == false) { 
			System.out.println("PASSED: Unit Circle - 2");
		}
		else {
			System.out.println("FAILED: Unit Circle - 2");
		}
		// Equals Method Test
		if(circle5.equals(circle6) == true) { 
			System.out.println("PASSED: Equals");
		}
		else {
			System.out.println("FAILED: Equals");
		}
		// Distance Method Test
		if(Math.abs(circle5.distance(circle6) - 0) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		// Smaller Method Test
		if(circle5.isSmaller(circle6) == false) {
			System.out.println("PASSED: Smaller");
		}
		else {
			System.out.println("FAILED: Smaller");
		}
		// Comparison Method Test
		if(Math.abs(circle5.compareTo(circle6) - 0) < THRESHOLD) {
			System.out.println("PASSED: Comparison");
		}
		else {
			System.out.println("FAILED: Comparison");
		}
		// Intersection Method Test
		if(circle5.intersects(circle6) == true) {
			System.out.println("PASSED: Intersection");
		}
		else {
			System.out.println("FAILED: Intersection");
		}
		
		// Test Case 3
		System.out.println("\nTest Case 3:");
		Circle circle7 = new Circle();
		circle7.setName("Circle 3");
		circle7.setX(20.1);
		circle7.setY(-25.2);
		circle7.setRadius(50);
		Circle circle8 = new Circle();
		circle8.setName("Circle 4");
		circle8.setX(-20.3);
		circle8.setY(25.4);
		circle8.setRadius(25);
		// Unit Circle - 1 Test
		if(circle7.isUnitCircle() == false) { 
			System.out.println("PASSED: Unit Circle - 1");
		}
		else {
			System.out.println("FAILED: Unit Circle - 1");
		}
		// Unit Circle - 2 Test
		if(circle8.isUnitCircle() == false) { 
			System.out.println("PASSED: Unit Circle - 2");
		}
		else {
			System.out.println("FAILED: Unit Circle - 2");
		}
		// Equals Method Test
		if(circle7.equals(circle8) == false) { 
			System.out.println("PASSED: Equals");
		}
		else {
			System.out.println("FAILED: Equals");
		}
		// Distance Method Test
		if(Math.abs(circle7.distance(circle8) - 64.7496718138) < THRESHOLD) {
			System.out.println("PASSED: Distance");
		}
		else {
			System.out.println("FAILED: Distance");
		}
		// Smaller Method Test
		if(circle7.isSmaller(circle8) == false) {
			System.out.println("PASSED: Smaller");
		}
		else {
			System.out.println("FAILED: Smaller");
		}
		// Comparison Method Test
		if(Math.abs(circle7.compareTo(circle8) - 1) < THRESHOLD) {
			System.out.println("PASSED: Comparison");
		}
		else {
			System.out.println("FAILED: Comparison");
		}
		// Intersection Method Test
		if(circle7.intersects(circle8) == true) {
			System.out.println("PASSED: Intersection");
		}
		else {
			System.out.println("FAILED: Intersection");
		}
	}
}


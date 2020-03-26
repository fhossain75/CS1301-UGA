/*
 * Circle.java
 * Author:  Faisal Hossain 
 * Submission Date:  March 25, 2020
 *
 * Purpose: Contains a class representing a circle. Within the
 * class is various defined methods to set the circle's name, X,
 * Y, and radius; methods to return the cricle's area, perimeter,
 * diameter, and distance between another circle; and methods to 
 * return whether the circle and another circle are unit circles,
 * equal, smaller, larger, and intersect.
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

public class Circle {
	
	private String name;        // declare the private String instance  name
	private double radius;      // declare the private double instance  radius
	private double x;       	// declare the private double instance  x
	private double y;       	// declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName() {
		
		return 	name;
	}
	
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() {
		
		return x;
	}
	
	
	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() {
		
		return y;	
	}
	
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
		
		return radius;	
	}
	
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String newName) {
		
		name = newName;
	}

	
	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double newX) {
		
		x = newX;
	}
	
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double newY) {
		
		y = newY;	
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double newRadius) {
		
		if (newRadius > 0) {
		radius = newRadius;	
		}
	}
	
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() {
		
		return Math.PI * Math.pow(radius, 2);	
	}
	
	
	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
		
		return 2 * Math.PI * radius;	
	}
	
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
		
		return 2 * radius;
	}
	
	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
		
		if ((Math.abs(x - 0) < THRESHOLD) && 
			(Math.abs(y - 0) < THRESHOLD) &&
			(Math.abs(radius - 1) < THRESHOLD)) {
			
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
		
		return "name: " + name + "\ncenter: (" + x + ", " + y + ")" + "\nradius: " + radius;
	}
	
	
	//--------------------------------------------------------
	// equals - returns true when the radius and centers of 
	// 			both circles are the same; otherwise,it 
	//			returns false.
	//--------------------------------------------------------
	public boolean equals(Circle anotherCircle) {
		
		if ((Math.abs(radius - anotherCircle.radius) < THRESHOLD) && 
			(Math.abs(x - anotherCircle.x) < THRESHOLD) &&
			(Math.abs(y - anotherCircle.y) < THRESHOLD)) {
			
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
	
	//--------------------------------------------------------
	// distance - returns the distance between the centers 
	//			  of the circle executing the method and
	//			  anotherCircle
	//--------------------------------------------------------
	public double distance(Circle anotherCircle) {
		
		return Math.sqrt(Math.pow((x - anotherCircle.x),2) +  Math.pow((y - anotherCircle.y),2));
	}
	
	
	//--------------------------------------------------------
	// isSmaller - returns true when the circle executing the 
	//			   method (calling object) is smaller than the
	//			   parameter (anotherCircle). Otherwise, it 
	//			   returns false. 
	//--------------------------------------------------------
	public boolean isSmaller(Circle anotherCircle) {
		
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
	//--------------------------------------------------------
	// compareTo - Returns a positive 1 if the calling object
	//			   is larger. Returns -1 if the calling object
	// 			   is smaller than anotherCircle. Otherwise, 
	//			   it returns 0. 
	//--------------------------------------------------------
	public int compareTo(Circle anotherCircle) {
		
		if (isSmaller(anotherCircle)) {
			return -1;
		}
		
		else if (Math.abs(this.diameter() - anotherCircle.diameter()) < THRESHOLD) {
			return 0;
		}
		
		else {
			return 1;
		}
	}
	
	
	//--------------------------------------------------------
	// intersects - returns true when the circle executing the
	//				method and anotherCircle have an 
	//				intersecting area (one or more points 
	//				enclosed by both circles); otherwise, it 
	//				returns false. 
	//--------------------------------------------------------
	public boolean intersects(Circle anotherCircle) {
		if (distance(anotherCircle) < (radius + anotherCircle.radius)) {
			return true;
		}
		
		else {
			return false;
		}
	}
}


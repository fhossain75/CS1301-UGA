import java.util.Scanner;

/*
 * This class demos the states 
 * of a Traffic light using
 * an enumeration and
 * a switch statement.
 *
 * @author Sal LaMarca
 */
public class EnumExample {
	
	//Must declare enum globally inside the class.
	//  It is class within a class, which is a nested class.
	enum TrafficLight{RED, YELLOW, GREEN}
	
	/*
	* Demo traffic light states with an enum and switch.
	*/
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("State of traffic light (red, yellow, green):\t");
		String trafficLightInput = keyboard.next();
		trafficLightInput = trafficLightInput.toUpperCase();
		keyboard.close();

		//Convert the String trafficLightInput to a TrafficLight enumeration type.
		//  This will only work when trafficLightInput matches one of the enumeration types.
		TrafficLight trafficLight = TrafficLight.valueOf(trafficLightInput);
		//Print out the trafficLight's state and ordinal value (its integer representation)
		System.out.println("TrafficLight is " + trafficLight + ", ordinal value is " +  trafficLight.ordinal());

		switch(trafficLight){
			case GREEN:
				System.out.println("Go");
				break;
			case RED:
				System.out.println("Stop");
				break;
			case YELLOW:
				System.out.println("Caution");
				break;
			default:
				System.out.println("Invalid Input");	
		}
		
		/*
		 * The commented statements below are logically equivalent
		 * to the switch statement above.
		 */
		
		/*
		if(trafficLight == TrafficLight.GREEN)
			System.out.println("Go");
		else if(trafficLight == TrafficLight.RED)
			System.out.println("Stop");
		else if(trafficLight == TrafficLight.YELLOW)
			System.out.println("Caution");
		else
			System.out.println("Invalid Input");
		*/
		
		
	}

}

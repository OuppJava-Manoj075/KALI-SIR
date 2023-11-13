package gov.in.oupp.tranning.corejavatranning.basicPracticalAssignment;
import java.util.*;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle amount");
		int principle = sc.nextInt();
		System.out.println("Enter the time");
		int time = sc.nextInt();
		System.out.println("Enter the intrest");
		float intrest = sc.nextFloat()
;
		float simpleIntrest = (principle * time * intrest)/100;
		
		System.out.println("The principle amonunt is "+simpleIntrest);
	}

}

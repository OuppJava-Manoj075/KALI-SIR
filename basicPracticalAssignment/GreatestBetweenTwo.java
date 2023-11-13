package gov.in.oupp.tranning.corejavatranning.basicPracticalAssignment;
import java.util.*;

public class GreatestBetweenTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int first = sc.nextInt();
		System.out.println("Enter the second Number");
		int sec = sc.nextInt();
		
		
		int ans = first > sec ? first : sec;
		
		System.out.println("The greatest value is "+ans);
	}

}

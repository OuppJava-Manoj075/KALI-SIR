package gov.in.oupp.tranning.corejavatranning.basicPracticalAssignment;
import java.util.*;

public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a Number");
		int first = sc.nextInt();
		System.out.println("Enter the b NUmber");
		int second = sc.nextInt();
		
		first = first+second;
		second = first - second;
		first = first - second;
		
		System.out.println("After change the value");
		System.out.println("first value is "+first);
		System.out.println("first value is "+second);
		
		

	}

}

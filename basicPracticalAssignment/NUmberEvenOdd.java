package gov.in.oupp.tranning.corejavatranning.basicPracticalAssignment;
import java.util.*;

public class NUmberEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number is divisible by 2");
		}else {
			System.out.println("Number is not divisible by two");
		}
		
		
	}

}

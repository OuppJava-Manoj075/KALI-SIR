package gov.in.oupp.tranning.corejavatranning.basicPracticalAssignment;
import java.util.*;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter nother number");
		int num2 = sc.nextInt();
		
		int choice = 0 ;
		do {
			System.out.println("1. add two element\n 2. substract the two number\n"
					+ "3.multiply two number\n 4.divided two number \n 5.exit");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				int sum = num1+num2;
				System.out.println("The sum is "+sum);
				break;
			case 2:
				int substract = num1 - num2;
				System.out.println("The substract is"+substract);
				break;
			case 3:
				int multiply = num1 * num2;
				System.out.println("The multiply is"+multiply);
				break;
			case 4:
				int divided = num1 / num2;
				System.out.println("The substract is"+divided);
				break;
			
			case 5:
				System.out.println("Thank for visiting calculator");
			}
			
			
		}while(choice != 5);
		
	}

}

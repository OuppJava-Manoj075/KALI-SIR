package gov.in.oupp.tranning.corejavatranning.basicPracticalAssignment;
import java.util.*;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		int duplicate = number;
		int sum = 0 ;
		while(duplicate != 0) {
			int remander = duplicate % 10;
			int cal = remander * remander * remander;
			sum += cal;
			duplicate /= 10;
		}
		
		if(sum == number) {
			System.out.println("Number is Amstrong");
		}else {
			System.out.println("NUmber is not Amstrong");
		}
	}

}

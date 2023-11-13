package gov.in.oupp.tranning.corejavatranning.basicPracticalAssignment;
import java.util.*;

public class FibbonacciSeries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Fibbonaci Number you want");
		int num = sc.nextInt();
		
		int ans = find_fibbo(num);
		System.out.println("the  fibbonaci sequence is "+ans);
	}
	
	public static int find_fibbo(int num) {
		if(num < 2) return num;
		
		return find_fibbo(num-1)+find_fibbo(num-2);
	}

}

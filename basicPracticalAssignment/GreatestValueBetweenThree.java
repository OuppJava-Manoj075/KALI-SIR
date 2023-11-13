package gov.in.oupp.tranning.corejavatranning.basicPracticalAssignment;
import java.util.*;

public class GreatestValueBetweenThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		for(int i=0 ; i < 3 ; i++) {
			System.out.println("Enter the "+i+" value");
			int val = sc.nextInt();
			pq.add(val);
			
		}
		
		System.out.println("The heighest among them is "+pq.remove());
		

	}

}

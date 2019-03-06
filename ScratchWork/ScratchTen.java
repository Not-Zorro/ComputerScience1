package ComputerScicence1.Assignments;

import java.util.*;

public class ScratchTen{
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		int subCount = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Do you have anymore inputs? (Enter 'N' or 'n' to end): ");
		char ans = input.next().charAt(0); 
		while(ans != 'N' && ans != 'n'){

			System.out.println("Enter Grade Points: ");
			int points = input.nextInt();
			sum += points;
			subCount++;
			System.out.println("Do you have anymore inputs? (Enter 'N' or 'n' to end: ");
			ans = input.next().charAt(0); 
		}
		avg = sum/subCount;
		System.out.println("Avg = " + avg);
	}
}
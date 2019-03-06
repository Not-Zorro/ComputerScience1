package ComputerScicence1.Assignments;

import java.util.*;

public class Ex_1{
	public static void main(String[] args) {
		Scanner ins = new Scanner(System.in);
		//Age Prompt
		System.out.print("How old are you?: ");
		int age = ins.nextInt();
		//Prompt for Months they want the membership
		System.out.print("How many months would you like the service?: ");
		int months = ins.nextInt();
		//Price prompt
		int price = 0;
		int total = 0;
		if (age <= 0 || months <= 0){
			System.out.print("Values are not avalible.");
		}

		else if (age <= 18){
			price = 15;
		}

		else if (age <= 64 && age >= 19){
			price = 25;
		}

		else if (age >= 65){
			price = 20;
		}
		else{
			System.out.print("Not valid inputs.");
		}

		if (age <= 0 || months <= 0){
		}
		
		else{
		total = (price * months);
		System.out.print("The cost for the time frame will be $" + total +
			" at the rate of $" + price + " a month.");
		}


	}
}
import java.util.*;

public class Ex_2{
	public static void main(String[] args) {
		//Scanner for input
		Scanner nice = new Scanner(System.in);
		System.out.println("Enter your age: ");
		// Quantity Variable
		int age = nice.nextInt();
		System.out.println("Enter Subtotal: ");
		//Unit Price variable and getting the Total amount for Quant and Price
		double subtotal = nice.nextDouble();
		double discount = 0;
		double netCost = 0;
		//Non Seniors
		if (age <= 0){
			System.out.print("Values are not avalible."); 
		}
		else if (age >= 55 && age <= 64){
			System.out.println("10% Discount!!!");
			discount = subtotal - (subtotal * .1);
			netCost = discount;
		}

		else if (age >= 65 && age <= 74){
			System.out.println("15% Discount!!!");
			discount = subtotal - (subtotal * .15);
			netCost = discount;
		}

		else if (age >= 75){
			System.out.println("20% Discount!!!");
			discount = subtotal - (subtotal * .2);
			netCost = discount;
		}
		else{
			System.out.println("No discount for non seniors.");
			netCost = subtotal;
		}
		if (age <= 0){
		}
		
		else{
			System.out.printf("Subtotal is $%4.2f", subtotal);
			System.out.println("");
			System.out.printf("Net Cost is $%4.2f", netCost);
		}
	}
}
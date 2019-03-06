import java.util.*;
/* 
*  @ David Lopez
*  @ 2/13/19
*  @ Create a program for discounts
*/
public class ScratchFour{
	public static void main(String[] args) {
		//Scanner for input
		Scanner nice = new Scanner(System.in);
		System.out.println("Enter Quantity");
		// Quantity Variable
		int quant = nice.nextInt();
		System.out.println("Enter Unit Price");
		//Unit Price variable and getting the Total amount for Quant and Price
		double unitPrice = nice.nextDouble();
		double amount = quant * unitPrice;
		double discount = 0;
		double netCost = 0;
		//Statement for discount for prices over $300
		if (amount >= 300){
			System.out.println("5% Discount!!!");
			discount = amount - (amount * .05);
			netCost = discount;
		}
		//Statement for discount for prices from $200-$299
		else if (amount >= 200){
			System.out.println("2.5% Discount!!!");
			discount = amount - (amount * .025);
			netCost = discount;
		}
		//Statement for no discounts for prices under $200
		else{
			netCost = amount;
		}
		System.out.printf("Subtotal is $%4.2f", amount);
		System.out.println("");
		System.out.printf("Net Cost is $%4.2f", netCost);
	}
}
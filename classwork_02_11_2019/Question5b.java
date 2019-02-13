import java.util.*;
public class Question5b {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number to refelct a month of the year: ");
		int month = keyboard.nextInt();

		if(month == 1) {
			System.out.print("January");
		}
		else if (month == 2){
			System.out.print("Febuary");
		}
		else if (month == 3){
			System.out.print("March");
		}
		else if (month == 4){
			System.out.print("April");
		}
		else if (month == 5){
			System.out.print("May");
		}
		else if (month == 6){
			System.out.print("June");
		}
		else if (month == 7){
			System.out.print("July");
		}
		else if (month == 8){
			System.out.print("August");
		}
		else if (month == 9){
			System.out.print("September");
		}
		else if (month == 10){
			System.out.print("October");
		}
		else if (month == 11){
			System.out.print("November");
		}
		else if (month == 12){
			System.out.print("December");
		}
		else{
			System.out.print("Not a valid month.");
		}
}
}
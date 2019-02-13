//package classwork_02_11_2019;
import java.util.*;
public class Question2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a lower range: ");
		int low = keyboard.nextInt();

		System.out.print("Enter a upper range: ");
		int high = keyboard.nextInt();

		System.out.print("Enter a number you need to compare: ");
		int num = keyboard.nextInt();

		if (num >= low && num <= high){
			System.out.print("The number is in the range");
		}
		else{
			System.out.print("The value is outside the range");
		}
}
}
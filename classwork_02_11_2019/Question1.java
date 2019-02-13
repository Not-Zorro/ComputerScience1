//package classwork_02_11_2019;
import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a whole number: ");

		int num = keyboard.nextInt();
		if (num % 2 == 0) {
			System.out.print("The number is even");
		}
		else{
			System.out.print("The number is odd");
		}
}	
}	
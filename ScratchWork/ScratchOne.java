import java.util.*;

public class ScratchOne{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int num1 = keyboard.nextInt();

		System.out.println("Enter number 2: ");
		int num2 = keyboard.nextInt();

		int total = num1 + num2;

		System.out.println("The sum is " + total);
	}
}


import java.util.*;

public class Ex_4 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter your grade: ");
		double score = keyboard.nextInt();

		if (score >= 90.0)
			System.out.print("A");

		else if (score >= 80.0)
 			System.out.print("B");

		else if (score >= 70.0)
 			System.out.print("C");

		else if (score >= 60.0)
 			System.out.print("D");

		else
 			System.out.print("F");
}
}
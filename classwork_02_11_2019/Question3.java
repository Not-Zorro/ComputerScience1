//package classwork_02_11_2019;
import java.util.*;
public class Question3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Some text: ");
		String s_1 = keyboard.nextLine();

		System.out.print("Enter some more text: ");
		String s_2 = keyboard.nextLine();
		if(s_1.equals(s_2)) {
			System.out.print("The text is the same.");
		}
		else{
			System.out.print("The text is not the same.");
		}
}
}
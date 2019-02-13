import java.util.*;
public class Question4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your seat loacation code: ");
		int slc = keyboard.nextInt();
		switch(slc) {
			case 1: System.out.print("Location: Orchestra, Price: 40"); break;
			case 2: System.out.print("Location: Mezzanine, Price: 30"); break;
			case 3: System.out.print("Location: Balcony, Price: 15"); break;
			default: System.out.print("Not a valid location code."); break;
		}
}
}
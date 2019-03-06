import java.util.*;

public class Ex_3{
	public static void main(String[] args) {
		Scanner comp = new Scanner(System.in);
		System.out.print("How many years have you worked for us?: ");
		double years = comp.nextDouble();
		//
		System.out.print("What was your salary this year?: ");
		double sal = comp.nextDouble();
		//
		double bonus = 0;
		double tfy = 0;

		if (years <= 0 || sal <= 0){
			System.out.print("Values are not avalible.");
		}
		else if (years < 5){
			System.out.println("2% bonus!");
			bonus = sal * .02;
			tfy = sal + (bonus);
		}
		else if (years <= 9 && years >= 5){
			System.out.println("4% bonus!");
			bonus = sal * .04;
			tfy = sal + (bonus);
		}
		else if (years <= 19 && years >= 10){
			System.out.println("7% bonus!");
			bonus = sal * .07;
			tfy = sal + (bonus);
		}
		else if (years >= 20){
			System.out.println("12% bonus!");
			bonus = sal * .12;
			tfy = sal + (bonus);
		}
		else{
			System.out.print("Not Valid Input.");
		}
		if (years <= 0 || sal <= 0){
		}
		
		else{
		System.out.printf("Bonus is $%4.2f", bonus);
		System.out.println("");
		System.out.printf("Salary + Bonus is $%4.2f", tfy);
		}
	}
}
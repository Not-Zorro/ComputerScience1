import java.util.*;
public class ScratchThree{
	public static void main(String[] args) {
		Scanner atm = new Scanner(System.in);
		//Global Variables
		final int DEPOSIT_INIT = 500;
		int depos = 0;
		int with = 0;
		int currentbal= 0;
		int dpsq = 0;
		//Menu
		System.out.println("Wells Fargo");
		System.out.println("1: Deposit");
		System.out.println("2: Withdraw");
		System.out.println("3: Statement");  
		System.out.println("4: Quit");
		dpsq = atm.nextInt();
		//Conditions
		switch(dpsq) {
			case 1: System.out.println("Current balance: " + DEPOSIT_INIT);
				System.out.print("How much would you like to deposit?: ");
				depos = atm.nextInt();
				currentbal = DEPOSIT_INIT + depos;
				System.out.println("New balance is: " + currentbal); break;

			case 2: 
			{
				System.out.print("How much would you like to withdraw?: ");
				with = atm.nextInt();
				if (with < DEPOSIT_INIT && with > 0){
				currentbal = DEPOSIT_INIT - with;
				System.out.println("New balance is: " + currentbal);
				}
				else{
					System.out.println("Not Enough Funds");
				}
			break;
			}

			case 3:
			{

				System.out.print("Current balance: " + currentbal); break;
			}

			case 4: 
			{ 
				System.out.print("Goodbye!"); break;
			}
			default: System.out.print("Not a Valid Input"); break;
		}
	}
}
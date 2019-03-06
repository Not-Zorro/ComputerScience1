import java.util.*;

public class ScratchNine{
	public static void main(String[] args) {
		int a = 1;
		int sumEven = 0;
		int sumOdd = 0;
		while(a<=100){
			if(a % 2 == 0){
				sumEven += a;
			}
			else{
				sumOdd +=a;
			}
			a += 1;
		}
		System.out.println("Even sum is " + sumEven);
		System.out.println("Odd sum is " + sumOdd);
	}
}
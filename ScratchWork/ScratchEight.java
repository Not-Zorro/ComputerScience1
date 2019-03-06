import java.util.*;


class ScratchEight{
	public static void main(String[] args) {
		int i = 1;
		while(i <= 100){
			System.out.println(i);
			i += 1;
			if(i == 90){
				continue;
			}
		}
		System.out.println(i);
	}
}
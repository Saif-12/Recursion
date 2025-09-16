package recursion;

import java.util.Scanner;

public class NthStair {

	public static void main(String[] args) {
		
		System.out.print("Enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		System.out.println(nthStair(num));

	}

	private static int nthStair(int num) {
		
		if(num==1) return 1;
		if(num==2) return 1;
		if(num==3) return 2;
		
		return nthStair(num-1)+nthStair(num-3);
		
	}

}

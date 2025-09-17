package recursion.subsets;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		
		System.out.print("Enter a number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.print("Enter a number");
		int b = s.nextInt();
		System.out.println(findHcf(a,b));

	}

	private static int findHcf(int a, int b) {
		
				if(b%a==0) return a;
		
		return findHcf(b%a, a);
	}

}

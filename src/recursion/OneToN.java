package recursion;

import java.util.Scanner;

public class OneToN {

	public static void main(String[] args) {

		System.out.print("Enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		printNto1(num);

	}

	public static void printNto1(int n) {
		int a=1;
		if (n == 0)
			return;

		printNto1(n - 1);
		System.out.println(n);
		

		
	}

}

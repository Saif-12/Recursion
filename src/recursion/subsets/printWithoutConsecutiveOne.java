package recursion.subsets;

import java.util.Scanner;

public class printWithoutConsecutiveOne {

	public static void main(String[] args) {
		System.out.print("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		printWithoutConsecutiveOne("", n);

	}

	private static void printWithoutConsecutiveOne(String ans, int num) {
		
		int n=ans.length();
		if(n==num)
		{
			System.out.println(ans);
			return;
		}
		
		if(n==0 || ans.charAt(n-1)=='0')
		{
			printWithoutConsecutiveOne(ans+0, num);
			printWithoutConsecutiveOne(ans+1, num);
		}else
		{
			printWithoutConsecutiveOne(ans+0, num);
		}
		
	}

}

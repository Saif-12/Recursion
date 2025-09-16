package recursion;

import java.util.Scanner;

public class printSum {

	public static void main(String[] args) {
		System.out.print("Enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		//printSum(num, 0);
		
		System.out.println(sum(num));

	}

//	public static void printSum(int num, int sum) {
//
//		if (num == 0) {
//			System.out.println(sum);
//			return;
//		}
//		printSum(num - 1, sum + num);
//
//	}
	
	public static int sum(int num)
	{
		
		
		if(num==0||num==1)
			{return num;}
		
		return num+sum(num-1);
	}

}

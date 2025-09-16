package recursion;

import java.util.Scanner;

public class Nto1 {
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		
		printNto1(num);
		
	}
	
	
	public static void printNto1(int n)
	{
		if(n==0) return;
		
		System.out.println(n);
		
		printNto1(n-1);
	}

}

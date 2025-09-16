package recursion;

import java.util.Scanner;

public class RatMaze {

	public static void main(String[] args) {

		System.out.print("Enter a n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print("Enter a m");
		int m = s.nextInt();

		// System.out.println(maze(1,1,m,n));
		System.out.println(maze2(m, n));

	}

	private static int maze(int firstRow, int firstCol, int m, int n) {

		if (firstRow == m || firstCol == n)
			return 1;

		int rightWays = maze(firstRow, firstCol + 1, m, n);
		int downWays = maze(firstRow + 1, firstCol, m, n);

		return rightWays + downWays;

	}

	private static int maze2(int m, int n) {

		if (m == 1 || n == 1)
			return 1;

		int rightWays = maze2(m, n - 1);
		int downWays = maze2(m - 1, n);

		return rightWays + downWays;

	}

}

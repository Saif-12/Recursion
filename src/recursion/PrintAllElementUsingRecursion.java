package recursion;

public class PrintAllElementUsingRecursion {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		printUsingRecursion(arr,0);
	}

	private static void printUsingRecursion(int[] arr,int idx) {
		
		if(idx==arr.length) return;
		System.out.println(arr[idx]);
		printUsingRecursion(arr, idx+1);
		
		
	}
	
	
	
	 

}

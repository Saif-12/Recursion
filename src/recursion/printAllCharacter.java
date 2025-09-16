package recursion;

public class printAllCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdefg";
		
		printChar(str,0);

	}

	private static void printChar(String str, int idx) {
		
		if(str.length()==idx) return;
		
		
		printChar(str, idx+1);
		System.out.println(str.charAt(idx));
		
		
	}

}

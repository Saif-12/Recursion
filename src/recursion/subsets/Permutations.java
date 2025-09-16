package recursion.subsets;

public class Permutations {

	public static void main(String[] args) {
		
		String str="abc";
		permutation("", str);

	}

	private static void permutation(String ans, String str) {
		
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			String left=str.substring(0, i);
			String right=str.substring(i+1);
			permutation(ans+c, left+right);
		}
		
	}

	

}

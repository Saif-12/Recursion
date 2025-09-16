package recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	static List<String> al=new ArrayList<String>();
	public static void main(String[] args) {
		
		
		String str="sai";
		
		printSubset(str,0,"");
		
		System.out.println(al);

	}

	private static void printSubset(String str, int idx, String ans) {
		
		if(str.length()==idx)
		{
			al.add(ans);
			return ;
		}
		char c=str.charAt(idx);
		
		printSubset(str, idx+1, ans);
		printSubset(str, idx+1, ans+c);
		
		
	}

}

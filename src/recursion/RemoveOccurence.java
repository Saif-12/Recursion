package recursion;

public class RemoveOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Saif Khan";
		char c='a';
		String ans="";
		System.out.println(removeOccurence(str,c,ans,0));
	}

	private static String removeOccurence(String str, char c,String ans,int idx) {
		
		if(str.length()==idx) return ans;
		
		if(str.charAt(idx)!=c) ans+=str.charAt(idx);
		
		return removeOccurence(str, c, ans, idx+1);
		
		
		
		
	}

}

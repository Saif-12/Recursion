package recursion.subsets;

public class merge2SortedArrays {
	
	public static void main(String[] args) {
		
		int arr[]= {10,30,50,70,80};
		int brr[]= {20,40,70,75};
		int ans[]=new int[arr.length+brr.length];
		
		int i=0,j=0,k=0;
		int n=arr.length;
		int m=brr.length;
		while(i<n && j<m)
		{
			if(arr[i]<brr[j])
			{
				ans[k++]=arr[i++];
			}else if(arr[i]>brr[j])
			{
				ans[k++]=brr[j++];
			}else
			{
				ans[k++]=arr[i++];
			}
		}
		for(;i<n;i++)
		{
			ans[k++]=arr[i];
		}
		for(;j<m;j++)
		{
			ans[k++]=brr[j];
		}
		
		for(int a: ans) System.out.println(a);
	}

}

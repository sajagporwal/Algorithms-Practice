public class binary
{
	public static void main(String[] args)
	{
		int a[]={2,3,4,5,6,7,8,9,10,11,12};
		int low=0;
		int high=10;
		int c = binarys(a,low,high,5);
		System.out.println(c);
	}
	public static int binarys(int a[],int low,int high,int key)
	{
		int mid;
		if(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==key)
			{
				return mid;
			}
			else if(key<a[mid])
			{
			return binarys(a,low,mid-1,key);
			}
			else
			{
		    return binarys(a,mid+1,high,key);
			}
		}
		else
			return -1;
	}
}

public class linear {
public static void main(String[] args)
{
	int c=0;
	int a[]={2,3,4,5,6,7,8,9,10};
    c=linears(a,0,8,12);
	System.out.println(c);
}
public static int linears(int a[],int low,int high,int key)
{
	if(a[low]==key)
	{
		return 1;
	}
	else if(low>=high)
	{
		return -1;
	}
	else{
	return linears(a,low+1,high,key);
	}
}
}


public class selection {
public static void main(String[] args)
{
	int a[]={45,66,32,1,22,16,47};
	int low=0;
	int high=6;
	selections(a,low,high);
	for(int i=0;i<7;i++)
	{
		System.out.print(a[i] + " " );
	}
}
public static void selections(int a[],int low,int high)
{
	int i,j,imin,temp;
	for(i=0;i<high;i++)
	{
		imin=i;
		for(j=i+1;j<=high;j++)
		{
			if(a[imin]>a[j])
			{
			imin=j;
			}
		}
		temp=a[i];
	    a[i]=a[imin];
		a[imin]=temp;
	}
}
}

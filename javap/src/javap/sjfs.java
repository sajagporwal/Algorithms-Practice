// short job first scheduling program

package javap;
import java.util.*;
public class sjfs {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
    int[] bt=new int[20];
    int[] wt=new int[20];
    int[] arrit=new int[20];
    int[] pr=new int[20];
    int n,i,pos,temp,j;
    float avgwt=0,totalwt;
    System.out.println("enter the number of processes u want to take: ");
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
        System.out.println("enter the processes and their arrival time:\n\n");
        System.out.println("process number:\t");
        pr[i]=sc.nextInt();
        System.out.println("arrival time:\n");
        arrit[i]=sc.nextInt();
        System.out.println("enter burst time:\t");
        bt[i]=sc.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
        pos=i;
        for(j=i+1;j<n;j++)
        {
            if(arrit[pos]>arrit[j])
            {
                pos=j;
            }
        }
        temp=arrit[i];
        arrit[i]=arrit[pos];
        arrit[pos]=temp;

        temp=pr[i];
        pr[i]=pr[pos];
        pr[pos]=temp;

        temp=bt[i];
        bt[i]=bt[pos];
        bt[pos]=temp;


    }

    for(i=1;i<n-1;i++)
    {
        pos=i;
        for(j=i+1;j<n;j++)
        {
            if(bt[pos]>bt[j])
            {
                pos=j;
            }
        }
        temp=arrit[i];
        arrit[i]=arrit[pos];
        arrit[pos]=temp;

        temp=pr[i];
        pr[i]=pr[pos];
        pr[pos]=temp;

        temp=bt[i];
        bt[i]=bt[pos];
        bt[pos]=temp;


    }
    wt[0]=0;
    for(i=1;i<n;i++)
    {
        wt[i]=0;
        for(j=0;j<i;j++)
            wt[i]+=bt[j];
        wt[i]=wt[i]-arrit[i];
    }
    totalwt=0;
    for(i=0;i<n;i++)
    totalwt+=wt[i];
    avgwt=totalwt/n;
    System.out.println("\n\n Average waiting time: " + avgwt);

}
}

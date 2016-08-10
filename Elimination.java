package rat;
import java.util.Scanner;
public class Elimination {
	public static void duplicate(int b[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
		for(int j=i;j<n;j++)
		{
			if(b[i]==b[j+1])
			{
				for(int k=j+1;k<n;k++)
				{
				b[k]=b[k+1];
				
				}
				--n;
				j--;
				
		     		
			}
			
		}
		}
		for(int i=0;i<n;i++)
			System.out.println(b[i]);
		
		
	}
	public static void main(String[] args) {
	
	int a,n,i,j;
	int [] b=new int[10];
	Scanner S=new Scanner(System.in);
	System.out.println("How many numbers to be enter");
	n=S.nextInt();
	System.out.println("Enter "+n+"Numbers");
	for(i=0;i<n;i++)
	{
		b[i]=S.nextInt();
	}
	duplicate(b,n);
	}
}

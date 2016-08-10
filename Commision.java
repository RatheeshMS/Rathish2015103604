package rat;
import java.util.Scanner;
public class Commision {
	public void make(int gross)
	{
		   g=(gross*9)/100;
		   e=g+200;
		   if(e>=200&&e<=299)
		   {
			   count[0]+=1;
			  //System.out.println("print"+count[0]);
		   }
		   else if(e>=300&&e<=399)
		   {
			   count[1]+=1;
		   }
		   else if(e>=400&&e<=499)
		   {
			   count[2]+=1;
		   }
		   else if(e>=500&&e<=599)
		   {
			   count[3]+=1;
		   }
		   else if(e>=600&&e<=699)
		   {
			   count[4]+=1;
		   }
		   else if(e>=700&&e<=799)
		   {
			   count[5]+=1;
		   }
		   else if(e>=800&&e<=899)
		   {
			   count[6]+=1;
		   }
		   else if(e>=900&&e<=999)
		   {
			   count[7]+=1;
		   }		  
		   else if(e>=1000)
		   {
			   count[8]+=1;
		   }
			}
	public void disp()
	{
		
		System.out.println("$200 to 299:"+count[0]+"employees");
		System.out.println("$300 to 399:"+count[1]+"employees");
		System.out.println("$400 to 499:"+count[2]+"employees");
		System.out.println("$500 to 599:"+count[3]+"employees");
		System.out.println("$600 to 699:"+count[4]+"employees");
		System.out.println("$700 to 799:"+count[5]+"employees");
		System.out.println("$800 to 899:"+count[6]+"employees");
		System.out.println("$900 to 999:"+count[7]+"employees");
		System.out.println("$1000 under over:"+count[8]+"employees");
		

	}
	public int a;
	public int g,e;
	static int x;
	public static int i; 
	int[] count=new int[9];
	int[] gross_salary=new int[6];
    public int employee;
	public static void main(String[] args) {
    Scanner S=new Scanner(System.in);
    Commision obj=new Commision();
    int [] count=new int[8];
    do
    {
    	System.out.println("How many employees");
    	int employee=S.nextInt();
    	System.out.println("Enter the gross salary for"+employee+"employees");
    	for(i=0;i<employee;i++)
    	{
    	int gross_salary=S.nextInt();
    	if(gross_salary>=0)
    	{
    	obj.make(gross_salary);
    	}   
    	else 
    		System.out.println("Don't enter a negative value");
    	}
    	obj.disp();
    	
    	System.out.println("press '1' to continue");
     x=S.nextInt();
    	}while(x==1);
	}
}

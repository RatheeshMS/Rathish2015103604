package rat;
import java.util.Scanner;
public class Employee {
	public double m_salary,y_salary,a,b,c;
	public String[] name1;
	public String[] name2;
	public void make(double m_salary)
	{
		a=m_salary*0.1;
		System.out.println("Extra monthly salary(9% in monthly salary) is"+a);
		b=(a+m_salary)*12;
		System.out.println("The yearly salary is:"+b);
	}
	public void disp_detail(String name1,String name2,double m_salary)
	{
		System.out.println("Employee name:"+name1+"\t"+name2);
		//System.out.println("Employee name:"+name2);
		System.out.println("Monthly salary is:"+m_salary);
	}
	Employee()
	{
		name1=null;
		name2=null;
		m_salary=0;
	}

}

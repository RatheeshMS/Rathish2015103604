package rat;

import java.util.Scanner;

public class EmployeeTest extends Employee{
	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		Employee obj=new Employee();
		System.out.println("Enter the employee first name");
		String name1=A.next();
		System.out.println("Enter the employee second name");
		String name2=A.next();
		System.out.println("Enter the employee monthly salary");
		double m_salary=A.nextInt();
		obj.disp_detail(name1,name2,m_salary);
		obj.make(m_salary);
		
		}


}

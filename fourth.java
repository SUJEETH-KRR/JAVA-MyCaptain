//Fifth My Captain java project
//Using Classes and Objects

import java.util.*;

class Employee
{
	void display(String name, int year, int salary,String addr)
	{
		System.out.println(name+" "+year+" "+addr);
	}
}
public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of data you want to add: ");
		int n = in.nextInt();
		Employee obj=new Employee();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Name: ");
			String name = in.next();
			System.out.println("Enter Year of Joining: ");
			int year = in.nextInt();
			System.out.println("Enter Salary: ");
			int salary = in.nextInt();
			System.out.println("Enter Adderss: ");
			String addr = in.next();
			
			obj.display(name,year,salary,addr);
		}
	}
}

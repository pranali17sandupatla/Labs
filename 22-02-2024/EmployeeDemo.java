/*3. Create a class named Employee with attributes name, employeeId, designation, and salary. Include a method calculateBonus() that returns 5% of the salary as bonus.
*/

import java.util.Scanner;
class Employee
{
	String name;
    int emp_id;//instance variable
    String designation;
    double salary;
	
	void getData()
	{
		System.out.println("Enter the Details of Empployee :");
		Scanner sc=new Scanner(System.in);// take input from user
		
		System.out.println("Enter the Emp name :");
		this.name=sc.next();
		
		System.out.println("Enter the Emp id :");
		this.emp_id=sc.nextInt();
		
		System.out.println("Enter the Emp designation :");
		this.designation=sc.next();
		
		System.out.println("Enter the Emp Salary :");
		this.salary=sc.nextInt();
	}
	void setData()//Creating setData method
	{
		System.out.println("Employee Name :"+this.name+"\nEmployee ID :"+this.emp_id+"\nDesignation :"+this.designation+"\nSalary :"+this.salary);
	}
	void calculateBonus()//creating a method
	{
		double bonus = 0.05 * salary; // 5% of the salary
        System.out.println("Bonus: " + bonus);
	}
}
class EmployeeDemo
{
	public static void main(String args[])
	{
		Employee e1=new Employee();//creating the object of Employee
		e1.getData();
		e1.setData();
		e1.calculateBonus();//calling method		
	}
}
/*
OUTPUT

D:\Anudip Capgemini>java EmployeeDemo
Enter the Details of Empployee :
Enter the Emp name :
Priya
Enter the Emp id :
101
Enter the Emp designation :
abc
Enter the Emp Salary :
50000
Employee Name :Priya
Employee ID :101
Designation :abc
Salary :50000.0
Bonus: 2500.0

*/
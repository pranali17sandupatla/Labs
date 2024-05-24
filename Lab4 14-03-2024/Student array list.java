/*
3. Create a class Student and implement array list and display details of student.
*/
import java.util.ArrayList;
class Student
{
	int id;//instance variables
	String name;
	int age;
	int marks;
	
	//creating the parameterized constructor
	public Student(int id, String name, int age, int marks)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public void printInfo()//Creating method of student class
	{
		System.out.println("ID :"+this.id);
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
		System.out.println("Marks :"+this.marks);
	}
}
class StudentPractical3
{
	public static void main(String args[])
	{
	// Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Adding student details to the list
        students.add(new Student(103,"Jaya",21,92));	
		students.add(new Student(104,"Prana", 22,98));
		
	 // Displaying student details 
        System.out.println("Student Details:");
        for (Student student : students) {
            student.printInfo();
			
		}
	}
}
	
/*

OUTPUT

D:\Anudip Capgemini>java StudentPractical3
Student Details:
ID :103
Name :Jaya
Age :21
Marks :92
ID :104
Name :Prana
Age :22
Marks :98
*/	
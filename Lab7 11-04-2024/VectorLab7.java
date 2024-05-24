//1. Write a program using Vector to store the list of students details and print the details.

package com.Lab7;

import java.util.Vector;

class Student {
    String name;//instance veriable
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return "\nName: " + name + " \nAge: " + age + " \nGrade: " + grade;
    }
}

public class VectorLab7 {

	public static void main(String[] args)
	{
		Vector<Student> s = new Vector<>();

        // Adding students
        s.add(new Student("Pranali", 22, "A+"));
        s.add(new Student("Jyoti", 23, "A"));
        s.add(new Student("Grace", 21, "B+"));

        // Printing student details
        for (Student student : s) {
            System.out.println(student);
        }
    }
}
/*
Name: Pranali 
Age: 22 
Grade: A+

Name: Jyoti 
Age: 23 
Grade: A

Name: Grace 
Age: 21 
Grade: B+
*/
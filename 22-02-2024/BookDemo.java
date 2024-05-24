/* 2. Create a class named Book with attributes title, author, ISBN, and price. Include methods to get and set the attributes
*/

import java.util.Scanner;
class Book
{
	String title;//instance variable
	String author;
	int ISBN;
	int price;
	
	void get()//Create a get method
	{
		System.out.println("Enter the Details of Book ");
		
		Scanner sc=new Scanner(System.in);//taking user input
		
		System.out.println("Enter Title of book :");//pritn stmt
		this.title=sc.next();
		
		System.out.println("ENter the Author name :");
		this.author=sc.next();
		
		System.out.println("Enter the ISBN number of Book :");
		this.ISBN=sc.nextInt();
		
		System.out.println("Enter the price of the book :");
		this.price=sc.nextInt();
	}
	void setData()//Creating setData method
	{
		System.out.println("Title :"+this.title+"\nAuthor name :"+this.author+"\nISBN :"+this.ISBN+"\nPrice :"+this.price);
	}
}
class BookDemo
{
	public static void main(String args[])//main method of class
	{
		Book b1=new Book();//creating the object of book class
		b1.get();//call get method
		b1.setData();//calling method 
	}
}

/*

D:\Anudip Capgemini>java BookDemo
Enter the Details of Book
Enter Title of book :
Happy
ENter the Author name :
Abc
Enter the ISBN number of Book :
12345
Enter the price of the book :
500
Title :Happy
Author name :Abc
ISBN :12345
Price :500

*/
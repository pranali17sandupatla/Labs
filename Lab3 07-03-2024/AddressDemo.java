/*Practical3 
1. Define a class Address representing an address with attributes such as street, city, state, and zip code. Provide constructors to initialize these attributes.
 */
import java.util.Scanner;
class Address
{
	String street;//attributes of address
	String city;
	String state;
	int zip;
	
	Address()//no-argu constructor
	{
		//take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Street name :");
		this.street=sc.next();
		System.out.println("Enter the city name :");
		this.city=sc.next();
		System.out.println("Enter the state name :");
		this.state=sc.next();
		System.out.println("Enter the zip name :");
		this.zip=sc.nextInt();
	}
	
	public void printData()//creating method
	{
		System.out.println("Street :"+this.street+" City :"+this.city+" State :"+this.state+" Zip :"+this.zip);
	}
}
class AddressDemo
{
	public static void main(String args[])
	{
        // Create an Address object using the parameterized constructor
        Address a = new Address();//creating object of address class

        a.printData();//calling method 
    }
}

/*

D:\Anudip Capgemini>java AddressDemo
Enter the Street name :
solapur
Enter the city name :
solapur
Enter the state name :
maharashtra
Enter the zip name :
413001
Street :solapur City :solapur State :maharashtra Zip :413001
*/
/*
1. Create two thread.one thread is finding the average of the first 10 numbers and another thread is 
printing the square of the number stored in array arr-(1,20,50,15,30) and make sure both threads 
can execute simultaneously.
*/

package com.threading;

class MyThread1 extends Thread {
	
	public void run()
	{
		int sum=0;
		for(int i=1;i<=10;i++)//printing 1 to 10 average
		{
			sum +=i; 
		}
		 double average = sum / 10.0;//average of sum 1 to 10
		 System.out.println("Average of first 10 numbers :"+average);//printing 
	}
}
public class Practical4 
{
	public static void main(String[] args) //creating main Thread 
	{
		MyThread1 t1=new MyThread1();//creating child thread
		t1.start();//calling run method of extending thread class
		
		int[] arr = {1, 20, 50, 15, 30};//array element 
		for(int num : arr) {
			System.out.println("Square of Number :"+ num +":"+ num * num);//printing array num square
		}
	}
}

/*
OUTPUT :

Square of Number :1:1
Square of Number :20:400
Square of Number :50:2500
Square of Number :15:225
Square of Number :30:900
Average of first 10 numbers :5.5

*/

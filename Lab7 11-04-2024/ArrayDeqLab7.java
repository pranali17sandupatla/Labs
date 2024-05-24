//2. Write a program using ArrayDeque to add book names and add,delete the values from both ends of queue.

package com.Lab7;

import java.util.ArrayDeque;

public class ArrayDeqLab7 {

	public static void main(String[] args) 
	{
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.addLast("Boo1");
        ad.addLast("Book2");
        ad.addLast("Book3");
        // Printing the deque
        System.out.println("Deque after adding books: " + ad);
     // Adding a book 1st
        ad.addFirst("Book00");
        
        System.out.println("After adding a book at the front: " + ad);
     // Removing a book front
        String removedBook = ad.removeFirst();
        
        System.out.println("Removed book from the front: " + removedBook);
        
        System.out.println("After removing: " + ad);
        
        removedBook = ad.removeLast();
        System.out.println("Removed book from the end: " + removedBook);
        
        System.out.println("After removing a book from the end: " + ad);

	}

}
/*
Deque after adding books: [Boo1, Book2, Book3]
After adding a book at the front: [Book00, Boo1, Book2, Book3]
Removed book from the front: Book00
After removing: [Boo1, Book2, Book3]
Removed book from the end: Book3
After removing a book from the end: [Boo1, Book2]
*/
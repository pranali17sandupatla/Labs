//1.	Write a Java program to check whether a HashMap contains key-value mappings (empty) or not.

package com.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMapLab6 {

	public static void main(String[] args) {
		
		Map m=new HashMap();
		m.put(1,"Pranali");
		m.put(2,"Grace");
		m.put(3,"Nandu");
		m.put(4,"Akki");
		m.put(5,null);
		System.out.println("Hash Map elements :"+m);
		boolean res1=m.isEmpty();//check stack is empty or Not -->false
		System.out.println("Hash Map is empty or Not :"+res1);//print False because is not empty
		

	}

}

/*

OUTPUT :
	
	Hash Map elements :{1=Pranali, 2=Grace, 3=Nandu, 4=Akki, 5=null}
	Hash Map is empty or Not :false
*/
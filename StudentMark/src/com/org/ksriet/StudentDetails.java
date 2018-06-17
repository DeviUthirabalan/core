package com.org.ksriet;

import java.util.Scanner;

public class StudentDetails {

	@SuppressWarnings("unused")
	public static void Student(String s[]){
		int Mark;
		String FirstName="firstName";
	}
		 
		@SuppressWarnings({ "unused", "resource" })
		public static  void main(String args[]){
			Scanner sc=new Scanner(System.in);
			String FirstName = sc.next();
			int Mark = sc.nextInt();
	
		if (Mark>400)
			System.out.println("Excellent");
		else 
			System.out.println("need to improve");	
		}
}

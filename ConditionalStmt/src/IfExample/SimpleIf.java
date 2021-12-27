package IfExample;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a value");
		
		int a= sc.nextInt();
		
		if(a>0) {
			if(a%2==0)
				System.out.println("number is positive and even");
			else
				
				System.out.println("number is positive and odd");
	
			
		}
			
			
			
	}

}

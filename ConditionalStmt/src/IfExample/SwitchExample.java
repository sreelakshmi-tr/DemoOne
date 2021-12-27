package IfExample;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter value");
		int a= sc.nextInt();
		
		switch(a%2) {
		
		case 1: System.out.println("Odd number");
		        break;
		        
		case 0:System.out.println("Even number");
                break;
         
        default:System.out.println("Invalid");
		
		}

	}

}

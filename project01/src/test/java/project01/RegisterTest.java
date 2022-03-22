package project01;

import java.util.Scanner;



public class RegisterTest {
	static Scanner sc=  new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Welcome to College Admission Site....");
		System.out.println("Enter your option 1 for register ");
		System.out.println("Enter your option 2 for login ");
		int option =sc.nextInt(); 
		
		
		if(option==1)
		{
			Register.registrationgettinginputs();
		}
		else if(option==2)
		{
			Register.logininputs();
		}
	}

}

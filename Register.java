package project01;

import java.util.Scanner;

import DAO.LoginDAO;
import DAO.RegisterDAO;
import logic.Check;
import logic.Login;
import model.Assign;
import com.mysql.cj.xdevapi.Schema.Validation;

import model.Assign;



public class Register {
	 static Scanner sc = new Scanner(System.in);
	   public static void registrationgettinginputs() throws Exception{
		   System.out.println("Enter your name");
		   String name=sc.next();
		   
		   System.out.println("enter 'user' or 'admin' ");
		   String userAdmin=sc.next();
		  
		   System.out.println("Enter your mobile number ");
		   String userMobileNumber=sc.next();
		  
		   System.out.println("enter your age");
		   int userAge=sc.nextInt();
		  
		   System.out.println("Enter the year of study(mention it as 1 or 2 or 3 or 4)");
		   int userYearOfStudy=sc.nextInt();
		   
		   System.out.println("Enter your 12th mark percentage (EX:88.80)");
		   float userMark=sc.nextFloat();
		   
		   System.out.println("enter your E-mail ID");
		   String userEmail=sc.next();
		  
		   System.out.println("enter your password");
		   String userPassword=sc.next();
		 
		   String  userAdmissionStatus="pending";
		   String userBranch="not selected";
		   Assign car=new Assign(name,userAdmin,userMobileNumber,userAge,userYearOfStudy,userMark,userEmail,userPassword,userAdmissionStatus,userBranch);
		   try
		   {
			   Check.validatingRegistration(car);
			   System.out.println("Now");
				System.out.println("if you want to go back to main page");
				Starter.selectregorad();
			   
		   }catch(Exception e)
		   {
			   System.out.println("error..!!"+e.getMessage());
			   e.printStackTrace();
		   }
		
		   
	   }
	   
public static void logininputs() throws Exception
{
	System.out.println("enter your email");
	String email=sc.next();
	System.out.println("enter your password");
	String password=sc.next();
	
	try
	{
	
	String mail=LoginDAO.loginValidatorUsingDatabase(email,password);
	Login.loginmail(mail);
	
	}catch(Exception e)
	{
		System.out.println("error..!!"+e.getMessage());
	}
	
	
}
}

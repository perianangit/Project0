package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import model.Assign;

public class ApplicantsDetailsDisplayDAO {
public static void listallapplicants()throws Exception
	
	{
	@SuppressWarnings("resource")
	Scanner obj0=new Scanner(System.in);
	System.out.println("enter email");
	String Emailid=obj0.next();
	PreparedStatement statement=null;
	ResultSet rs=null;
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	System.out.println(connection);
	String sc = "select * from revapergce where  user_email= ?";
	statement = connection.prepareStatement(sc);
	statement.setString(1,Emailid);
	rs = statement.executeQuery();
	while (rs.next()) 

	{
		String name = rs.getString("Name");
		String user_Admin=rs.getString("user_Admin");
		String user_MobileNumber=rs.getString("user_MobileNumber");
	     Integer user_Age=rs.getInt("user_Age");
	     Integer year=rs.getInt("user_YearOfStudy");
	     Float Mark=rs.getFloat("user_Mark");
		String user_email=rs.getString("user_email");
		String user_Password=rs.getString("user_Password");
		String branch=rs.getString("user_Branch");
		
	    
		String user_Admission_Status = null;
	// 1 row details => stored in 1 model object
	Assign allObj = new Assign(name, user_Admin, user_MobileNumber, user_Age, year, Mark, user_email, user_Password, user_Admission_Status, branch);
	System.out.println("Applicant Details"+"\nName:"+allObj.name+"\nUser_Admin:"+allObj.userAdmin+"\nUserMoblieNumber:"+allObj.userMobileNumber+"\nuserAge:"+allObj.userAge+"\nuseremail:"+allObj.userEmail+"\nuserPassword:"+allObj.userPassword+"\nuser_Admission_Status:"+allObj.userAdmissionStatus+"\nuser_Branch:"+allObj.userBranch);
	}
	connection.close();    
	}

}

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ApplicantsNameDisplayDAO {
	public static void listingApplicants() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		String user="user";
		String query = "SELECT name FROM revapergce WHERE user_Admin='"+user+"' ";
		Statement st = (Statement) connection.prepareStatement(query);
		ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
		String user1 = null;
		System.out.println("All Applicants are......");
		while(rs.next())
		{
		user1=rs.getString("name");
		System.out.println(user1);
		}
		connection.close();
	}
}

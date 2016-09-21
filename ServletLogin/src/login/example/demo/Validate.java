package login.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

public class Validate 
{
	public static boolean checkUser(String email, String password)
	{
		boolean st =false;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
	
			 PreparedStatement ps =con.prepareStatement("select * from register where email=? and password=?");
           
			 ps.setString(1, email);
			 ps.setString(2, password);
			 ResultSet rs =ps.executeQuery();
			 st = rs.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;
	}

}

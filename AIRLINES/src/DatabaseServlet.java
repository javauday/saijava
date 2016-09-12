

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/DatabaseServlet")
public class DatabaseServlet extends GenericServlet 
{
	
	Connection con;
	PreparedStatement p;
	
	String name, standard,university;
	int number;
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		
		try
		{
			name=request.getParameter("name");
			number=Integer.parseInt(request.getParameter("number"));
			standard=request.getParameter("standard");
			university=request.getParameter("university");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
			
			p=con.prepareStatement("insert into student values(?,?,?,?)");
			
			p.setString(1, name);
			p.setInt(2, number);
			p.setString(3, standard);
			p.setString(4, university);
			System.out.println("Executed");
			}
		catch(ClassNotFoundException c1)
		{
			System.out.println(c1.getMessage());
		}
		catch(SQLException sq)
		{
			System.out.println(sq.getMessage());
		}
		
	}

}

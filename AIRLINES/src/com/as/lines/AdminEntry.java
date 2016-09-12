package lines;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class AdminEntry
 */
@WebServlet("/AdminEntry")
public class AdminEntry extends GenericServlet
{
	RequestDispatcher dispatcher;
	String username,password,securitykey;
	PrintWriter p;
	
	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		username=request.getParameter("username");
		password=request.getParameter("password");
		securitykey=request.getParameter("securitykey");
		
		if((username.compareTo("admin")==0)&&(password.compareTo("admin")==0)&&(securitykey.compareTo("noix")==0))
		{
			dispatcher=request.getRequestDispatcher("html/PassangerDetails.html");
			dispatcher.forward(request, response);
		}
		else 
		{
			dispatcher=request.getRequestDispatcher("html/LoginError.html");
			dispatcher.include(request, response);
		}
	
		
	}

}

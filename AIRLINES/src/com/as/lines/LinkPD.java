package com.as.lines;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LinkPD
 */
@WebServlet("/LinkPD")
public class LinkPD extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String confirmationnumber=request.getParameter("confirmationnumber");
		
		System.out.println("First Name:"+ firstname);
		System.out.println("Last Name:"+ lastname);
		System.out.println("Confirmation Number:"+ confirmationnumber);
		

		request.getSession().setAttribute("firstname", firstname);
		request.getSession().setAttribute("lastname", lastname);
		request.getSession().setAttribute("confirmationnumber",confirmationnumber);
		
		response.sendRedirect("html/Information.html");
	}
}

	
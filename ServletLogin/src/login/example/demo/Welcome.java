package login.example.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Welcome extends HttpServlet
{
	protected void dopost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException
					{
		             response.setContentType("text/html");
		             PrintWriter out = response.getWriter();
		             out.println("Welcome user");
					}
}

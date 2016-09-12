package com.as.lines;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Infolink")
public class Infolink extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;
       

 	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
 	{
		
 		String flightname=request.getParameter("flightname");
 		String flightnumber=request.getParameter("flightnumber");
 		String departure=request.getParameter("departure");
 		String destination=request.getParameter("destination");
 		String date=request.getParameter("date");
 		
 		System.out.println("flightname:"+ flightname);
 		System.out.println("flightnumber:"+ flightnumber);
 		System.out.println("departure:"+ departure);
 		System.out.println("destination:"+ destination);
 		System.out.println("date:"+ date);
 		
 		request.getSession().setAttribute("flightname", flightname);
 		request.getSession().setAttribute("flightnumber", flightnumber);
 		request.getSession().setAttribute("departure", departure);
 		request.getSession().setAttribute("destination", destination);
 		request.getSession().setAttribute("date", date);

 		response.sendRedirect("jsp/Print.jsp");
 		
	}

}

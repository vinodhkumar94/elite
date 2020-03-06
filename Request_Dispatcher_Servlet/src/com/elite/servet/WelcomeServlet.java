package com.elite.servet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter output = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    output.println("<html><body bgcolor = 'cyan'>"+"<h1> Welcome "+ n +"  </h1>"+"</body></html>");
		output.flush();
		output.close(); 
	    }  
	  

}

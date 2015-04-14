
package com.niren.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="LoginServlet", urlPatterns={"jsp/Register"},
initParams={@WebInitParam(name="simpleParam", value="paramValue") } )
public class LoginServlet extends HttpServlet {

	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        PrintWriter out = response.getWriter();
	        String simpleParam = getServletConfig().getInitParameter("simpleParam");
	            out.println("Hello World "+simpleParam);
	                out.close();
	    }
	  
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	         doGet(request,response);
	         PrintWriter out = response.getWriter();
		        String simpleParam = getServletConfig().getInitParameter("simpleParam");
		            out.println("Hello World "+simpleParam);
		                out.close();
	    }
}

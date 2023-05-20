package com.exam.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello.do")
public class HelloServlet extends HttpServlet{
	
       
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("helloServlet 실행!");
		
		String Aval = req.getParameter("a");
		String Bval = req.getParameter("b");
		

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		PrintWriter Aa = resp.getWriter();
		
		Aa.println("<!DOCTYPE html>        ");
		Aa.println("<html>                 ");
		Aa.println("<head>                 ");
		Aa.println("<meta charset=\"UTF-8\">");
		Aa.println("<title>helo HTML</title>");
		Aa.println("</head>                ");
		Aa.println("<body>                 ");
		Aa.println("<h1>HELLO HTML</h1>    ");
		Aa.println("<h1> a="+Aval+"</h1>      ");
		Aa.println("<h1> b="+Bval+"</h1>  	   ");
		Aa.println("</body>                ");
		Aa.println("</html>	               ");
		
	}

}

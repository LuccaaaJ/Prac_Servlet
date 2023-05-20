package com.exam.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/param.do")
public class ParamServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Xval = req.getParameter("x");
		String Yval = req.getParameter("y");
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<!DOCTYPE html>         ");
		out.println("<html>                  ");
		out.println("<head>                  ");
		out.println("<meta charset='UTF-8'>  ");
		out.println("<title>HTML</title>     ");
		out.println("</head>                 ");
		out.println("<body>                  ");
		out.println("<h1>HELLO HTML</h1>     ");
		out.println("<h1> X :"+Xval+"</h1>   ");
		out.println("<h1> Y :"+Yval+"</h1>   ");
		out.println("</body>                 ");
		out.println("</html>                 ");
	}
}

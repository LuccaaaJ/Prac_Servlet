package com.exam.ex;
	
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
	
public class ByeServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("ByeServlet 실행!");
	
	PrintWriter out = resp.getWriter();
	out.println("Hello ByeSrvlet!");
	}
	
	
	
}
 
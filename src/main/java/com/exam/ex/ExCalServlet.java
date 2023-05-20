package com.exam.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exdollar.do")
public class ExCalServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("text/html");
	req.setCharacterEncoding("UTF-8");
	String num1 = req.getParameter("num");	
	
	String unit1 = req.getParameter("unit");
	double num2 = Double.parseDouble(num1);
	PrintWriter out = resp.getWriter();
	//공통변수 생성
	double result = 0.0;
	String WonDollar = null;
	String DollarWon = null;
	
	
	switch(unit1) {
	
	case"won" : //원->달러
		
		result = num2 /1339;
		WonDollar = "원";
		 DollarWon = "달러";
		break;
		
	case"dol" : //달러->원
		result = num2 * 1339;
		WonDollar = "달러";
		DollarWon = "원";
		break;
	}
	
	
	out.println("<!DOCTYPE html>                  ");
	out.println("<html>                           ");
	out.println("<head>                           ");
	out.println("<meta charset=\"UTF-8\">         ");
	out.println("<title>Insert title here</title> ");
	out.println("</head>                          ");
	out.println("<body>	                          ");
	out.print("<h2>"+ num2 + WonDollar +"=" + result + DollarWon+ "입니다.<h2>");
	out.println("</body>	                      ");
	out.println("</html>	                      ");
		     
		
	}

}

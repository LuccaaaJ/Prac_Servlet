package com.exam.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Pluscal.do")
public class PLUScalcServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		PrintWriter Write = resp.getWriter();
		
		String Aval = req.getParameter("a");
		String Bval = req.getParameter("b");
		String op = req.getParameter("op");
		
		double A = Double.parseDouble(Aval);
		double B = Double.parseDouble(Bval);
		double result=0.0;
		
		
		// 아래와 같은 방식으로 한다면 모든 case에 출력문을 넣어야 하므로 bad
//		switch(op) {
//		case ("plus") :
//		Write.println("<h1>"+A+"+"+B+"="+(A+B)+"입니다.<h1>");
//			break;
//		case ("min") : 
//		Write.println("<h1>"+A+"-"+B+"="+(A-B)+"입니다.<h1>");
//			break;
//		case ("mul") : 
//		Write.println("<h1>"+A+"*"+B+"="+(A*B)+"입니다.<h1>");
//			break;
//
//		case ("div") :
//		Write.println("<h1>"+A+"/"+B+"="+(A/B)+"입니다.<h1>");
//			break;
//		
//		}	
		
		// 변수를 설정하여 switch문을 넣는다.
		String opval="";
		switch(op) {
		case("plus") :
			result=A+B;
			opval="+";
			break;
		case("min") :
			result=A-B;
			opval="-";
			break;
		case("mul") :
			result=A*B;
			opval="*";
			break;
		case("div") :
			result=A/B;
			opval="/";
			break;
		}
		
		
		
		// html에 입력하여준다.
		
		Write.println("<!DOCTYPE html>                       ");
		Write.println("<html>                                ");
		Write.println("<head>                                ");
		Write.println("<meta charset=\"UTF-8\">              ");
		Write.println("<title>Insert title here</title>      ");
		Write.println("</head>                               ");
		Write.println("<body>                                ");
		Write.println("<h1>"+A+opval+B+"="+result+"<h1>"      );
		Write.println("</body>                               ");
		Write.println("</html>                               ");
		
	}
}

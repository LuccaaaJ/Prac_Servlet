package com.exam.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal.do")
public class CalServelt extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); //한글 인코딩
		resp.setContentType("text/html"); // 문자열 타입 적용
		
		
		// (1)getParameter()메서드로 입력값을 이클립스로 받아와서 문자열로 나타낸다. 
		
//		getParameter()메서드의 경우 String타입을 리턴하는반면,
//		getAttribute()는 Object 타입을 리턴하기 때문에 주로 빈 객체나 다른 클래스를 받아올때 사용된다.
//		또한, getParameter()는 웹브라우저에서 전송받은 request영역의 값을 읽어오고
//		getAttribute()의 경우 setAttribute()속성을 통한 설정이 없으면 무조건 null값을 리턴한다.
		
		String Nval = req.getParameter("n");
		String Mval = req.getParameter("m");
		
		
		
		// (2)문자열을 숫자타입으로 변환하는 함수
		double N = Double.parseDouble(Nval);
		double M = Double.parseDouble(Mval);
		
		double NM = N + M;
		
		//(3) 가져온 파라미터값에 대한 응답 값을 다시 jsp로 보내기 위한 함수
		PrintWriter Write = resp.getWriter();
		
		Write.println("<!DOCTYPE html>                       ");
		Write.println("<html>                                ");
		Write.println("<head>                                ");
		Write.println("<meta charset=\"UTF-8\">              ");
		Write.println("<title>Insert title here</title>      ");
		Write.println("</head>                               ");
		Write.println("<body>                                ");
		Write.println("간편계산기              		             ");
		Write.println("<h1>"+M+"+"+N+"="+NM+"입니다. </h1>  	 ");
		Write.println("</body>                               ");
		Write.println("</html>                               ");
		
		
	}

}

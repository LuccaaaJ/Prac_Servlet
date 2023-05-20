package com.exam.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form.do")
public class MenuServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		String pval = req.getParameter("product");
		String fval = req.getParameter("fruit");
		String[] dval = req.getParameterValues("drink"); // 여러개를 선택하기위해서 변수를 배열로 설정
		
		PrintWriter out = resp.getWriter();
		
		//파라미터값을 받기위한것. 값으로 받은 것을 그대로 출력할 수 있기 때문에 switch문으로 작성하지 않아도 된다.
		
		//<음료 여러개 선택 시 여러개 명칭이 나오도록 해야함(체크박스에서 중복 선택하는 경우)> 
		//-> 파라미터 값이 여러개인 경우. 원하는 함수 끝에 커서 올려놓고 컨트롤 + 스페이스 누르면~

		out.println("<!DOCTYPE html>                  ");
		out.println("<html>                           ");
		out.println("<head>                           ");
		out.println("<meta charset=\"UTF-8\">         ");
		out.println("<title>신발, 과일, 커피</title> ");
		out.println("</head>                          ");
		out.println("<body>	                          ");	
		out.println("<h1>요청주소 : "+ req.getRequestURI()+"</h1>");	
		out.println("<h1>요청주소 : "+ req.getRequestURI()+"</h1>");	
		out.println("<h1>애플리케이션 고유경로 : "+ req.getContextPath()+"</h1>");	
		out.println("<h1>요청방식 : "+ req.getMethod()+"</h1>");	
		out.println("<h1>User-Agent 요청헤더 : "+ req.getHeader("User-Agent")+"</h1>");
		// getHeader() : 사용자가 사용하고 있는 브라우저의 종류가 무엇인지 알려주는 함수
		out.println("<h1>상품 :	"+ pval +"</h1>"  );	
		out.println("<img src='https://api.lorem.space/image/"+pval+"?w=150&h=150'/>");	
		out.println("<h1>과일 :	"+fval+"</h1>");	
		out.println("<h1>음료 :						");
		
		for(int i=0; i<dval.length; i++)
		{
		out.println("<h1>["+dval[i]+"] </h1>");
		}
		out.println("</body>	                      ");
		out.println("</html>	                      ");
			     
		
		
		
	}
}

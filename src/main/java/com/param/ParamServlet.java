package com.param;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/param")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//데이터
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		//응답
		response.setContentType("text/html;charset=UTF-8"); // 톰켓은외국꺼라 한국말모름. 이렇게 해줘야함. 순서를 먼저 생성해야제대로 됨.
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("나의 이름은 "+name+" 이고, 내 나이는 "+ age+"살 이므로");			
		if(age >= 19) out.println("<font color='red'>성인</font> 입니다."); 
		else out.println("<font color='red'>청소년</font> 입니다."); 
		out.println("<input type ='button' value='뒤로가기' onclick=\"location.href='http://localhost:8080/testServlet/param/param.html'\">"); //연결할려면 \를 넣어주면 된다.		
		out.println("</body>");
		out.println("</html>");
		
		/*//응답
		1. 콘솔
		System.out.println("<html>");
		
		2. 파일
		PrintWriter out = new PrintWriter(new FileWriter("result.txt"));
		out.println("<html>");
		
		3. 웹
		PrintWriter out = response.getWriter();//생성
		
		IO Stream 
		1.byte
		InputStream
		OutputStream
		
		BufferedOutpurStream
		
		2.문자(2byte)
		Reader
		Writer
		*/
		
		
	}

}

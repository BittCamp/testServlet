package com.param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ParamServlet extends HttpServlet {
    private static final long serailVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String outText = "";
        if(age >= 19) {
           outText = "나의 이름은 " + name + "이고, 내 나이는 " + age + "살이므로 성인입니다.";
        } else {
           outText = "나의 이름은 " + name + "이고, 내 나이는 " + age + "살이므로 청소년입니다.";
        }
        
        response.setContentType("text/html; charset=UTF-8;");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println(outText);
        out.println("</body>");
        out.println("</html>");
        
        out.println("<input type='button' value='뒤로' onclick='history.go(-1)'>");
        /*
        out.println("<form action='http://localhost:8080/testServlet/param/param.html'>");
        out.println("<input type='submit' value='뒤로가기'>");
        out.println("</form>");
       */
    }
}
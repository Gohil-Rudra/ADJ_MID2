package com.example.myservlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class cookie_welcome extends HttpServlet{
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException {
        Cookie[] cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equalsIgnoreCase("user")){
                    out.println("<h1>Welcome ,"+c.getValue()+"</h1>");
                    return;
                }
            }

        }
        RequestDispatcher rd = request.getRequestDispatcher("cookie.jsp");
        out.println("Please Enter Username First !");
        rd.include(request,response);

    }
}

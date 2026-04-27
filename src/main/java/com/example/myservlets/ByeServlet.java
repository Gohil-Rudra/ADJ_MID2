package com.example.myservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ByeServlet extends HttpServlet {
    private String message;
    public void init(){
        ServletContext context = getServletContext();
        String clg_name = context.getInitParameter("clg_name");
        message = clg_name+", will miss you !";
    }
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException{

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>"+message +"</h1>");
        out.println("</body></html>");
    }
    public void destroy(){
    }
}

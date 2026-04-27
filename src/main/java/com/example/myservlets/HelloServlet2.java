package com.example.myservlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet2 extends HttpServlet {
    private String message;

    public void init()
    {
        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("username");

        ServletContext context = getServletContext();
        String clg_name = context.getInitParameter("clg_name");

        message = "Hello," + name + " <br> Welcome to :"+clg_name;

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        response.setContentType("text/html");

        RequestDispatcher rd = request.getRequestDispatcher("sorry.jsp");


        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message +"</h1>");
        out.println("</body></html>");
        rd.include(request,response);

    }

    public void destroy() {
    }
}
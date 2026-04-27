package com.example.myservlets;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
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

        // RequestDispatcher rd = request.getRequestDispatcher("sorry.jsp");

        // rd.forward(request,response);
        // Hello

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message +"</h1>");
        out.println("<h2>This site is visited :" + getServletContext().getAttribute("count")+"</h2>"); // Dont worry the toString will print it nicely even if its an object
        out.println("</body></html>");

       ;
    }

    public void destroy() {
    }
}
package com.example.myservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class welcome extends HttpServlet {

    public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException{

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if(session != null && session.getAttribute("user") != null){
            out.println("<h1>Welcome,"+session.getAttribute("user")+"</h1>");
        }
        else{
            out.println("Please Enter Username First !");
            RequestDispatcher rd = request.getRequestDispatcher("session.jsp");

            rd.include(request,response);
        }

    }
}

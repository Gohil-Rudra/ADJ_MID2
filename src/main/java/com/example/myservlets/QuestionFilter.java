package com.example.myservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuestionFilter implements Filter{
    public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws IOException,ServletException{

        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse) res;


        if(request.getParameter("que1")!= null && request.getParameter("que2") != null){
            chain.doFilter(request,response);
            return;
        }
        else{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("Please Enter the options !");
            RequestDispatcher rd = request.getRequestDispatcher("/Quiz/index.html");
            rd.include(request,response);
        }
    }
}

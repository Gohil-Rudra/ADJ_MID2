package com.example.myservlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AuthFilter implements Filter {

    public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession(false);

        String username = req.getParameter("username");

//        if (session != null && session.getAttribute("username") != null && !session.getAttribute("username").equals("")){
//            chain.doFilter(req,res);
//        }
        if( username != null && !username.equalsIgnoreCase("")){
            chain.doFilter(req,res);
        }
        else{
            res.sendRedirect("filter_form.jsp");
        }

    }
}


// Not working as session is not created...
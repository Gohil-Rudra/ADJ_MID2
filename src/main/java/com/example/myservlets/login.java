package com.example.myservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

        String username = request.getParameter("username");

        HttpSession session = request.getSession();
        session.setAttribute("user",username);

        response.sendRedirect("welcome");
    }
}

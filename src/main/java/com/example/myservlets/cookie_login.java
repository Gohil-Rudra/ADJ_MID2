package com.example.myservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cookie_login extends HttpServlet{
    public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException{
        String username = request.getParameter("username");
        Cookie cookie = new Cookie("user",username);
        cookie.setMaxAge(60*60); // 1 hour
        response.addCookie(cookie);
        response.sendRedirect("cookie_welcome");
    }
}

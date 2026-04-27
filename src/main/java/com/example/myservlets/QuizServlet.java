package com.example.myservlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class QuizServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{

        String answer1 = request.getParameter("que1");
        String answer2 = request.getParameter("que2");

        int marks = 0;
        if (answer1.equalsIgnoreCase("A")) marks+=1;
        if(answer2.equalsIgnoreCase("B")) marks+=1;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Marks :" + marks);
    }
}

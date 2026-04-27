package com.example.myservlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Counter extends HttpServlet {
    public void init(){}
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
        ServletContext context = getServletContext();
        Integer count = (Integer) context.getAttribute("count"); // here we retrieve object not text ! so no ParseInt
        if(count==null) count = 0;

        RequestDispatcher rd = request.getRequestDispatcher("hello-world");
        request.setAttribute("count",count+1);
        context.setAttribute("count",count+1);

        rd.forward(request,response);
    }
}

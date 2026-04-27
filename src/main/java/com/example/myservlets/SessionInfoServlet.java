package com.example.myservlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionInfoServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        out.println("<html><body>");
        out.println("<h2>Session Details</h2>");

        if (session.isNew()) {
            out.println("<p>This is a NEW session</p>");
        } else {
            out.println("<p>This is an EXISTING session</p>");
        }

        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Creation Time: " + new Date(session.getCreationTime()) + "</p>");
        out.println("<p>Last Access Time: " + new Date(session.getLastAccessedTime()) + "</p>");
        out.println("<p>Session Timeout (seconds): " + session.getMaxInactiveInterval() + "</p>");

        out.println("</body></html>");
    }
}

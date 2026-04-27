package com.example.myservlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Filter_construction implements Filter{

    private Boolean value;

    public void init(FilterConfig config){
        value = Boolean.parseBoolean(config.getInitParameter("under_construction"));
    }

    public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException{

        PrintWriter out = response.getWriter();
        if(value){
            out.println("page is under-construction");
        }
        else{
            chain.doFilter(request,response);
        }
    }
}

/* xml

<filter>
    <filter-name>
    <filter-class>

    <init-param>
        <param-name>
        <param-value>
    </init param>
</filter>

<filter-mapping>
    <filter-name></filter-name>
    <url-pattern></url-pattern>
</filter-mapping>


 */
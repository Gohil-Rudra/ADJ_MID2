<%--
  Created by IntelliJ IDEA.
  User: rudra
  Date: 24-03-2026
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>MarksCalculator</title>
</head>
<body>

<% String name = request.getParameter("name"); %>
<% int mark1 = Integer.parseInt(request.getParameter("mark1")); %>
<% int mark2 = Integer.parseInt(request.getParameter("mark2")); %>
<% int mark3 = Integer.parseInt(request.getParameter("mark3")); %>
<% int avg = ( mark1 + mark2 + mark3 ) / 3 ; %>
<% String category; %>
<%
    if (avg <= 100 && avg >=90) category = "Excellent";
    else if (avg <= 89 && avg >=75) category = "Good";
    else if (avg <= 74 && avg >=50) category = "Average";
    else if (avg < 50) category = "Poor";
    else category = "Error";

%>

<% request.setAttribute("avg",avg); %>
<% request.setAttribute("category",category); %>
<% request.setAttribute("name",name); %>

<jsp:forward page="DisplayResults.jsp" />

</body>
</html>
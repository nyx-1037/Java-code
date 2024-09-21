<%@ page import="java.io.*,java.util.*,javax.servlet.*,javax.servlet.http.*" %>

<html>
<head>
    <title>Show Info Page</title>
</head>
<body>
<h2>Show Info Page</h2>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    HttpSession session1 = request.getSession();
    session1.setAttribute("username", username);
    session1.setAttribute("password", password);
%>
Username: <%= session1.getAttribute("username") %><br/>
Password: <%= session1.getAttribute("password") %><br/>
<%--安全退出session--%>
<a href="logout.jsp">Log out safely </a>
</body>
</html>

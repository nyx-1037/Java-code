<%@ page import="java.io.*,java.util.*,javax.servlet.*,javax.servlet.http.*" %>

<html>
<head>
    <title>Show Info Test Page</title>
</head>
<body>
<h2>Show Info Test Page</h2>
<%
    HttpSession session1 = request.getSession();
%>
Username: <%= session1.getAttribute("username") %><br/>
Password: <%= session1.getAttribute("password") %><br/>
</body>
</html>

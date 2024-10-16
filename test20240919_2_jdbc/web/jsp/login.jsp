<%@ page import="java.io.*,java.util.*,javax.servlet.*,javax.servlet.http.*" %>

<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h2>Login Page</h2>
<form action="showInfo.jsp" method="post">
    Username: <input type="text" name="username" /><br/>
    Password: <input type="password" name="password" /><br/>
    <input type="submit" value="Login" />
</form>
</body>
</html>

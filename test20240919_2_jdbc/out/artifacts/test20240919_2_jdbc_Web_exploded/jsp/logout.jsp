<%--
  Created by IntelliJ IDEA.
  User: 15879
  Date: 2024/9/12
  Time: 下午9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session Log out safely </title>
</head>
<body>

<%
    session.invalidate();
%>
<h1>安全退出：已清除session会话</h1>
</body>
</html>

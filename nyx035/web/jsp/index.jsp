<%--
  Created by IntelliJ IDEA.
  User: 15879
  Date: 2024/9/5
  Time: 下午3:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Index Page</title>
</head>
<body>
<%@ include file="../top.html" %>

<%
    // 获取名为"choice"的参数值
    String choice = request.getParameter("choice");
%>

<!-- 根据choice的值嵌入不同的界面 -->
<% if (choice != null) { %>
    <% switch (choice) {
        case "1": %>
    <!-- 如果choice的值是"option1"，嵌入对应的界面 -->
    <jsp:include page="./welcome.jsp"/>

    <% break;
        case "2": %>
    <!-- 如果choice的值是"option2"，嵌入对应的界面 -->
    <jsp:include page="./feature.jsp"/>
    <% break;
        case "3": %>
    <!-- 如果choice的值是"option2"，嵌入对应的界面 -->
    <jsp:include page="./contact.jsp"/>
    <% break;
        default: %>
    <!-- 如果choice的值不是预期的值，可以显示一个默认界面或错误信息 -->
    <p>Invalid choice</p>
    <% break;
} %>


<% } else { %>
<!-- 如果没有提供choice参数，可以显示一个默认界面 -->

<% } %>



</body>
</html>


<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: 15879
  Date: 2024/10/10
  Time: 下午2:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String url ="jdbc:mysql://localhost:3306/db1?serverTimezone=UTC";
    String username = "root";
    String password = "676100nbc";
//        1. 导入驱动jar包(已完成)
//        2. 注册驱动
    Class.forName("com.mysql.cj.jdbc.Driver");//可省略
//        3. 获取数据库连接对象 Connection
    //第二、三个参数是连接数据库的用户名和密码
    Connection connection= DriverManager.getConnection(url, username, password);
//        4. 定义sql语句
    String sql="select * from tb_stu";
//        5. 获取执行sql语句的对象 statement
    Statement statement =connection.createStatement();
//        6. 执行sql，接收返回结果
    ResultSet resultSet =statement.executeQuery(sql);
//        7. 处理结果
    %>


<table>
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>出生日期</td>
            <td>班级</td>
        </tr>
    <% while(resultSet.next()){ %>

        <tr>
            <td><%=resultSet.getString(1)%></td>
            <td><%=resultSet.getString(2)%></td>
            <td><%=resultSet.getString(3)%></td>
            <td><%=resultSet.getString(4)%></td>
        </tr>
    </table>

<% } %>

<%
//        8. 释放资源
    resultSet.close();
    statement.close();
    connection.close();
%>
</body>
</html>

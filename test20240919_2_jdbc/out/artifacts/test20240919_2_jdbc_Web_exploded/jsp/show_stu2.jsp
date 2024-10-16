<%@ page import="java.sql.*" %>
<%@ page import="java.io.*,java.util.*,javax.servlet.*,javax.servlet.http.*" %><%--
  Created by IntelliJ IDEA.
  User: 15879
  Date: 2024/10/10
  Time: 下午2:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String stu_id = request.getParameter("stu_id");
    String stu_name = request.getParameter("stu_name");
    String stu_date = request.getParameter("stu_date");
    String stu_class = request.getParameter("stu_class");
%>
<html>
<head>
    <title>show2</title>
</head>
<body>

<%
    String url ="jdbc:mysql://localhost:3306/db1?serverTimezone=UTC";
    String username = "root";
    String password = "676100nbc";
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection= DriverManager.getConnection(url, username, password);

    String sql="select * from tb_stu";
    String sqladd="insert into tb_stu(stu_id,stu_name,stu_date,stu_class) values(?,?,?,?)";

    PreparedStatement ps= connection.prepareStatement(sqladd);
    ps.setString(1,stu_id);


    ps.setString(2,stu_name);

    ps.setString(3,stu_date);

    ps.setString(4,stu_class);

    ps.executeUpdate();
    ps.close();

    ps= connection.prepareStatement(sql);
    ResultSet rs= ps.executeQuery();

%>


<table>
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>出生日期</td>
            <td>班级</td>
        </tr>
    <% while(rs.next()){ %>

        <tr>
            <td><%=rs.getString(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
        </tr>


<% } %>
</table>
<%
//        8. 释放资源
    rs.close();
    ps.close();
    connection.close();
%>
</body>
</html>

import java.sql.* ;

public class JdbcDemo {
		public static void main(String[] args) throws Exception {
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
			String sql="select * from tb_user";
//        5. 获取执行sql语句的对象 statement
			Statement statement =connection.createStatement();
//        6. 执行sql，接收返回结果
			ResultSet resultSet =statement.executeQuery(sql);
//        7. 处理结果
			while(resultSet.next()){
				System.out.println(resultSet.getString("id")
						+ " " + resultSet.getString("username")
						+ " " + resultSet.getString("pwd"));
			}
//        8. 释放资源
			statement.close();
			connection.close();
		}
	}

import java.sql.*;

public class JdbcDemo2 {
		public static void main(String[] args) throws Exception {
			String url ="jdbc:mysql://localhost:3306/db1?serverTimezone=UTC";
			String username = "root";
			String password = "676100nbc";
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection= DriverManager.getConnection(url, username, password);

			String sql="insert into tb_user(username,pwd) values(?,?)";

			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,"admin");
			ps.setString(2,"123456");

			int num = ps.executeUpdate();
			if(num>0){
				System.out.println("执行成功");
			}else{
				System.out.println("执行失败");
			}
			ps.close();
			connection.close();


		}
	}

package DB.src.main.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	//设施dao
	//场馆dao
	//学生dao

	//检查时间段可用性
	//检查场地可用性
	//更改数据库
	//取消预约
	//查询预约
	public static User login(String username, String password) {
		Connection conn = null;
		
		try {
			conn = JDBCTool.getConnection();
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'");
			
			System.out.println("SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'");
			if(rs.next()) {
				
				String un = rs.getString("username");
				String p = rs.getString("password");
				String email = rs.getString("email");
				User u = new User(un,p,email);
				return u;
	
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		return null;
	}

}

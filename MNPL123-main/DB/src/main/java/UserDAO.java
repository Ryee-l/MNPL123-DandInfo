package projectDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UserDAO {

    public static User login(String username, String password) {
        Connection conn = null;

        try {
            conn = JDBCTool.getConnection();
            Statement st = conn.createStatement();
            String query = "SELECT * FROM student WHERE idstudent = '" + username + "' AND passward = '" + password + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                String un = rs.getString("idstudent");
                String p = rs.getString("passward");
                String no = rs.getString("phonenumber");
                User u = new User(un, p, no);
                return u;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
    
    public static User register(String username, String password, String phonenumber) {
        Connection conn = null;

        try {
            conn = JDBCTool.getConnection();

            String selectQuery = "SELECT * FROM student WHERE idstudent = ?";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            selectStatement.setString(1, username);
            ResultSet rs = selectStatement.executeQuery();

            if (rs.next()) {
                // 存在相同记录，返回null
                return null;
            } else {
                // 插入新行
                String insertQuery = "INSERT INTO student (idstudent, passward, phonenumber) VALUES (?, ?, ?)";
                PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
                insertStatement.setString(1, username);
                insertStatement.setString(2, password);
                insertStatement.setString(3, phonenumber);
                insertStatement.executeUpdate();

                // 返回新插入的User对象
                User newUser = new User(username, password, phonenumber);
                return newUser;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }


    

}


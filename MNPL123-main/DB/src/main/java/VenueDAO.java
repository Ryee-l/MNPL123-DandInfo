package DB.src.main.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VenueDAO {
    //更新体育场馆
    public void updateVenue(Venue venue) {
        Connection conn = JDBCTool.getConnection();

        try {
            String sql = "UPDATE venue SET opening_time = ? WHERE name = ?";
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, venue.getOpeningTime());
            statement.setString(2, venue.getName());

            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
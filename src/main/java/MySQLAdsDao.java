import com.mysql.jdbc.Driver;
import database.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection conn;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        String allQuery = "SELECT * FROM ads";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(allQuery);
            while (rs.next()) {
                ads.add(new Ad(
                    rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        long lastInsertedId = 0;
        String insertQuery = String.format(
                "INSERT INTO ads (id, user_id, title, description) VALUES (%d, %d, '%s', '%s')",
                ad.getId(),
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription());
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedId = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lastInsertedId;
    }


    public static void main(String[] args) {
        Ads adao = new MySQLAdsDao(new Config());

        List<Ad> ads = adao.all();

        for (Ad ad : ads) {
            System.out.println(ad.getDescription());
        }
    }
}

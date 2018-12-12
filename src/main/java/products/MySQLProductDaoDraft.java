package products;

import database.Config;

import java.sql.*;
import java.util.List;

public class MySQLProductDaoDraft implements Products {

    Connection conn;

    public MySQLProductDaoDraft(Config config) {
        try {
            this.conn = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public long save(Product product) {
        return 0;
    }

    @Override
    public void deleteById(long id) {
        String deleteQuery = String.format("DELETE FROM products WHERE id = %d", id);
        try {
            Statement stmt = this.conn.createStatement();
            stmt.executeUpdate(deleteQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Product findById(long id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    public static void main(String[] args) {
        Products pdao = new MySQLProductDaoDraft(new Config());
        pdao.deleteById(1);
    }
}

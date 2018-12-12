package products;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductJdbcPractice {

    public static void main(String[] args) {


        // =============================== SELECT

//        // open connection for DB


//        try {
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/xanadu_test_db?serverTimezone=UTC&useSSL=false",
//                    "root",
//                    "codeup"
//            );
//
//            Statement stmt = conn.createStatement();
//
////            .executeQuery() // SELECT (DQL)
////            .executeUpdate() // UPDATE, DELETE, INSERT (DML)
//
//            ResultSet rs = stmt.executeQuery("SELECT * FROM products");
//
//
//            List<Product> products = new ArrayList<>();
//
//            while(rs.next()) {
//                products.add(new Product(
//                        rs.getLong("id"),
//                        rs.getString("name"),
//                        rs.getInt("price"),
//                        rs.getString("description")
//                ));
//            }
//
//            System.out.println(products.get(1).getDescription());
//
//
//
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


        // =============================== UPDATE

//        // open connection for DB

//        try {
//            Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://localhost/xanadu_test_db?serverTimezone=UTC&useSSL=false",
//                "root",
//                "codeup"
//            );
//
//            Statement stmt = conn.createStatement();
//
//            int recordsChanged = stmt.executeUpdate("UPDATE products SET name = 'Cool Widget' WHERE id = 3");
//
//            System.out.println(recordsChanged);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }



        // =============================== DELETE

//        // open connection for DB
//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://localhost/xanadu_test_db?serverTimezone=UTC&useSSL=false",
//                "root",
//                "codeup"
//        )) {
//
//            // create the statement object
//            Statement stmt = conn.createStatement();
//
//            // execute the query with .executeUpdate() method since it is using DML
//            stmt.executeUpdate("DELETE FROM products WHERE id = 1");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        // =============================== INSERT

//        // open connection for DB

//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://localhost/xanadu_test_db?serverTimezone=UTC&useSSL=false",
//                "root",
//                "codeup"
//        )) {
//
//            // create the statement object
//            Statement stmt = conn.createStatement();
//
//            // execute the query with .executeUpdate() method since it is using DML
//            stmt.executeUpdate(
//            "INSERT INTO products (name, price, description) VALUES ('Atari 2600', 10, 'An old console')",
//                Statement.RETURN_GENERATED_KEYS
//            );
//
//            ResultSet keysResultSet = stmt.getGeneratedKeys();
//
//            if (keysResultSet.next()) {
//                long lastInsertedId = keysResultSet.getLong(1);
//                System.out.println(lastInsertedId);
//            }
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }

}

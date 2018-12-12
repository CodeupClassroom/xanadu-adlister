package products;

public class ProductJdbcPractice {

    public static void main(String[] args) {


        // =============================== SELECT

//        // open connection for DB in a try-with-resources block
//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://localhost/xanadu_test_db?serverTimezone=UTC&useSSL=false",
//                "root",
//                "codeup"
//        )) {
//
//            // create the statement object
//            Statement stmt = conn.createStatement();
//
//            // execute the select query with .executeQuery() method since it is using DQL
//            ResultSet rs = stmt.executeQuery("SELECT * FROM products");
//
//            // pull information out of result set object
//            List<Product> products = new ArrayList<>();
//            while (rs.next()) {
//                products.add(new Product(
//                        rs.getLong("id"),
//                        rs.getString("name"),
//                        rs.getInt("price"),
//                        rs.getString("description")
//                ));
//            }
//
//            for (Product p : products) {
//                System.out.println(p.toString());
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        // =============================== UPDATE

//        // open connection for DB in a try-with-resources block
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
//            stmt.executeUpdate("UPDATE products SET name = 'PS4' WHERE id = 2");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        // =============================== DELETE

//        // open connection for DB in a try-with-resources block
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

//        // open connection for DB in a try-with-resources block
//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://localhost/xanadu_test_db?serverTimezone=UTC&useSSL=false",
//                "root",
//                "codeup"
//        )) {
//
//            // create the statement object
//            Statement stmt = conn.createStatement();
//
//            // execute the query with .executeUpdate() method since it is using DML and passing in configuration to get the returned keys
//            stmt.executeUpdate("INSERT INTO products (name, price, description) VALUES ('Atari 2600', 10, 'An old console')", Statement.RETURN_GENERATED_KEYS);
//
//            // getting the result set of keys from the statement
//            ResultSet keysResultSet = stmt.getGeneratedKeys();
//
//            // moving cursor to first result
//            keysResultSet.next();
//
//            // getting the specific column value from the result set object
//            long lastInsertedId = keysResultSet.getLong(1);
//
//            // printing out the generated key
//            System.out.println(lastInsertedId);
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }







    }

}

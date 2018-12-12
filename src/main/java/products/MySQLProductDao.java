package products;

import database.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLProductDao implements Products {

    private Connection conn;

    public MySQLProductDao(Config config) {

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
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        String selectQuery = "SELECT * FROM products";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                products.add(new Product(
                    rs.getLong(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getString(4)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product findById(long id) {
        Product result = null;
        String findQuery = "SELECT * FROM products WHERE id = " + id;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(findQuery);
            if (rs.next()) {
                result = new Product(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getInt("price"),
                    rs.getString("description")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public long save(Product p) {
        if (p.getId() == 0) {
            return insert(p);
        } else {
            return update(p);
        }
    }


    public long insert(Product p) {
        long lastInsertedId = 0;
        String insertQuery = String.format(
            "INSERT INTO products (name, price, description) VALUES ('%s', %d, '%s')",
            p.getName(),
            p.getPrice(),
            p.getDescription()
        );
        System.out.println(insertQuery);
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedId = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lastInsertedId;
    }

    public long update(Product p) {
        long numberOfRowsEffected = 0;
        String updateQuery = String.format("UPDATE products SET name = '%s', price = %d, description = '%s' WHERE id = %d", p.getName(), p.getPrice(), p.getDescription(), p.getId());
        try {
            Statement st = conn.createStatement();
            numberOfRowsEffected = st.executeUpdate(updateQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return numberOfRowsEffected;
    }

    @Override
    public void deleteById(long id) {
        String deleteQuery = String.format("DELETE FROM products WHERE id = %d", id);
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(deleteQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        // TEST FINDBYID
        Products pdao = new MySQLProductDao(new Config());
//        Product p1 = pdao.findById(2);
//        System.out.println(p1.getName());

        // TEST INSERT WITH SAVE
//        Product p2 = new Product("Wii", 400, "A casual experience");
//        pdao.save(p2);


        // TEST UPDATE WITH SAVE
//        Product productToUpdate = pdao.findById(3);
//        productToUpdate.setName("Cool Widget");
//        pdao.save(productToUpdate);


        // TEST DELETE AND FINDALL
//        pdao.deleteById(3);


        List<Product> existingProducts = pdao.findAll();

        for (Product p : existingProducts) {
            System.out.println(p.getName());
        }
    }

}

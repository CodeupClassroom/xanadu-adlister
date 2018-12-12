//package products;
//
//import database.Config;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MySQLProductDao implements Products {
//
//
//    @Override
//    public List<Product> findAll() {
//
//    }
//
//    @Override
//    public Product findById(long id) {
//        Product result = null;
//        String findQuery = "SELECT * FROM products WHERE id = " + id;
//        try {
//            Statement st = conn.createStatement();
//            ResultSet rs = st.executeQuery(findQuery);
//            if (rs.next()) {
//                result = new Product(
//                    rs.getLong("id"),
//                    rs.getString("name"),
//                    rs.getInt("price"),
//                    rs.getString("description")
//                );
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    @Override
//    public long save(Product p) {
//        if (p.getId() == 0) {
//            return insert(p);
//        } else {
//            return update(p);
//        }
//    }
//
//
//    public long insert(Product p) {
//
//    }
//
//    public long update(Product p) {
//
//    }
//
//    @Override
//    public void deleteById(long id) {
//        String deleteQuery = String.format("DELETE FROM products WHERE id = %d", id);
//        try {
//            Statement st = conn.createStatement();
//            st.executeUpdate(deleteQuery);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        // TEST FINDBYID
////        Products pdao = new MySQLProductDao(new Config());
////        Product p1 = pdao.findById(2);
////        System.out.println(p1.getName());
//
//        // TEST INSERT WITH SAVE
////        Product p2 = new Product("Wii", 400, "A casual experience");
////        pdao.save(p2);
//
//
//        // TEST UPDATE WITH SAVE
////        Product productToUpdate = pdao.findById(3);
////        productToUpdate.setName("Cool Widget");
////        pdao.save(productToUpdate);
//
//
//        // TEST DELETE AND FINDALL
////        pdao.deleteById(3);
//
////
////        List<Product> existingProducts = pdao.findAll();
////
////        for (Product p : existingProducts) {
////            System.out.println(p.getName());
////        }
//    }
//
//}

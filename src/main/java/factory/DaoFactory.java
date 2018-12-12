package factory;

import database.Config;
import products.ListProductDao;
import products.MySQLProductDao;
import products.Products;

public class DaoFactory {

    private static Products productDao;

    public static Products getProductDao() {
        if (productDao == null) {
            productDao = new MySQLProductDao(new Config());
        }
        return productDao;
    }

}

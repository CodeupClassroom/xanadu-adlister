public class DaoFactory {

    private static Products productDao;

    public static Products getProductDao() {
        if (productDao == null) {
            productDao = new ListProductDao();
        }
        return productDao;
    }

}

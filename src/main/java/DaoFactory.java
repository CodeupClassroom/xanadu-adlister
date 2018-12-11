public class DaoFactory {
    private static Products pdao;

    public static Products getProductsDao() {
        if (pdao == null) {
            pdao = new ListProductDao();
        }
        return pdao;
    }

}

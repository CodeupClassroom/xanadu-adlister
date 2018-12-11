import java.util.ArrayList;
import java.util.List;

public class ListProductDao implements Products {

    private List<Product> products;

    public ListProductDao() {
        this.products = new ArrayList<>();
        products.add(new Product(1, "Widget A", 100, "A cool widget 1"));
        products.add(new Product(2,"Widget B", 200, "A cool widget 2"));
        products.add(new Product(3,"Widget C", 100, "A cool widget 3"));
    }

    // save
    public void save(Product p) {
        if (p.getId() == 0) {
            p.setId(products.size() + 1);
            products.add(p);
        } else {
            int i = 0;
            for (Product product : products) {
                if (product.getId() == p.getId()) {
                    products.set(i, p);
                    break;
                }
                i++;
            }
        }
    }

    // deleteById
    public void deleteById(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }

    // findOne()
    public Product findOne(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // findAll()
    public List<Product> findAll() {
        return products;
    }

    public static void main(String[] args) {
        // TEST FIND ONE
        ListProductDao pdao = new ListProductDao();
//        Product p1 = pdao.findOne(1);
//        System.out.println(p1.getName());

        // TEST INSERT WITH SAVE
//        Product p2 = new Product("Wii", 400, "A casual experience");
//        pdao.save(p2);

//        for (Product p : pdao.products) {
//            System.out.println(p.getName());
//        }

        // TEST UPDATE WITH SAVE
//        Product productToUpdate = pdao.findOne(3);
//        productToUpdate.setName("Cool Widget");
//        pdao.save(productToUpdate);

//        for (Product p : pdao.products) {
//            System.out.println(p.getName());
//        }

        // TEST DELETE AND FINDALL
//        pdao.deleteById(3);
//
//        for (Product p : pdao.products) {
//            System.out.println(p.getName());
//        }

        List<Product> existingProducts = pdao.findAll();

        for (Product p : existingProducts) {
            System.out.println(p.getName());
        }
    }

}

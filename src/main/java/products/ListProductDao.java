package products;

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
    @Override
    public long save(Product p) {
        if (p.getId() == 0) {
            p.setId(products.size() + 1);
            products.add(p);
            return products.get(products.size() - 1).getId();
        } else {
            int i = 0;
            for (Product product : products) {
                if (product.getId() == p.getId()) {
                    products.set(i, p);
                    break;
                }
                i++;
            }
            return 0;
        }
    }

    // deleteById
    @Override
    public void deleteById(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }

    // findById()
    @Override
    public Product findById(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // findAll()
    @Override
    public List<Product> findAll() {
        return products;
    }

    public static void main(String[] args) {
        // TEST FIND ONE
        ListProductDao pdao = new ListProductDao();
//        products.Product p1 = pdao.findById(1);
//        System.out.println(p1.getName());

        // TEST INSERT WITH SAVE
//        products.Product p2 = new products.Product("Wii", 400, "A casual experience");
//        pdao.save(p2);

//        for (products.Product p : pdao.products) {
//            System.out.println(p.getName());
//        }

        // TEST UPDATE WITH SAVE
//        products.Product productToUpdate = pdao.findById(3);
//        productToUpdate.setName("Cool Widget");
//        pdao.save(productToUpdate);

//        for (products.Product p : pdao.products) {
//            System.out.println(p.getName());
//        }

        // TEST DELETE AND FINDALL
//        pdao.deleteById(3);
//
//        for (products.Product p : pdao.products) {
//            System.out.println(p.getName());
//        }

        List<Product> existingProducts = pdao.findAll();

        for (Product p : existingProducts) {
            System.out.println(p.getName());
        }
    }

}

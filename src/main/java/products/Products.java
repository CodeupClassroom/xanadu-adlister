package products;

import products.Product;

import java.util.List;

public interface Products {

    long save(Product product);
    void deleteById(long id);
    Product findById(long id);
    List<Product> findAll();

}

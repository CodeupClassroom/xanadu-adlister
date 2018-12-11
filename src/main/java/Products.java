import java.util.List;

public interface Products {

    void save(Product product);
    void deleteById(long id);
    Product findOne(long id);
    List<Product> findAll();

}

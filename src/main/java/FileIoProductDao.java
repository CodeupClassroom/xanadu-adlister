import products.Product;

import java.nio.file.Path;
import java.util.List;

public class FileIoProductDao {

    private Path file;

    public FileIoProductDao(Path file) {
        file = file;
    }

    public void save(Product product) {
        // read file, write record to text file if it doesn't already exist
    }

    public void deleteById(long id) {
        // delete record if it exists
    }

    public Product findOne(long id) {
        // return a record if it exists
        return null;
    }

    public List<Product> findAll() {
        // return all records
        return null;
    }
}

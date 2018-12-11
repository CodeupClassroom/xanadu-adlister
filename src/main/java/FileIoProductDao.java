import java.nio.file.Path;
import java.util.List;

public class FileIoProductDao implements Products {

    private Path file;

    public FileIoProductDao(Path file) {
        file = file;
    }

    @Override
    public void save(Product product) {
        // read file, write record to text file if it doesn't already exist
    }

    @Override
    public void deleteById(long id) {
        // delete record if it exists
    }

    @Override
    public Product findOne(long id) {
        // return a record if it exists
        return null;
    }

    @Override
    public List<Product> findAll() {
        // return all records
        return null;
    }
}

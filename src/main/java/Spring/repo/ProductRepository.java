package Spring.repo;

import Spring.doMain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{

    public Iterable<Product> findByDescriptionContaining(String description);

}



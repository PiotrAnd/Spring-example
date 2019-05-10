package Spring.services;

import Spring.doMain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveOrUpdateProduct(Product product);

    void deleteProduct(Integer id);

    public List<Product> listAllProductsWithDescription(String description);
}




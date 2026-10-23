package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        products.add(new DigitalProduct(nextId++,"E-book",99.9,"/url/",34));
        products.add(new PhysicalProduct(nextId++,"keyboard",234.4,2.9,"2*3*4"));
    }

    public List<Product> getAllProducts(){
        return products;
    }
    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }
    public Optional<Product> getProductById(Long id){
        return products.stream()
                .filter(p ->p.getId().equals (id))
                .findFirst();
    }
    public void deleteProduct(Long id){
        products.removeIf(p ->p.getId ().equals(id));

    }
    public List<Product> findByName(String name){
        return products.stream()
                .filter(p ->p.getName().contains(name))
                .toList();
    }
}

package com.example.Spring.Service;

import com.example.Spring.Model.Product;
import com.example.Spring.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {

    private ProductRepository ProductRepo  ;

    public ProductService(ProductRepository productRepo) {
        ProductRepo = productRepo;
    }
    public List<Product> findAll() {

        return ProductRepo.findAll();
    }
    public Product findById(Long id) {
        return ProductRepo.findById(id).orElse(null);
    }
    public void delete(Long id) {
        ProductRepo.deleteById(id);
    }
    public Product save(Product product) {
        return ProductRepo.save(product);
    }


}

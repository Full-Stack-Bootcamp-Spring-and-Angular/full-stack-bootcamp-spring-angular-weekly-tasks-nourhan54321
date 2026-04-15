package com.example.Spring.Controller;
import com.example.Spring.Model.Product;
import com.example.Spring.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class web {
    public  ProductService productService;

    public web(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/home")
    public List<Product> getAll() {
        return productService.findAll();
    }
    @PostMapping("/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }
    @PostMapping("/")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }
    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Long id) {
        productService.delete(id);
    }
    @PutMapping("update/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        product.setId(id);
        return productService.save(product);
     }

}

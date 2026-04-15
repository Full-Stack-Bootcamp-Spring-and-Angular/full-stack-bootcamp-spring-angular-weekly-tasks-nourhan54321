package com.example.Spring.Repository;

import com.example.Spring.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<Product,Long>{

@Repository
interface ProductRepo extends JpaRepository<Product,Integer>{
}
}

package com.example.ecommerce.dao;

import com.example.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;


//Accept calls from web browser script for this origin
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    // SELECT * FROM product where category_id=?
    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
    // REST automatically exposes endpoint http://localhost:8080/api/products/search/findByCategoryId?id=1

    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}

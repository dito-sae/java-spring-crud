package com.trycode.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trycode.springcrud.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}

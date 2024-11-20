package com.itproject.vn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itproject.vn.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

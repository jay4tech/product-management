package com.tcs.productmanagement.repository;

import com.tcs.productmanagement.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}

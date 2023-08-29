package com.tcs.productmanagement.service;

import com.tcs.productmanagement.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();

    Product saveProduct(Product product);

    Product updateProduct(Long productId);

    void deleteProduct(Long productId);
}

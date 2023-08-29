package com.tcs.productmanagement.service;

import com.tcs.productmanagement.entity.Product;
import com.tcs.productmanagement.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService{

    @Autowired
    IProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        Product productDb = null;
        if (optionalProduct.isPresent()){
            productDb = optionalProduct.get();
            productDb.setName("Changed Name");
            productRepository.save(productDb);
        }
        return productDb;
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}

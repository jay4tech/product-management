package com.tcs.productmanagement.controller;

import com.tcs.productmanagement.entity.Product;
import com.tcs.productmanagement.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "products")
public class ProductController {

    @Autowired
    IProductService productService;


    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PutMapping("/{productId}")
    public Product updateProduct(@PathVariable Long productId){
        return productService.updateProduct(productId);
    }
    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId){
         productService.deleteProduct(productId);
    }
    @GetMapping("/")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

//    POST /products - Add a new product.
//            PUT /products/{productId} - Update product details.
//            DELETE /products/{productId} - Delete a product.
//            GET /products - View product listings.
}

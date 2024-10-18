package com.javatar.taxpayerservice.controller;


import com.javatar.taxpayerservice.domain.Product;
import com.javatar.taxpayerservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("product")
@Tag(name = "Product", description = "Product APIs")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product save(
            @RequestBody Product product) {
        return productService.save(product);

    }

    @GetMapping
    public List<Product> products() {
        return productService.products();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable(value = "id") Long id) {
        return productService.findProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deletedProductById(
            @PathVariable(value = "id") Long id) {
        productService.deletedProductById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable(value = "id") Long id,
            @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

}

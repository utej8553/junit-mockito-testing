package com.example.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product getProduct(int id){
        return productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found"));
    }
}

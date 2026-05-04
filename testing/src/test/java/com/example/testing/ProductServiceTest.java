package com.example.testing;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;
    public ProductServiceTest(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void testGetProduct(){
        Product product = new Product();
        product.setId(1);
        product.setName("Demo");
        when(productRepository.findById(1)).thenReturn(Optional.of(product));
        Product result = productService.getProduct(1);
        assertEquals("Demo", result.getName());
    }
    @Test
    void testGetProductNotFound(){
        when(productRepository.findById(2)).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class, ()->{
            productService.getProduct(2);
        });
    }
}

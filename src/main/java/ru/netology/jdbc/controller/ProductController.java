package ru.netology.jdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository repository;

    public ProductController(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    @GetMapping("/fetch-product")
    public List<String> getProductName(@RequestParam String name) {
        return repository.getProductName(name);
    }
}

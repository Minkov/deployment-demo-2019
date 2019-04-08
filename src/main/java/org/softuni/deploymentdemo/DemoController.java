package org.softuni.deploymentdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    private final ProductsRepository productsRepository;

    public DemoController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping("/api/demo")
    public String getDemo() {
        return "It works";
    }

    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return productsRepository.findAll();
    }
}

package com.example.ec.service;

import com.example.ec.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final String BASE_URL = "https://fakestoreapi.com";
    private final RestTemplate restTemplate = new RestTemplate();

    public List<Product> getAllProducts() {
        Product[] products = restTemplate.getForObject(BASE_URL + "/products", Product[].class);
        return Arrays.asList(products);
    }

    public List<String> getAllCategories() {
        String[] categories = restTemplate.getForObject(BASE_URL + "/products/categories", String[].class);
        return Arrays.asList(categories);
    }

    public Product getProductById(int id) {
        return restTemplate.getForObject(BASE_URL + "/products/" + id, Product.class);
    }

    public List<Product> getProductsByCategory(String category) {
        Product[] products = restTemplate.getForObject(BASE_URL + "/products/category/" + category, Product[].class);
        return Arrays.asList(products);
    }
}

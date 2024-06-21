package br.com.viniciushiga.DIO_DesignPatterns.controllers;

import br.com.viniciushiga.DIO_DesignPatterns.datasource.models.Product;
import br.com.viniciushiga.DIO_DesignPatterns.datasource.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductService service;

    public ProductsController() {
        // Intentionally not implemented
    }

    @GetMapping(value = "/products")
    public List<Product> getDuplicatedProducts() {
        List<Product> result = new ArrayList<>();

        // Duplicando propositalmente...
        result.add(service.getDummyProduct());
        result.add(service.getDummyProduct());

        return result;
    }

}

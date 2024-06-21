package br.com.viniciushiga.DIO_DesignPatterns.datasource.services;

import br.com.viniciushiga.DIO_DesignPatterns.datasource.models.Product;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService {

    private Product mock;

    public ProductService() {
        setupMock();
    }

    public Product getDummyProduct() {
        return mock;
    }

    private void setupMock() {
        mock = new Product(
            UUID.randomUUID().toString(),
            "a1b2c3d4",
            "Product Name",
            100
        );
    }
}

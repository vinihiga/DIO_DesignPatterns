package br.com.viniciushiga.DIO_DesignPatterns.datasource.models;

public class Product {
    private String uuid;
    private String sku;
    private String name;
    private int price; // É sempre uma boa prática usar long int ou int para evitar overflow...

    public Product(
        String uuid,
        String sku,
        String name,
        int price
    ) {
        this.uuid = uuid;
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public String getUuid() {
        return uuid;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

package com.example.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        for (Product product : getProducts()) {
            if (product.getPrice() > 50000f) {
                list.add(product);
            }
        }

        for (Product product: list) {
            System.out.println(product);
        }

        // using stream api to filter
        List<Product> list2 = getProducts()
                .stream().filter((product) -> product.getPrice() > 50000f)
                .collect(Collectors.toList());
        System.out.println(list2);

        // using stream api to filter
      getProducts()
                .stream().forEach((product) -> System.out.println(product.getName()));
    }

    private static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Macbook air", 90000f));
        products.add(new Product(2,"dell", 60000f));
        products.add(new Product(3, "hp", 50000f));
        products.add(new Product(4, "macbook m2", 200000f));
        products.add(new Product(5, "Sony", 18000f));
        return products;
    }
}

class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

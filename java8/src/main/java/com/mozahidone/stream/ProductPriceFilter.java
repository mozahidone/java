package com.mozahidone.stream;

import java.util.*;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class ProductPriceFilter {
    public static void main(String[] args) {
        List<Product> productsList = getData();
        System.out.println("Without stream: " + getProductPriceList(productsList));
        List<Float> priceList = productsList.stream()
                .filter(product -> product.price < 30000)
                .map(product -> product.price)
                .collect(Collectors.toList());
        System.out.println("Using stream: " + priceList);

    }

    public static List<Float> getProductPriceList(List<Product> productsList) {
        List<Float> productPriceList = new ArrayList<Float>();
        for(Product product: productsList){
            if(product.price<30000){
                productPriceList.add(product.price);
            }
        }
        return productPriceList;
    }
    public static List<Product> getData() {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        return productsList;
    }

}
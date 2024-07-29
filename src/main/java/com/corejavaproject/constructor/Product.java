package com.corejavaproject.constructor;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Product {
    public static final String CATEGORY = "Sale";

    private int productId;
    private String productName;

    /**
     * Default constructor
     */
    public Product(){
        this.productId = 6;
        this.productName = "Toy";
    }

    /**
     * Parameterized constructor
     */

    public Product(int id, String name){
        this.productId = id;
        this.productName = name;
    }

    public static void main(String[] args){
        log.info(Product.CATEGORY);

        Product product = new Product();
        log.info("Product id:{}, and Product name:{}", product.productId, product.productName);

        Product product1 = new Product(8, "Vegetables");
        log.info("Product id:{}, and Product name:{}", product1.productId, product1.productName);
    }
}

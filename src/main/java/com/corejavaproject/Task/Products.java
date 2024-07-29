package com.corejavaproject.Task;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Products {
    private int productId;
    private String productName;
    private int noOfProducts;
    private Category category;

    public Products(int productId, String productName, int noOfProducts, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.noOfProducts = noOfProducts;
        this.category = category;
    }

    public void getProductDetails() {
        log.info("Product details are ProductId:{} and ProductName:{} and NoOfProducts:{}", productId, productName, noOfProducts);
        category.getCategory();
    }
}

package com.corejavaproject.Task;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ProductMain {
    public static void main(String[] args) {
        Category category = new Category(true, true, false);
        Products products = new Products(22, " Cheese ", 50, category);
        products.getProductDetails();
    }
}

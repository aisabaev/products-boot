package com.example.products_boot.exceptions;

public class ProductCreateException extends Exception {
    public ProductCreateException() {
        super("Не удалось создать продукта!");
    }
}

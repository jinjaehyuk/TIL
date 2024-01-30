package com.example.domain;

import java.io.Serializable;

public class Product implements Serializable {

    private int productNum;
    private String productName;
    private int productPrice;
    private int productCnt;

    public Product(int productNum, String productName, int productPrice, int productCnt) {
        this.productNum = productNum;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCnt = productCnt;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductCnt() {
        return productCnt;
    }

    public void setProductCnt(int productCnt) {
        this.productCnt = productCnt;
    }

    @Override
    public String toString() {
        return productNum
                + " " + productName
                + " " + productPrice
                + " " + productCnt
                + "\n";
    }
}

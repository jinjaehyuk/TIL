package com.example.service;

import com.example.domain.Product;

import java.util.Iterator;
import java.util.List;

public interface VendingMachineAdminService {

    //상품 등록
    public void addProduct(Product product);

    //상품 수정
    public boolean updateProduct(Product product);
    //상품 삭제
    public boolean delProduct(int productNum);

    public boolean exists(int productNum);

    //상품보기
    public List<Product> getUsers();
}

package com.example.service;

import com.example.domain.Product;

import java.util.Iterator;
import java.util.List;

public class VendingMachineAdminServiceImpl implements VendingMachineAdminService{

    private List<Product> products;


    public VendingMachineAdminServiceImpl(List<Product> products) {
        this.products = products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public boolean updateProduct(Product product) {
        boolean deleteFlag = delProduct(product.getProductNum() );
        if(deleteFlag){
            products.add(product);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean delProduct(int productNum) {
        int findIndex = findIndex(productNum);

        if(findIndex > -1){
            products.remove(findIndex);
            return true;
        }else {
            return false;
        }
    }

    private int findIndex(int productNum) {
        int findIndex = -1;
        for(int i =0; i < products.size(); i++){
            if(products.get(i).getProductNum() == productNum){
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }

    public boolean exists(int productNum){
        if(findIndex(productNum) >= 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Product> getUsers() {
        return products;
    }
}

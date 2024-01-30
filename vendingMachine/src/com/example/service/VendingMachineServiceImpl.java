package com.example.service;

import com.example.domain.Product;

import java.util.Iterator;
import java.util.List;

public class VendingMachineServiceImpl implements VendingMachineService {
    private List<Product> products;


    public VendingMachineServiceImpl(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Product> getUsers() {
        return products;
    }
}

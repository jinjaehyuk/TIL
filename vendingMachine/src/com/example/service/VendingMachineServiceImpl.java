package com.example.service;

import com.example.domain.Money;
import com.example.domain.Product;
import java.util.List;

public class VendingMachineServiceImpl implements VendingMachineService {
    private List<Product> products;
    private Money money;

    public VendingMachineServiceImpl(List<Product> products) {
        this.products = products;
    }

    public VendingMachineServiceImpl(List<Product> products, Money money) {
        this.products = products;
        this.money = money;
    }

    @Override
    public int insertTotalMoney(int insertMoney) {
        money.setMoney(money.getMoney() + insertMoney);
        money.setTailMoney(money.getTailMoney() + insertMoney);
        return money.getMoney();
    }

    @Override
    public int showTailMoney() {
        return money.getTailMoney();
    }

    @Override
    public int returnTailMoney() {
        int returnMoney = money.getTailMoney();
        money.setTailMoney(0);
        return returnMoney;
    }
    @Override
    public List<Product> getUsers() {
        return products;
    }

    @Override
    public boolean updateProductCnt(int productNum) {
        int tailMoney = money.getTailMoney();
        int findIndex = findIndex(productNum);
        Product product = products.get(findIndex);
        //잔돈여부 확인
        if(tailMoney < product.getProductPrice()){
            System.out.println("금액이 부족합니다.. 금액을 더 입력해주세요");
            return false;
        }else{
            Product updateProduct = new Product(product.getProductNum(),product.getProductName(), product.getProductPrice(),product.getProductCnt()-1);
            money.setTailMoney(tailMoney - product.getProductPrice() );
            boolean deleteFlag = delProduct(product.getProductNum() );
            if(deleteFlag){
                products.add(updateProduct);
                return true;
            }else{
                return false;
            }
        }
    }

    private boolean delProduct(int productNum) {
        int findIndex = findIndex(productNum);

        if(findIndex > -1){
            products.remove(findIndex);
            return true;
        }else {
            return false;
        }
    }
    private int findIndex(int productId) {
        int findIndex = -1;
        for(int i =0; i < products.size(); i++){
            if(products.get(i).getProductNum() == productId){
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }
}

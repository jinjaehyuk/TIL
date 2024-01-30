package com.example.service;

import com.example.domain.Product;

import java.util.Iterator;
import java.util.List;

public interface VendingMachineService {

    //금액 입력
    public int insertTotalMoney(int insertMoney);

    //잔돈보기
    public int showTailMoney();
    //잔돈반환
    public int returnTailMoney();
    public List<Product> getUsers();

    public boolean updateProductCnt(int productNum);
}

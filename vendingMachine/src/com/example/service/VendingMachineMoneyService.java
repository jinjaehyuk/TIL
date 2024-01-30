package com.example.service;

public interface VendingMachineMoneyService {

    //금액 입력
    public int insertTotalMoney(int insertMoney);

    //잔돈보기
    public int showTailMoney();
    //잔돈반환
    public int returnTailMoney();
}

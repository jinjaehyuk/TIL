package com.example.service;

import com.example.domain.Money;

public class VendingMachineMoneyServiceImpl implements VendingMachineMoneyService {

    private Money money;

    public VendingMachineMoneyServiceImpl(Money money) {
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
}

package com.example.domain;

public class Money {

    private int money;
    private int tailMoney;

    public Money() {
    }

    public Money(int money) {
        this.money = money;
        this.tailMoney = money;
    }

    public Money(int money, int tailMoney){
        this.money = money;
        this.tailMoney = tailMoney;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTailMoney() {
        return tailMoney;
    }

    public void setTailMoney(int tailMoney) {
        this.tailMoney = tailMoney;
    }

    @Override
    public String toString() {
        return "Money{" +
                "money=" + money +
                ", tailMoney=" + tailMoney +
                '}';
    }
}

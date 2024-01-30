package com.example.ui;

import com.example.domain.Product;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class VendingMachineUI {

    private BufferedReader br;

    public VendingMachineUI() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu(){
        System.out.println("1. 메뉴선택");
        System.out.println("2. 금액입력");
        System.out.println("3. 잔액받기");
        System.out.println("4. 잔액보기");
        System.out.println("5. 종료");
        int menuId = -1;
        try{
            String line = br.readLine();
            menuId = Integer.parseInt(line);
        }catch(Exception e){
            e.printStackTrace();
        }
        return menuId;
    }

    public int insertMoney(){
        System.out.print("금액을 입력하세요 : ");
        int money = 0;
        try{
            String line = br.readLine();
            money = Integer.parseInt(line);
        }catch(Exception e){
            e.printStackTrace();
        }
        return money;
    }

    public void showTailMoneyUi(int showTailMoney){
        System.out.println("현재 잔액은 : "+showTailMoney+"원 입니다.");
    }
    public void returnTailMoneyUi(int showTailMoney){
        System.out.println(showTailMoney + "원의 금액을 반환하였습니다.");
    }

    public void printUserList(List<Product> products){
        System.out.println("번호\t\t\t이름\t\t\t가격\t\t\t남은수량");
        System.out.println("========================================");
        for(Product product : products){
            System.out.print(product.getProductNum()+"\t\t\t");
            System.out.print(product.getProductName()+"\t\t");
            System.out.print(product.getProductPrice()+"\t\t");
            System.out.print(product.getProductCnt());
            System.out.println();
        }
    }

}

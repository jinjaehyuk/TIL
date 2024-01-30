package com.example.ui;

import com.example.domain.Product;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VendingMachineAdminUI {

    private BufferedReader br;

    public VendingMachineAdminUI() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }


    public int adminPassword(){
        System.out.print("관리자비밀번호를 입력하세요 : ");
        int pass = 0;
        try{
            String line = br.readLine();
            pass = Integer.parseInt(line);
        }catch(Exception e){
            System.out.println("숫자만 입력해주세요");
        }
        return pass;
    }
    public int adminMenu(){
        System.out.println("1. 상품입력");
        System.out.println("2. 상품수정");
        System.out.println("3. 상품삭제");
        System.out.println("4. 종료");
        int menuId = -1;
        try{
            String line = br.readLine();
            menuId = Integer.parseInt(line);
        }catch(Exception e){
            e.printStackTrace();
        }
        return menuId;
    }

    public Product addProduct(){
        try{
            System.out.println("상품번호를 입력하세요.");
            int menuNum = Integer.parseInt(br.readLine());
            System.out.println("상품명을 입력하세요");
            String name = br.readLine();
            System.out.println("금액을 입력하세요");
            int price = Integer.parseInt(br.readLine());
            System.out.println("수량을 입력하세요");
            int cnt = Integer.parseInt(br.readLine());

            Product product = new Product(menuNum,name, price, cnt);
            return product;
        }catch (Exception e){
            return null;
        }
    }

    public int delProduct(){
        System.out.print("삭제(수정)할 상품번호를 입력하세요. : ");
        int productNum = 0;
        try{
            productNum = Integer.parseInt(br.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }
        return productNum;
    }


    public Product updProduct(int productNum){
        try{
            System.out.println(productNum + "번의 상품을 수정합니다.");
            System.out.println("상품명을 입력하세요");
            String name = br.readLine();
            System.out.println("금액을 입력하세요");
            int price = Integer.parseInt(br.readLine());
            System.out.println("수량을 입력하세요");
            int cnt = Integer.parseInt(br.readLine());

            Product product = new Product(productNum,name, price, cnt);
            return product;
        }catch (Exception e){
            return null;
        }
    }
}

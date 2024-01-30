package com.example.repository;

import com.example.domain.Product;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductDao {

    private String filename;

    public ProductDao(String filename) {
        this.filename = filename;
    }

    public void saveProduct(List<Product> products){
        try{
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename),StandardCharsets.UTF_8));
            String content = "";
            for(Product product : products){
                content += product.toString();
            }
            bw.write(content);
            bw.flush();
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("파일쓰기 실패");
        }
    }
    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), StandardCharsets.UTF_8));
            String line;
            while((line = br.readLine())!= null){
                String[] items = line.split(" ");
                if(items.length == 4){
                    Product product = new Product(Integer.parseInt(items[0]),items[1],Integer.parseInt(items[2]),Integer.parseInt(items[3]));
                    products.add(product);
                }
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        return products;
    }
}

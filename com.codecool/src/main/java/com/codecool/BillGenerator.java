package com.codecool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BillGenerator {
    Map<String, Map<Integer, Float>> discountMap;
    String fileFromCashDesk;


    public BillGenerator(String fileWithDiscount, String fileFromCashDesk) {
        this.discountMap = readDiscountFromFile(fileWithDiscount);
        this.fileFromCashDesk = fileFromCashDesk;
    }

    private Map<String,Map<Integer,Float>> readDiscountFromFile(String fileWithDiscount) {
        Map<String, Map<Integer, Float>> discountMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileWithDiscount))) {
            br.readLine();//readsHeader;
            String line;
            while ((line = br.readLine()) != null) {
                String[] item = line.split(", ");
                discountMap.putIfAbsent(item[0], new HashMap<>());
                discountMap.get(item[0]).putIfAbsent(Integer.valueOf(item[2]), Float.valueOf(item[3]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return discountMap;

    }


    public static void main(String[] args) {
        String fileWithDiscount = args[0];
        String fileFromCashDesk = args[1];
        BillGenerator bg = new BillGenerator(fileWithDiscount, fileFromCashDesk);
        int bill = bg.generateBill();
        //System.out.println("The total price is:" + bill + "EUR");

    }

    private int generateBill() {
     //   readDiscountFromFile();
//        sumBillQuantity();
//        countTheMoney();
        return 0;
    }
}

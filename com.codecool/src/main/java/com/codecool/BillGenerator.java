package com.codecool;

public class BillGenerator {

    public static void main(String[] args) {
        String fileWithDiscount = args[0];
        String fileFromCashDesk = args[1];
        BillGenerator bg = new BillGenerator(fileWithDiscount, fileFromCashDesk);
        //int bill = bg.generateBill();
        //System.out.println("The total price is:" + bill + "EUR");

    }
}

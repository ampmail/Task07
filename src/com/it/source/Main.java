package com.it.source;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        String casualAmountOfMoney = "4.9";
        String result = "There are no profit!";

//        System.out.println(new BigDecimal("1").compareTo(new BigDecimal(10)));
        try {
            Controller.checkIncomingData(casualAmountOfMoney);
            result = Controller.calculateIncome(casualAmountOfMoney);
        } catch (MyIllegalArgumentException e) {
            System.out.println("Abnormal program stop");
        } catch (MyArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println(result);
        }
    }
}
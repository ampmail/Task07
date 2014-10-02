package com.it.source;

public class Main {

    public static void main(String[] args) {

        String casualAmountOfMoney = "01.00";
        String result = "There are no profit!";

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
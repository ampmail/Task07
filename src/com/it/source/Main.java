package com.it.source;

public class Main {

    public static void main(String[] args) {

        String casualAmountOfMoney = "";

        try{
            Controller.checkIncomingData(casualAmountOfMoney);
        }catch (MyIllegalArgumentException e){

        }
//        if(Controller.checkIncomingData(casualAmountOfMoney)){
//            System.out.println(Controller.calculateIncome(casualAmountOfMoney));
//        }
    }
}
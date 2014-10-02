package com.it.source;

public class MyIllegalArgumentException extends Exception{
    MyIllegalArgumentException(){
        System.out.println("Something going wrong");
    }
    MyIllegalArgumentException(String msg){
        System.out.println(msg);
    }
}
